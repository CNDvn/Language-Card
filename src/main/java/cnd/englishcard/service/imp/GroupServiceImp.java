package cnd.englishcard.service.imp;

import cnd.englishcard.converter.GroupConverter;
import cnd.englishcard.dto.GroupDto;
import cnd.englishcard.entity.GroupEntity;
import cnd.englishcard.exception.NotFoundException;
import cnd.englishcard.repository.GroupRepositoty;
import cnd.englishcard.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GroupServiceImp implements GroupService {
    @Autowired
    private GroupRepositoty repositoty;

    @Autowired
    private GroupConverter converter;

    @Override
    public List<GroupDto> getAll() {
        List<GroupEntity> list = repositoty.findAll();
        List<GroupDto> listDto = new ArrayList<>();
        for (GroupEntity entity : list) {
            GroupDto dto = converter.toDto(entity);
            listDto.add(dto);
        }
        return listDto;
    }

    @Override
    public GroupDto create(GroupDto dto) {
        GroupEntity entity = converter.toEntity(dto);
        entity.setCreateDate(new Date());
        return converter.toDto(repositoty.save(entity));
    }

    @Override
    public GroupDto update(GroupDto dto, Long id) {
        GroupEntity entityInDB = repositoty.findById(id).orElseThrow(() -> new NotFoundException("Id khong ton tai"));
        entityInDB.setName(dto.getName());
        return converter.toDto(repositoty.save(entityInDB));
    }
}
