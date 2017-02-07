package co.com.psl.elasticsearch.web.rest;

import co.com.psl.elasticsearch.model.City;
import co.com.psl.elasticsearch.repository.CityRepository;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @RequestMapping(path = "/city", method = RequestMethod.GET)
    public List<City> getAllCities() {
        return IteratorUtils.toList(cityRepository.findAll().iterator());
    }

    @RequestMapping(path = "/city/{id}", method = RequestMethod.GET)
    public City getCity(@PathVariable("id") String id) {
        return cityRepository.findOne(id);
    }

}
