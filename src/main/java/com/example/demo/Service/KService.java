package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.KModel;
import com.example.demo.Repository.KRepository;

@Service
public class KService {
	@Autowired
	KRepository r;
	
	public String add(KModel m) {
		r.save(m);
		return "Added";
	}
	
	public List<KModel> getDetails() {
		return r.findAll();
	}
	
	public List<KModel> getSorted(String field) {
		return r.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<KModel> getWithPagination(@PathVariable int offset,@PathVariable int pageSize) {
       Page<KModel> page =r.findAll(PageRequest.of(offset, pageSize));
       return page.getContent();
	}     
       public KModel updateDetails(KModel e1){
   		return r.saveAndFlush(e1);
   	}
   	public void deleteDetails(int id)
   	{
   		r.deleteById(id);
   	}
   	

}
