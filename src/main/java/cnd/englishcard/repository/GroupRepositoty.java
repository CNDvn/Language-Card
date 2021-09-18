package cnd.englishcard.repository;

import cnd.englishcard.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepositoty extends JpaRepository<GroupEntity, Long> {
}
