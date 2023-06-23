package LanguageEssentials;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class RestaurantStore {
    private static Map<Integer, Restaurant> allRestaurants;
    static {
        allRestaurants = new HashMap<>();//Creating Empty Map
        Restaurant r1 = new Restaurant(1, "Kamat", "South Indian", 100);
        Restaurant r2 = new Restaurant(2, "McDonalds", "American", 50);
        Restaurant r3 = new Restaurant(3, "Bawarchi", "Mughlai", 25);

        allRestaurants.put(r1.getRestaurantId(), r1);
        allRestaurants.put(r2.getRestaurantId(), r2);
        allRestaurants.put(r3.getRestaurantId(), r3);
    }
    //Create New
    public static void createNewRestaurant(Restaurant newRestaurant) {
        allRestaurants.put(newRestaurant.getRestaurantId(), newRestaurant);
    }
    //Read All
    public static Collection<Restaurant> getAllRestaurants(){
        Collection<Restaurant> allAvaialbleRestaurants
                = allRestaurants.values();
        return allAvaialbleRestaurants;
    }
    //Read One
    public static Restaurant getOneRestaurantById(Integer id) {
        Restaurant foundRestaurant = allRestaurants.get(id);
        return foundRestaurant;
    }
    //Update
    public static void updateRestaurant(Restaurant modifiedRestaurant) {
        allRestaurants.put(modifiedRestaurant.getRestaurantId(), modifiedRestaurant);
    }
    //Delete
    public static void deleteRestaurantById(Integer id) {
        allRestaurants.remove(id);
    }

}


