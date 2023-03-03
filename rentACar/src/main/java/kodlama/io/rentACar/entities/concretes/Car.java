package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter // getter
@Setter // setter
@AllArgsConstructor // parametreli constructor
@NoArgsConstructor // parametresiz constructor
@Entity
public class Car {
	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) // otomatik id veriyor
	@Column(name = "id")
	private int id;

	@Column(name = "plate", unique = true)
	private String plate;

	@Column(name = "dailyPrice")
	private double dailyPrice;

	@Column(name = "modelYear")
	private int modelYear;

	@Column(name = "state") // araba suan ne durumda
	private String state;// 1available 2-Rented 3-Maintence

	@ManyToOne
	@JoinColumn(name = "model_id") // manytoone yı joınlıyoruz bu sekılde bağdaştıracak
	private Model model;
}
