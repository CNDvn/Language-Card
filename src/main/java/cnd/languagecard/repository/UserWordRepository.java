package cnd.languagecard.repository;

import cnd.languagecard.entity.UserWordEntity;
import cnd.languagecard.entity.UserWordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWordRepository extends JpaRepository<UserWordEntity, UserWordId> {
}
