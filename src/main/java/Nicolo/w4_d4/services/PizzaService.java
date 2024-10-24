package Nicolo.w4_d4.services;

import Nicolo.w4_d4.entities.Pizza;
import Nicolo.w4_d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void delete(Long id) {
        pizzaRepository.deleteById(id);
    }

    public Pizza findById(Long id) {
        return pizzaRepository.findById(id).orElse(null);
    }
}