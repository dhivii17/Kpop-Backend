package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.KModel;
import com.example.demo.Service.KService;

@RestController
@CrossOrigin
public class KController {
	@Autowired
	KService s;
	@GetMapping("/get")
	public List<KModel> showDetails() {
		return s.getDetails();

	}

	@PostMapping("/post")
	public String addDetails(@RequestBody KModel m) {
		s.add(m);
		return "Added product " + m.getKid();
	}

	//sorting
	@GetMapping("/product/{field}")
	public List<KModel> getWithSort(@PathVariable String field) {
		return s.getSorted(field);
	}

	// pagination
	@GetMapping("/product/{offset}/{pageSize}")
	public List<KModel> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return s.getWithPagination(offset, pageSize);
	}		
		@PutMapping("/updateDetails")
		public KModel updateInfo(@RequestBody KModel st1)
		{
			return s.updateDetails(st1);
		}
		@DeleteMapping("/deleteDetails/{kid}")
		public String deleteInfo(@PathVariable("kid") int sid)
		{
			s.deleteDetails(sid);
			return "Deleted details";
		}
}
			
