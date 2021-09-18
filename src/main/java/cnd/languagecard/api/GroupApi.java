package cnd.languagecard.api;

import cnd.languagecard.dto.group.GroupRequest;
import cnd.languagecard.dto.group.GroupResponse;
import cnd.languagecard.service.GroupService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group")
@Api(value = "Group API")
public class GroupApi {

    @Autowired
    private GroupService service;

    @GetMapping
    public ResponseEntity<List<GroupResponse>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<GroupResponse> create(@RequestBody() GroupRequest model){
        GroupResponse dto = service.create(model);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping("{id}")
    public ResponseEntity<GroupResponse> update(@RequestBody() GroupRequest model, @PathVariable("id") Long id){
        GroupResponse result = service.update(model,id);
        return ResponseEntity.ok(result);
    }
}
