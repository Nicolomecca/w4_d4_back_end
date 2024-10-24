package Nicolo.w4_d4.repositories;

import Nicolo.w4_d4.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}