package kodlama.io.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguages.entities.Language;

public interface LanguagesRepository extends JpaRepository<Language, Integer> {

}
