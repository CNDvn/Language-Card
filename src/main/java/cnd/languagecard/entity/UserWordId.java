package cnd.languagecard.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class UserWordId implements Serializable {
    private UserEntity user;
    private WordEntity word;
}
