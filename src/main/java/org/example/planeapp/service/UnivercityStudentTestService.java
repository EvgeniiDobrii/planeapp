package org.example.planeapp.service;

import lombok.RequiredArgsConstructor;
import org.example.planeapp.dto.UnivercityStudentDto;
import org.example.planeapp.entity.UnivercityGroup;
import org.example.planeapp.entity.UnivercityStudent;
import org.example.planeapp.repository.UnivercityStudentRepository;
import org.example.planeapp.repository.UniversityGroupRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Profile("student_test")
@ConditionalOnProperty(value = "student.test.mode", havingValue = "false")
public class UnivercityStudentTestService implements StudentService{

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