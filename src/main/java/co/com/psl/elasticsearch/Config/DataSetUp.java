package co.com.psl.elasticsearch.Config;

import co.com.psl.elasticsearch.model.City;
import co.com.psl.elasticsearch.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataSetUp {

    @Autowired
    CityRepository cityRepository;

    @PostConstruct
    public void dataSetUp(){
        City medellin = new City();
        medellin.setName("Medellin");

        City bogota = new City();
        bogota.setName("bogota");

        City cali = new City();
        cali.setName("cali");

        City cartagena = new City();
        cartagena.setName("cartagena");

        cityRepository.save(medellin);
        cityRepository.save(bogota);
        cityRepository.save(cali);
        cityRepository.save(cartagena);
    }
}
