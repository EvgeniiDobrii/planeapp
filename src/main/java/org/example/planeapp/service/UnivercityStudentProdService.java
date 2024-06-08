package org.example.planeapp.service;

import lombok.RequiredArgsConstructor;
import org.example.planeapp.dto.UnivercityStudentDto;
import org.example.planeapp.entity.UnivercityGroup;
import org.example.planeapp.entity.UnivercityStudent;
import org.example.planeapp.repository.UnivercityStudentRepository;
import org.example.planeapp.repository.UniversityGroupRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@ConditionalOnProperty(value = "prod.mode", havingValue = "true")
public class UnivercityStudentProdService implements StudentService{

    private final UnivercityStudentRepository univercityStudentRepository;
    private final UniversityGroupRepository universityGroupRepository;


    @Override
    public void addUnivercityStudentByGroupNumber(UnivercityStudentDto univercityStudentDto, String groupNumber) {
      UnivercityGroup univercityGroup = universityGroupRepository.findUnivercityGroupByGroupNumber(groupNumber);
      UnivercityStudent univercityStudent = new UnivercityStudent();
      univercityStudent.setId(univercityStudentDto.getId());
      univercityStudent.setSurname(univercityStudentDto.getSurname());
      univercityStudent.setUnivercityGroup(univercityGroup);
      univercityStudentRepository.save(univercityStudent);
    }
}
