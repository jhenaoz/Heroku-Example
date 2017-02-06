package co.com.psl.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.psl.model.Type;
import co.com.psl.repository.TypeRepository;

@Component
public class SetUp {

	@Autowired
	TypeRepository typeRepository;
	
	@PostConstruct
	public void setUp() {
		Type electric = new Type();
		electric.setName("Electric");
		typeRepository.saveAndFlush(electric);
	}
}
