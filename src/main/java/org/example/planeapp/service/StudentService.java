package org.example.planeapp.service;

import org.example.planeapp.dto.UnivercityStudentDto;

public interface StudentService {

    void addUnivercityStudentByGroupNumber(UnivercityStudentDto univercityStudentDto, String groupNumber);
}
