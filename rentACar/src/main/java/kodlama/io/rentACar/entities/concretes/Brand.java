package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "brands")
@Getter//getter
@Setter//setter
@AllArgsConstructor//parametreli constructor
@NoArgsConstructor//parametresiz constructor
@Entity
public class Brand {
	@Id//pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)//otomatik id veriyor
	@Column(name = "id")
	private int id;//PK primary key
	
	@Column(name = "name")//tablodaki ismi
	private String name;//class ismi

}
