package cnd.englishcard.api;

import cnd.englishcard.dto.GroupDto;
import cnd.englishcard.entity.GroupEntity;
import cnd.englishcard.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class GroupApi {

    @Autowired
    private GroupService service;

    @GetMapping
    public ResponseEntity<List<GroupDto>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<GroupDto> create(@RequestBody() GroupDto model){
        GroupDto dto = service.create(model);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping("{id}")
    public ResponseEntity<GroupDto> update(@RequestBody() GroupDto model, @PathVariable("id") Long id){
        GroupDto result = service.update(model,id);
        return ResponseEntity.ok(result);
    }
}
