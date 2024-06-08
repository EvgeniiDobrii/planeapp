package org.example.planeapp.repository;

import org.example.planeapp.entity.UnivercityGroup;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityGroupRepository extends JpaRepository<UnivercityGroup, Integer> {

  UnivercityGroup findUnivercityGroupById(int id);

    List<UnivercityGroup> findAll();


    UnivercityGroup findUnivercityGroupByGroupNumber(String groupNumber);


}
