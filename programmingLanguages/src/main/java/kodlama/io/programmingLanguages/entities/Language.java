package kodlama.io.programmingLanguages.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "languages")
@Getter//getter
@Setter//setter
@AllArgsConstructor//parametreli constructor
@NoArgsConstructor//parametresiz constructor
@Entity

public class Language {
	@Id//pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)//otomatik id veriyor
	@Column(name = "id")
	private int id;//PK primary key
	
	
	
	@Column(name = "name",unique = true)//tablodaki ismi
	private String name;//class ismi
	
	@OneToMany(mappedBy = "language")
	List<Framework> frameworks;
}
