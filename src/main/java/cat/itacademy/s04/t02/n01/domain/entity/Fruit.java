package cat.itacademy.s04.t02.n01.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Fruit {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer kilogramQuantity = 0;

    public Fruit() {}

    public Fruit(String name, Integer kilogramQuantity) {
        this.name = name;
        this.kilogramQuantity = kilogramQuantity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getKilogramQuantity() {
        return kilogramQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKilogramQuantity(Integer kilogramQuantity) {
        this.kilogramQuantity = kilogramQuantity;
    }
}
