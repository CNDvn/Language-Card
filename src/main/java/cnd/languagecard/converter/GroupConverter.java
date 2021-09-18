package cnd.languagecard.converter;

import cnd.languagecard.dto.group.GroupResponse;
import cnd.languagecard.entity.GroupEntity;
import org.springframework.stereotype.Component;

@Component
public class GroupConverter {
    public GroupEntity toEntity(GroupResponse dto){
        GroupEntity entity = new GroupEntity();
        entity.setName(dto.getName());
        return entity;
    }

    public GroupResponse toDto(GroupEntity entity){
        GroupResponse dto = new GroupResponse();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }
}
