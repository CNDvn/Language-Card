package cnd.englishcard.converter;

import cnd.englishcard.dto.GroupDto;
import cnd.englishcard.entity.GroupEntity;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class GroupConverter {
    public GroupEntity toEntity(GroupDto dto){
        GroupEntity entity = new GroupEntity();
        entity.setName(dto.getName());
        return entity;
    }

    public GroupDto toDto(GroupEntity entity){
        GroupDto dto = new GroupDto();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }
}
