package com.student.admission.client.admissionclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.admission.client.admissionclient.mapper.AdminClientMapper;
import com.student.admission.client.admissionclient.vo.StudentVO;

public class StudentService {
	
	@Autowired
	AdminClientMapper adminClientMapper;

	public List<StudentVO> getStudentDetails(String sRollNo) {
		
		return null;
	}

}
