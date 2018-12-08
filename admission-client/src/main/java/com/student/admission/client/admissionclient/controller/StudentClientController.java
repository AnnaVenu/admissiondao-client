package com.student.admission.client.admissionclient.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.admission.client.admissionclient.vo.StudentVO;

@RestController
@RequestMapping(value = "/studentClient")
public class StudentClientController {

	@GetMapping(value = "/getDetailsStudent/{sRollNo}")
	public ResponseEntity<List<StudentVO>> getDetailsByStudentRollNo(@PathVariable("sRollNo") String sRollNo) {
		/*List<StudentVO> studentDetails = studentService.getStudentDetails(sRollNo);*/
		
		
		String baseUrl = "http://localhost:9090/saveStudentDetails/getByRollNo" + "/" + sRollNo;
		List<StudentVO> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<StudentVO>> responseEntity = null;
		responseEntity = restTemplate.exchange(baseUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentVO>>() {
				});
		response = responseEntity.getBody();
		return new ResponseEntity<List<StudentVO>>(response, HttpStatus.OK);
	}
}
