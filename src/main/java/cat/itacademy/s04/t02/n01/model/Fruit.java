package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruit {
    @Id
    private Long id;
    private String name;
    private Integer kilogramQuantity = 0;

    public Fruit() {}

    public Fruit(Long id, String name, Integer kilogramQuantity) {
        this.id = id;
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
}
