package com.cg.model.dto;


import com.cg.model.Nation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class NationDTO {

    private Long id;

    private String nationId;

    private String nationName;

    public Nation toNation() {
        return new Nation()
                .setId(id)
                .setNationId(nationId)
                .setNationName(nationName);
    }
}
