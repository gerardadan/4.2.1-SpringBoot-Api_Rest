package cat.itacademy.s04.t02.n01.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FruitResponseDTO {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("kilogram_quantity")
    private Integer kilogramQuantity = 0;

    public FruitResponseDTO(Long id, String name, Integer kilogramQuantity) {
        this.id = id;
        this.name = name;
        this.kilogramQuantity = kilogramQuantity;
    }

}
