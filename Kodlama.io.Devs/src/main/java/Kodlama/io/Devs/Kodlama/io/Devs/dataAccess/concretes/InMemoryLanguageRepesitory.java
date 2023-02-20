package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepesitory;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepesitory implements LanguagesRepesitory {

	List<Language> languages;

	public InMemoryLanguageRepesitory() {

	}

	@Override
	public List<Language> getAll() {

		languages = new ArrayList<Language>();
		languages.add(new Language(1, "c#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python#"));
		return languages;
	}

	@Override
	public void add(Language language) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Language language) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
