package org.example.planeapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.planeapp.dto.UnivercityGroupDto;
import org.example.planeapp.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/groups")
public class GroupController {

    private final GroupService groupService;

   @PostMapping("/")
    public void addGroup(@RequestBody UnivercityGroupDto univercityGroupDto) {
        groupService.addGroup(univercityGroupDto);
    }

    @GetMapping("/{groupId}")
    public UnivercityGroupDto findGroupById(@PathVariable int groupId) {
     UnivercityGroupDto univercityGroupDto = groupService.findUnivercityGroupById(groupId);
     return univercityGroupDto;
    }

    @GetMapping("/")
    public List<UnivercityGroupDto> findAllGroups() {
     List<UnivercityGroupDto> allunivercityGroupDto = groupService.findAllGroups();
     return allunivercityGroupDto;

    }

}
