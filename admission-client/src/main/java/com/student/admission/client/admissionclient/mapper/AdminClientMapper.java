package com.student.admission.client.admissionclient.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.student.admission.client.admissionclient.entity.Student;
import com.student.admission.client.admissionclient.vo.StudentVO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminClientMapper {

	public static AdminClientMapper CLIENT_MAPPER = Mappers.getMapper(AdminClientMapper.class);

	public StudentVO entityToVo(Student student);

	public Student voToEntity(StudentVO studentVO);

	public List<StudentVO> listOfEntitiesToVo(List<Student> students);

	public List<Student> listOfVoToEntity(List<StudentVO> studentVOs);

}
