package Nicolo.w4_d4.services;

import Nicolo.w4_d4.entities.Drink;
import Nicolo.w4_d4.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    @Autowired
    private DrinkRepository drinkRepository;

    public List<Drink> findAll() {
        return drinkRepository.findAll();
    }

    public Drink save(Drink drink) {
        return drinkRepository.save(drink);
    }

    public void delete(Long id) {
        drinkRepository.deleteById(id);
    }

    public Drink findById(Long id) {
        return drinkRepository.findById(id).orElse(null);
    }
}