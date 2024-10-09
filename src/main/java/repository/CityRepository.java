package repository;

import model.City;
import service.EntityManagerAdmin;

import java.util.List;

public class CityRepository {


    public void save(City city) {
        EntityManagerAdmin.getInstance().persist(city);
    }

    public City find(int id) {
        return EntityManagerAdmin.getInstance().find(City.class, id);
    }

    public void update(City city) {
        EntityManagerAdmin.getInstance().merge(city);
    }

    public void delete(City city) {
        EntityManagerAdmin.getInstance().remove(city);
    }

    public void delete(int id) {
        City city = find(id);
        if(city != null) {
            delete(city);
        }
    }

    public List<City> findAll() {
        return EntityManagerAdmin.getInstance().createQuery("SELECT c FROM City c", City.class).getResultList();
    }
}
