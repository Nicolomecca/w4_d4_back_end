package Nicolo.w4_d4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@DiscriminatorValue("DRINK")
@Getter
@Setter
@NoArgsConstructor
public class Drink extends Item {
	private String name;

	public Drink(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
