package cnd.languagecard.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class UserGroupId implements Serializable {
    private UserEntity user;
    private GroupEntity group;
}
