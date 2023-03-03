package kodlama.io.programmingLanguages.wepApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguages.business.abstracts.LanguagesService;
import kodlama.io.programmingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguagesResponse;
import kodlama.io.programmingLanguages.business.response.GetBylanguageIdResponse;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
@Controller
public class LanguagesController {
	LanguagesService languagesService;

	@GetMapping()
	public List<GetAllLanguagesResponse> getAll() {

		 return languagesService.getAll();
	}

	@PostMapping("{id}")
	public GetBylanguageIdResponse getbyid(@PathVariable int id) {

		return languagesService.GetById(id);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() CreateLanguageRequest createLanguageRequest) {

		this.languagesService.add(createLanguageRequest);

	}

	@PutMapping()
	public void update(@RequestBody() UpdateLanguageRequest updateLanguageRequest) {

		languagesService.update(updateLanguageRequest);

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {

		languagesService.delete(id);
	}

}
