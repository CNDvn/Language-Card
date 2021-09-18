package cnd.englishcard.service;

import cnd.englishcard.dto.GroupDto;

import java.util.List;

public interface GroupService {
    public List<GroupDto> getAll();
    public GroupDto create(GroupDto dto);
    public GroupDto update(GroupDto dto, Long id);
}
