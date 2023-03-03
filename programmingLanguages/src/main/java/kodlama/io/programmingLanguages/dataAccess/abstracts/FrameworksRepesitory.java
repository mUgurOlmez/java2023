package kodlama.io.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguages.entities.Framework;

public interface FrameworksRepesitory extends JpaRepository<Framework, Integer>{

}
