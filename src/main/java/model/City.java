package model;

import jakarta.persistence.*;
import jdk.jfr.SettingDefinition;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "cities")
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Length(min = 3, max = 60)
    private String name;
    @Column(nullable = false)
    @Length(min = 3, max = 60)
    private String country;
    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean state = true;
}
