package Nicolo.w4_d4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@DiscriminatorValue("TOPPING")
@Getter
@Setter
@NoArgsConstructor

public class Topping extends Item {
	private String name;

	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
