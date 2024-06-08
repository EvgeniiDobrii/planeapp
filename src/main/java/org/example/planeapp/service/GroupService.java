package org.example.planeapp.service;

import org.example.planeapp.dto.UnivercityGroupDto;
import org.example.planeapp.entity.UnivercityGroup;

import java.util.List;

public interface GroupService {

    void addGroup(UnivercityGroupDto universityGroupDto);

    UnivercityGroupDto findUnivercityGroupById(int groupId);

    List<UnivercityGroupDto> findAllGroups();

}
