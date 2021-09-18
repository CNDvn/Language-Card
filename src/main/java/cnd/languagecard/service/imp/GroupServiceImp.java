package cnd.languagecard.service.imp;

import cnd.languagecard.converter.GroupConverter;
import cnd.languagecard.dto.group.GroupRequest;
import cnd.languagecard.dto.group.GroupResponse;
import cnd.languagecard.entity.GroupEntity;
import cnd.languagecard.exception.NotFoundException;
import cnd.languagecard.repository.GroupRepositoty;
import cnd.languagecard.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImp implements GroupService {
    @Autowired
    private GroupRepositoty repositoty;

    @Autowired
    private GroupConverter converter;

    @Override
    public List<GroupResponse> getAll() {
        List<GroupEntity> list = repositoty.findAll();
        List<GroupResponse> listDto = new ArrayList<>();
        for (GroupEntity entity : list) {
            GroupResponse dto = converter.toDto(entity);
            listDto.add(dto);
        }
        return listDto;
    }

    @Override
    public GroupResponse create(GroupRequest model) {
        GroupEntity entity = new GroupEntity();
        entity.setName(model.getName());
        return converter.toDto(repositoty.save(entity));
    }

    @Override
    public GroupResponse update(GroupRequest model, Long id) {
        GroupEntity entityInDB = repositoty.findById(id).orElseThrow(() -> new NotFoundException("Id khong ton tai"));
        entityInDB.setName(model.getName());
        return converter.toDto(repositoty.save(entityInDB));
    }
}
