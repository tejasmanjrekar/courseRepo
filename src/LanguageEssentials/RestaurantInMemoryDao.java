package LanguageEssentials;
import java.util.Collection;
public class RestaurantInMemoryDao
        implements DaoInterface<Restaurant,Integer> {
    public void createNew(Restaurant newRestaurant) {
        // TODO Auto-generated method stub
        RestaurantStore.createNewRestaurant(newRestaurant);

    }

    @Override
    public Collection<Restaurant> getAll() {
        // TODO Auto-generated method stub
        Collection<Restaurant> allRestaurants=RestaurantStore.getAllRestaurants();
        return allRestaurants;
    }




    public Restaurant getOneById(Integer id) {
        // TODO Auto-generated method stub
        Restaurant fetchedRestaurant = RestaurantStore.getOneRestaurantById(id);
        return fetchedRestaurant;
    }

    @Override
    public void update(Restaurant modifiedRestaurant) {
        // TODO Auto-generated method stub
        RestaurantStore.updateRestaurant(modifiedRestaurant);

    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        RestaurantStore.deleteRestaurantById(id);

    }

}
