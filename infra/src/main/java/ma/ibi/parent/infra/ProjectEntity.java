package ma.ibi.parent.infra;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "PROJECT")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer percentage;
}
