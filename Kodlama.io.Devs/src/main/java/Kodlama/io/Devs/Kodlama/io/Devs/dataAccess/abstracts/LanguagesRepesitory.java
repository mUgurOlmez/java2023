package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguagesRepesitory {
	List<Language> getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language);
	void getById(int id);
	

}
