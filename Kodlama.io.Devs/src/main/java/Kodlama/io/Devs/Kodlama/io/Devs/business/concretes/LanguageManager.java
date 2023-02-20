package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepesitory;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {
	private LanguagesRepesitory languagesRepesitory;
	@Autowired
	public LanguageManager(LanguagesRepesitory languagesRepesitory) {
		this.languagesRepesitory=languagesRepesitory;
	}
	@Override
	public List<Language> getAll() {
		return languagesRepesitory.getAll();
	}
	@Override
	public void add(Language language) throws Exception {
		if(language.getName().isBlank()) {
			throw new Exception("Programa dili adı boş olamaz"); 
			
		}
		
		for(Language language2: languagesRepesitory.getAll()) {
			if(language2.getName()==language.getName()){
				throw new Exception(language2.getName()+" daha önce eklenmiş");
				
			}
		 System.out.println("yeni dil eklendi");
			
		}
	}
	@Override
	public void delete(int id) {
		for(Language language: languagesRepesitory.getAll()) {
			if(language.getId()==id) {
				
			}
			
		}
		System.out.println("seçili dil silindi");		
	}
	@Override
	public void update(Language language) throws Exception {
		if(language.getName().isBlank()) {
			throw new Exception("programlama dili boş olamaz");
		}
		for(Language language2:languagesRepesitory.getAll()) {
			if(language2.getName()==language.getName()){
				throw new Exception(language2.getName()+" daha önce eklenmiş");
			}
			languagesRepesitory.add(language);
			System.out.println("yeni dil eklendi");
		}
		
	}
	@Override
	public void getById(int id) {
	
		
	}
	
		
	}


