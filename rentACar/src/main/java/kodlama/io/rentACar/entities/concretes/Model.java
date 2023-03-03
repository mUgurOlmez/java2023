package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "models")
@Getter//getter
@Setter//setter
@AllArgsConstructor//parametreli constructor
@NoArgsConstructor//parametresiz constructor
@Entity
public class Model {
	@Id//pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)//otomatik id veriyor
	@Column(name = "id")
	private int id;//PK primary key
	
	@Column(name = "name")//tablodaki ismi
	private String name;//class ismi
	
	@ManyToOne
	@JoinColumn(name="brand_id")//manytoone yı joınlıyoruz bu sekılde bağdaştıracak
	private Brand brand;
	
	@OneToMany(mappedBy = "model")
	private List<Car> cars;
}
