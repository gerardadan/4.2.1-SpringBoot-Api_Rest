package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    private final FruitRepository fruitRepository;

    public FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    
    /*
http://localhost:8080/fruita/add
http://localhost:8080/fruita/update
http://localhost:8080/fruita/delete/{id}
http://localhost:8080/fruita/getOne/{id}
http://localhost:8080/fruita/getAll
     */

}
