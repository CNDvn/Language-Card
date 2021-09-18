package cnd.englishcard.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbl_word")
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String word;
    @Column
    private String image;
    @Column
    private String audio;
    @Column
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private GroupEntity group;
}
