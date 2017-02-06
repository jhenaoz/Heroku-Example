package co.com.psl.web.rest;


import co.com.psl.model.Type;
import co.com.psl.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;


@RestController
public class TypeController {

    @Autowired
    TypeRepository typeRepository;

    @RequestMapping(path="/pokemon", method=RequestMethod.GET)
    public ArrayList<Type> getAll(){
        ArrayList<Type> types = (ArrayList<Type>) typeRepository.findAll();
        return types;
    }
}
