package Day12;


import java.util.Collection;

public class RestaurantCRUDExampleMain {

    private static void delete() {

        DaoInterface<Restaurant,Integer> di =
                new RestaurantDatabaseDao();
        di.deleteById(2);
    }
    private static void update() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantDatabaseDao();
        Restaurant rst = di.getOneById(3);
        rst.setCuisine("Multicuisine");
        rst.setBranchCount(10);
        di.update(rst);
    }
    private static void addNew() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantDatabaseDao();

        Restaurant rst = new Restaurant(7, "Tamnac Thai", "Thai", 5);
        di.createNew(rst);
    }
    private static void showOne() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantDatabaseDao();
        Restaurant rst =
                di.getOneById(3);
        if(rst != null)
            System.out.println(rst);
        else
            System.out.println("Restaurant with this id not found");
    }
    private static void showAll() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantDatabaseDao();
        Collection<Restaurant> allRestaurants = di.getAll();
        for(Restaurant rs : allRestaurants)
            System.out.println(rs);
        //allRestaurants.stream().forEach((rs) -> System.out.println(rs));

    }

    public static void main(String[] args) {
        //showAll();
        //showOne();
        //addNew();
        //showAll();
        //update();
        showAll();
       delete();

    }
}

