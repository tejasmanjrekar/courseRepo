package IOOPERATIONS;

import java.util.Collection;

public class DaoExampleMain {
    private static void getAll() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantInMemoryDao();
        Collection<Restaurant> allRestaurants = di.getAll();
        for(Restaurant rst : allRestaurants) {
            System.out.println(rst);
        }
    }
    private static void getOne() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantInMemoryDao();
        Restaurant rst = di.getOneById(2);
        System.out.println(rst);
    }
    private static void createNew() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantInMemoryDao();
        Restaurant rst = new Restaurant(101, "Paradise", "Indian", 5);
        di.createNew(rst);
    }
    private static void update() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantInMemoryDao();
        Restaurant rst = di.getOneById(2);
        rst.setBranchCount(60);
        di.update(rst);//Reflects changed state into store
    }
    private static void delete() {
        DaoInterface<Restaurant, Integer> di =
                new RestaurantInMemoryDao();
        di.deleteById(2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //getAll();

        //getOne();

		/*For adding new
		 * createNew();
		getAll();*/

		/*For update
		 * getAll();
		update();
		System.out.println("---------------------------------");
		getAll();
		*/

        getAll();
        delete();
        System.out.println("---------------------------------");
        getAll();

    }

}
