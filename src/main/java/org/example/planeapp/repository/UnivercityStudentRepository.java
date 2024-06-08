package org.example.planeapp.repository;

import org.example.planeapp.dto.UnivercityStudentDto;
import org.example.planeapp.entity.UnivercityStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnivercityStudentRepository extends JpaRepository<UnivercityStudent, Integer> {

}
