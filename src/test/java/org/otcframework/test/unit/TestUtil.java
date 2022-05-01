package org.otcframework.test.unit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.FactoryConfigurationError;

import org.apache.commons.io.IOUtils;
import org.otcframework.common.config.OtcConfig;

import com.kronos.airlines.dto.KronosAirlinePassenger;

public class TestUtil {
	
    public static final Path EXPECTED_RESULT_PATH = Paths.get(OtcConfig.getTestCaseExpectedResultLocation());

	private static final String OTC_HOME = OtcConfig.getOtcHomeLocation();

	protected static KronosAirlinePassenger loadKronosXml() {
		KronosAirlinePassenger kronosAirlinePassenger = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(KronosAirlinePassenger.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String fileName = OTC_HOME + File.separator + "test-samples" + File.separator + "Kronos-passenger-map.xml";
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			kronosAirlinePassenger = (KronosAirlinePassenger) unmarshaller.unmarshal(reader); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return kronosAirlinePassenger;
	}
	
    public static String jaxbObjectToXML(Object jaxbObject)  {
    	String xml = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(jaxbObject.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(jaxbObject, stringWriter);
			xml = stringWriter.toString();
		} catch (JAXBException | FactoryConfigurationError e) {
			e.printStackTrace();
		}
		return xml;
	}

    public static String getTestCase(String testcaseFilePath){
        try {
            FileInputStream fis = new FileInputStream(EXPECTED_RESULT_PATH.resolve(testcaseFilePath).toString());
            return IOUtils.toString(fis, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}