package cnd.languagecard.repository;

import cnd.languagecard.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepositoty extends JpaRepository<GroupEntity, Long> {
}
