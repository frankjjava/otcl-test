package org.otcframework.test.unit;

import javax.xml.transform.Source;

import org.junit.jupiter.api.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.util.OtcUtils;
import org.otcframework.core.engine.compiler.OtclCompiler;
import org.otcframework.core.engine.compiler.OtclCompilerImpl;
import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
import org.otcframework.executor.OtcRegistry;
import org.otcframework.executor.OtcRegistryImpl;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonListener;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.DOMDifferenceEngine;
import org.xmlunit.diff.DifferenceEngine;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;


public class OtcTest {

	/** The Constant otclCompiler. */
	private static final OtclCompiler otclCompiler = OtclCompilerImpl.getInstance();
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.instance;
	
	/** The Constant otcExecutor. */
	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

	private static enum OTCL_COMMAND_TYPE {
		FROM_VALUES, 
		FROM_SOURCE_OBJECT  
	}
	
	// - set 'otclCommandType' to OTCL_COMMAND_TYPE.FROM_VALUES when the OTC file has 'from: values:' only and does 
	//    not have even a single reference to a source object
	// 
	//   set 'otclCommandType' to  OTCL_COMMAND_TYPE.FROM_SOURCE_OBJECT when the OTC file has references to a source object 
	//    with or without 'from: values:'.
	

	@Test
	public void runTest() {

 		compileAndRegister();
		
		OTCL_COMMAND_TYPE otclCommandType;
		String pkg = null; 
		String otclFile = null;
		AthenaAirlinePassenger airlinePassenger = null;
		String otcExpectedResultFile = null;
		
//		otclCommandType = OTCL_COMMAND_TYPE.FROM_VALUES;
		otclCommandType = OTCL_COMMAND_TYPE.FROM_SOURCE_OBJECT;
		pkg = "execute";
		
 		if (otclCommandType == OTCL_COMMAND_TYPE.FROM_VALUES) {
 			airlinePassenger = otcExecutor.execute(pkg, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		} else if (otclCommandType == OTCL_COMMAND_TYPE.FROM_SOURCE_OBJECT) {
 			KronosAirlinePassenger kronosAirlinePassenger = (KronosAirlinePassenger) TestUtil.loadKronosXml();
 			airlinePassenger = otcExecutor.execute(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, 
 					AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		}
		//-- compare results.
		System.out.println("\n\nResults for OTCL file: " + otclFile);
		String result = TestUtil.jaxbObjectToXML(airlinePassenger); 
		System.out.println("\n" + result);
		
//		verify(otcExpectedResultFile, result);

	}
 	
	private void compileAndRegister() {
		// -- compile script and generate source code
		otclCompiler.compile();
		otclCompiler.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otcRegistry.register();
	}
	
	private void verify(String compareWithFileName, String actualResult) {
		String expected = TestUtil.getTestCase(compareWithFileName);
		Source control = Input.fromString(expected).build();

		Source test = Input.fromString(actualResult).build();
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
//	            TODO
	        }
	    });
		diff.compare(control, test);
	}
}