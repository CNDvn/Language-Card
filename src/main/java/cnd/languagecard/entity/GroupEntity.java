package cnd.languagecard.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_group")
public class GroupEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Date createDate;
    @OneToMany(mappedBy = "group")
    private Set<WordEntity> words = new HashSet<>();
    @OneToMany(mappedBy = "group")
    private Set<UserGroupEntity> users = new HashSet<>();
}
