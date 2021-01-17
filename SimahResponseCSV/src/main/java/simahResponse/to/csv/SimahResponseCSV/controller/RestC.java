package simahResponse.to.csv.SimahResponseCSV.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import simahResponse.to.csv.SimahResponseCSV.service.SimahService;

@Controller
@RequestMapping("/simah")
public class RestC {

	@Autowired
	SimahService simahService;
	
	@GetMapping(value = "/responseToCSV")
	public ResponseEntity<Object> simahXmlResponseToCSV(){
		return simahService.simahXmlResponseToCSV();
	}
	
}
