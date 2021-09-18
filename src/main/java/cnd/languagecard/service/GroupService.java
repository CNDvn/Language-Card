package cnd.languagecard.service;

import cnd.languagecard.dto.group.GroupRequest;
import cnd.languagecard.dto.group.GroupResponse;

import java.util.List;

public interface GroupService {
    public List<GroupResponse> getAll();
    public GroupResponse create(GroupRequest model);
    public GroupResponse update(GroupRequest model, Long id);
}
