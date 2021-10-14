package cnd.languagecard.repository;

import cnd.languagecard.entity.UserGroupEntity;
import cnd.languagecard.entity.UserGroupId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroupEntity, UserGroupId> {

}
