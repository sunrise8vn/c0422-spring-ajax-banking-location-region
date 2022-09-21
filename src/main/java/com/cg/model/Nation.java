package com.cg.model;

import com.cg.model.dto.NationDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nations")
@Accessors(chain = true)
public class Nation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nation_id")
    private String nationId;

    @Column(name = "nation_name")
    private String nationName;

    @OneToMany(targetEntity = LocationRegion.class)
    private List<LocationRegion> locationRegions;

    public NationDTO toNationDTO() {
        return new NationDTO()
                .setId(id)
                .setNationId(nationId)
                .setNationName(nationName);
    }
}
