package org.example.planeapp.service;

import lombok.RequiredArgsConstructor;
import org.example.planeapp.dto.UnivercityGroupDto;
import org.example.planeapp.dto.UnivercityStudentDto;
import org.example.planeapp.entity.UnivercityGroup;
import org.example.planeapp.repository.UniversityGroupRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
//@Qualifier
//@Profile("group_prod")
//@ConditionalOnProperty(value = "prod.mode", havingValue = "true")
public class UnivercityGroupProdService implements GroupService {

    private final UniversityGroupRepository univercityGroupRepository;

    @Override
    public void addGroup(UnivercityGroupDto univercityGroupDto) {
        UnivercityGroup univercityGroup = new UnivercityGroup();
        univercityGroup.setId(univercityGroupDto.getId());
        univercityGroup.setGroupNumber(univercityGroupDto.getGroupNumber());
        univercityGroupRepository.save(univercityGroup);
    }

    @Override
    public UnivercityGroupDto findUnivercityGroupById(int groupId) {
        UnivercityGroupDto univercityGroupDto = new UnivercityGroupDto();
        UnivercityGroup univercityGroup = univercityGroupRepository.findUnivercityGroupById(groupId);
        univercityGroupDto.setId(univercityGroup.getId());
        univercityGroupDto.setGroupNumber(univercityGroup.getGroupNumber());
        univercityGroupDto.setStudentQuantity(univercityGroup.getStudents().size());
        return univercityGroupDto;
    }

    @Override
    public List<UnivercityGroupDto> findAllGroups() {
        List<UnivercityGroupDto> allUnivercityGroupsDto = new ArrayList<>();
        List<UnivercityGroup> allUnivercityGroups = univercityGroupRepository.findAll();

        for (int i = 0; i < allUnivercityGroups.size(); i++) {
            allUnivercityGroupsDto.add(new UnivercityGroupDto());
            allUnivercityGroupsDto.get(i).setId(allUnivercityGroups.get(i).getId());
            allUnivercityGroupsDto.get(i).setGroupNumber(allUnivercityGroups.get(i).getGroupNumber());
            allUnivercityGroupsDto.get(i).setStudentQuantity(allUnivercityGroups.get(i).getStudents().size());
        }
        return allUnivercityGroupsDto;
    }


}
