package cat.itacademy.s04.t02.n01.application.dto;

import cat.itacademy.s04.t02.n01.domain.entity.Fruit;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FruitRequestDTO {
    @JsonProperty("id")
    public Long id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("kilogram_quantity")
    public Integer kilogramQuantity = 0;

}
