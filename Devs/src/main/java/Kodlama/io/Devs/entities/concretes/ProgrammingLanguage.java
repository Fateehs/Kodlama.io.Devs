package Kodlama.io.Devs.entities.concretes;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programming_languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "programmingLanguage")
	private List<SubTechnology> subTechnologies;
=======
import Kodlama.io.Devs.entities.abstracts.EntityRepository;

public class ProgrammingLanguage implements EntityRepository {
	private int id;
	private String name;
	
	public ProgrammingLanguage(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
>>>>>>> branch 'master' of https://github.com/Fateehs/Kodlama.io.Devs.git
}
