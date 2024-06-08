package org.example.planeapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.planeapp.dto.UnivercityStudentDto;
import org.example.planeapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/{groupNumber}")
    public void addUnivercityStudentByGroupNumber(@RequestBody UnivercityStudentDto univercityStudentDto,
                                                    @PathVariable String groupNumber){
     studentService.addUnivercityStudentByGroupNumber(univercityStudentDto, groupNumber);
    }
}
