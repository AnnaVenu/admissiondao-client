package com.student.admission.client.admissionclient.controller;

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
	public ResponseEntity<StudentVO> getDetailsByStudentRollNo(@PathVariable("sRollNo") String sRollNo) {
		/*
		 * List<StudentVO> studentDetails = studentService.getStudentDetails(sRollNo);
		 */
		

		String baseUrl = "http://localhost:9090/student/getByRollNo" + "/" + sRollNo;
		StudentVO response = null;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<StudentVO> responseEntity = null;
		responseEntity = restTemplate.exchange(baseUrl, HttpMethod.GET, null, StudentVO.class);
		response = responseEntity.getBody();
		return new ResponseEntity<StudentVO>(response, HttpStatus.OK);
	}
}
