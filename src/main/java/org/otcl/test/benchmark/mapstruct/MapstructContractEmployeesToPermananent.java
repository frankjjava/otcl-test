package org.otcl.test.benchmark.mapstruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import benchmark.test.ContractEmployees;
import benchmark.test.PermanentEmployee;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapstructContractEmployeesToPermananent {
	
	@BeanMapping(ignoreByDefault = true)
	@Mapping(source = "employees.employeeName", target = "employeeName")
	PermanentEmployee convertContractToPermanent(ContractEmployees contractEmployees);
}
