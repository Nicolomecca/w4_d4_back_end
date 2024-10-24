package Nicolo.w4_d4.services;

import Nicolo.w4_d4.entities.Topping;
import Nicolo.w4_d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> findAll() {
        return toppingRepository.findAll();
    }

    public Topping save(Topping topping) {
        return toppingRepository.save(topping);
    }

    public void delete(Long id) {
        toppingRepository.deleteById(id);
    }

    public Topping findById(Long id) {
        return toppingRepository.findById(id).orElse(null);
    }
}