package kodlama.io.programmingLanguages.wepApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguages.business.abstracts.FrameworksService;
import kodlama.io.programmingLanguages.business.request.CreateFrameworkRequest;
import kodlama.io.programmingLanguages.business.request.UpdateFrameworkRequest;
import kodlama.io.programmingLanguages.business.response.GetAllFrameworksResponse;
import kodlama.io.programmingLanguages.business.response.GetByIdFrameworkResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/frameworks")
@AllArgsConstructor
public class FrameworksController {
	FrameworksService frameworksService;
	
	@GetMapping
	public List<GetAllFrameworksResponse> getAll(){
		return frameworksService.getAll();
		
	}
	
	@PostMapping("{id}")
	public  GetByIdFrameworkResponse getById(@PathVariable int id) {
			
		
		return frameworksService.GetById(id);
		
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() CreateFrameworkRequest createFrameworkRequest) {

		this.frameworksService.add(createFrameworkRequest);

	}
	
	@PutMapping()
	public void update(@RequestBody() UpdateFrameworkRequest updateFrameworkRequest) {

		frameworksService.update(updateFrameworkRequest);

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {

		frameworksService.delete(id);
	}
	
}
