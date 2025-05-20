package cat.itacademy.s04.t02.n01.application.services;

import cat.itacademy.s04.t02.n01.application.dto.FruitRequestDTO;
import cat.itacademy.s04.t02.n01.application.dto.FruitResponseDTO;
import cat.itacademy.s04.t02.n01.application.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.domain.entity.Fruit;
import cat.itacademy.s04.t02.n01.infrasctructure.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public FruitResponseDTO add(FruitRequestDTO fruitRequestDTO) {
        Fruit fruit = new Fruit(fruitRequestDTO.name, fruitRequestDTO.kilogramQuantity);
        Fruit fruitSaved = fruitRepository.save(fruit);

        return new FruitResponseDTO(
                fruitSaved.getId(),
                fruitSaved.getName(),
                fruitSaved.getKilogramQuantity());
    }

    public FruitResponseDTO update(FruitRequestDTO fruitRequestDTO) {
        Fruit fruit = fruitRepository.findById(fruitRequestDTO.id)
                .orElseThrow(() -> new FruitNotFoundException("Id fruit not found"));
        fruit.setName(fruitRequestDTO.name);
        fruit.setKilogramQuantity(fruitRequestDTO.kilogramQuantity);

        Fruit fruitSaved = fruitRepository.save(fruit);

        return new FruitResponseDTO(fruitSaved.getId(), fruitSaved.getName(), fruitSaved.getKilogramQuantity());
    }

    public void delete(long id) {
        Fruit fruit = fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Id fruit not found"));

        fruitRepository.delete(fruit);
    }

    public FruitResponseDTO getOne(long id) {
        Fruit fruit = fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Id fruit not found"));

        return new FruitResponseDTO(fruit.getId(), fruit.getName(), fruit.getKilogramQuantity());
    }

    public List<FruitResponseDTO> getAll() {
        return fruitRepository.findAll().stream()
                .map(fruit -> new FruitResponseDTO(
                        fruit.getId(),
                        fruit.getName(),
                        fruit.getKilogramQuantity()))
                .toList();
    }




}
