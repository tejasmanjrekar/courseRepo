package IOOPERATIONS;

import java.util.Collection;

public class RestaurantInMemoryDao implements DaoInterface<Restaurant, Integer>{
    @Override
    public void createNew(Restaurant newRestaurant) {
        RestaurantStore.createNewRestaurant(newRestaurant);
    }

    @Override
    public Collection<Restaurant> getAll() {
        Collection<Restaurant> allRestaurants =
                RestaurantStore.getAllRestaurants();
        return allRestaurants;
    }

    @Override
    public Restaurant getOneById(Integer id) {
        Restaurant fetchedRestaurant =
                RestaurantStore.getOneRestaurantById(id);
        return fetchedRestaurant;
    }

    @Override
    public void update(Restaurant modifiedRestaurant) {
        RestaurantStore.updateRestaurant(modifiedRestaurant);
    }

    @Override
    public void deleteById(Integer id) {
        RestaurantStore.deleteRestaurantById(id);
    }
}
