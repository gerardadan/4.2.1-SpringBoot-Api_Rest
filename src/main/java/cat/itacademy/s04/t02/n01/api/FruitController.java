package cat.itacademy.s04.t02.n01.api;

import cat.itacademy.s04.t02.n01.application.dto.FruitRequestDTO;
import cat.itacademy.s04.t02.n01.application.dto.FruitResponseDTO;
import cat.itacademy.s04.t02.n01.application.services.FruitService;
import cat.itacademy.s04.t02.n01.domain.entity.Fruit;
import cat.itacademy.s04.t02.n01.infrasctructure.repository.FruitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fruits")
public class FruitController {
    private final FruitService service;

    public FruitController(FruitService service) {
        this.service = service;
    }

    @PostMapping
    public FruitResponseDTO add(@RequestBody FruitRequestDTO fruitRequestDTO) {
        return service.add(fruitRequestDTO);
    }

    @PatchMapping
    public FruitResponseDTO update(@RequestBody FruitRequestDTO fruitRequestDTO) {
        return service.update(fruitRequestDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<FruitResponseDTO> getAll() {
        return service.getAll();
    }

    /*
http://localhost:8080/fruita/add
http://localhost:8080/fruita/update
http://localhost:8080/fruita/delete/{id}
http://localhost:8080/fruita/getOne/{id}
http://localhost:8080/fruita/getAll
     */

}
