package Nicolo.w4_d4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="item_type")
@Getter
@NoArgsConstructor
public abstract class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	protected int calories;
	protected double price;

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

}
