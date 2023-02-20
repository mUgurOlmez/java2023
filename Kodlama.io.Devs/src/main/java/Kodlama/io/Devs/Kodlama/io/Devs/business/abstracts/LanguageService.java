package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	void add(Language language) throws Exception;

	void delete(int id);

	void update(Language language) throws Exception;

	void getById(int id);
}
