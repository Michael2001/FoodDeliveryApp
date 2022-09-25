package com.example.fooddeliveryapp;

import android.util.Log;
import java.util.Arrays;
import java.util.List;

public class RestaurantStructure {
    private List<Restaurant> restaurantList;


    private static RestaurantStructure instance = null;

    public static RestaurantStructure get()
    {
        if(instance == null)
        {
            instance = new RestaurantStructure();
        }
        return instance;
    }

    protected RestaurantStructure() {
        restaurantList = Arrays.asList(new Restaurant[] {
                new Restaurant("Jill's Catering", R.drawable.restaurant001, Arrays.asList(new MenuItem[] {
                        new MenuItem(1,"Beef and Chicken Wraps", "Classic beef and chicken", "$13.00", R.drawable.menuitem001,0,false),
                        new MenuItem(2,"Sweet Potato Salad", "Signature Beef Sausage Roll", "$12.5", R.drawable.menuitem002,0,false),
                        new MenuItem(3,"Toasted Avo and Egg", "Delicious beef pie", "$13", R.drawable.menuitem003,0,false),
                        new MenuItem(4,"Flat White", "Barrista made flat white", "$13.00", R.drawable.menuitem004,0,false),
                        new MenuItem(5,"Cappuccino", "Barrista made Latte", "$13.00", R.drawable.menuitem005,0,false),
                        new MenuItem(6,"Caesar Salad", "Braized beef and chicken", "$13.00", R.drawable.menuitem006,0,false)
                })),
                new Restaurant("Burgers are Us", R.drawable.restaurant002, Arrays.asList(new MenuItem[] {
                        new MenuItem(7,"Beef Burger", "Signature Grass fed beef", "$13.00", R.drawable.menuitem009,0,false),
                        new MenuItem(8,"Chicken Burger", "Free range chicken burger", "$13.00", R.drawable.menuitem008,0,false),
                        new MenuItem(9,"Small chips", "Small serving of chips", "$13.00", R.drawable.menuitem010,0,false),
                        new MenuItem(10,"Large chips", "Large serving of chips", "$13.00", R.drawable.menuitem010,0,false),
                        new MenuItem(11,"Chocolate milkshake", "Delicious chocolate milkshake", "$6.00", R.drawable.menuitem011,0,false),
                        new MenuItem(12,"Strawberry milkshake", "Classic Strawberry milkshake", "$6.00", R.drawable.menuitem012,0,false)
                })),
                new Restaurant("John's Italian", R.drawable.restaurant003, Arrays.asList(new MenuItem[] {
                        new MenuItem(14,"Panzenella", "Authentic Panzenella", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(15,"Pasta Carbonara", "Delicious and Creamy Carbonara", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(16,"Mushroom Risotto", "Signature Risotto", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(17,"Margherita Pizza", "Oven-made Margherita", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(18,"Focaccia Bread", "Yummy Yummy Bread", "$6.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Steak and Wine House", R.drawable.restaurant004, Arrays.asList(new MenuItem[] {
                        new MenuItem(19,"3oz Tomahawk Steak", "Seriously tough Tomahawk Steak. Means Buisness", "$40.00", R.drawable.menuitem13,0,false),
                        new MenuItem(20,"Beef and Mushroom", "House Mushrooms and signature Beef", "$25.00", R.drawable.menuitem14,0,false),
                        new MenuItem(21,"Rib Eye Steak", "Classic Steak. Cooked to taste", "$35.00", R.drawable.menuitem13,0,false),
                        new MenuItem(22,"Bottle of House Red", "Aged Red from Eastern-Australia", "$50.00", R.drawable.menuitem15,0,false),
                        new MenuItem(23,"Bottle of Hosue White", "House White. We reccomend the red", "$50.00", R.drawable.menuitem16,0,false)
                })),
                new Restaurant("Rondo Lunch Bar", R.drawable.restaurant005, Arrays.asList(new MenuItem[] {
                        new MenuItem(24,"BMT Sandwich", "Bacon, Mayo and Tomato", "$13.00", R.drawable.menuitem017,0,false),
                        new MenuItem(25,"Egg and Lettuce Sandwich", "Egg and Lettuce Roll", "$13.00", R.drawable.menuitem018,0,false),
                        new MenuItem(26,"Beef Sausage Roll", "Real Beef Sausage Roll", "$13.00", R.drawable.menuitem019,0,false),
                        new MenuItem(27,"Bacon and Egg Roll", "Bacon and Egg Roll, perfect for breakfast", "$8.00", R.drawable.menuitem020,0,false),
                        new MenuItem(28,"Can of Coke", "350ml Can of Coke", "$3.00", R.drawable.menuitem021,0,false)
                })),
                new Restaurant("Fresh Farms Meats", R.drawable.restaurant006, Arrays.asList(new MenuItem[] {
                        new MenuItem(29,"Raw Chicken Breast", "Free range chicken breast", "$15.00", R.drawable.menuitem022,0,false),
                        new MenuItem(30,"Beef Fillets", "Signature grass fed fillets", "$13.00", R.drawable.menuitem023,0,false),
                        new MenuItem(31,"Lamp Chops", "Australian Chops", "$13.00", R.drawable.menuitem024,0,false),
                        new MenuItem(32,"Chicken Drumsticks", "Chicken Drumstics, pre-seasoned", "$13.00", R.drawable.menuitem025,0,false),
                        new MenuItem(33,"Italian Sausage", "Authentic Sausages", "$13.00", R.drawable.menuitem026,0,false)
                })),
                new Restaurant("Soup House", R.drawable.restaurant007, Arrays.asList(new MenuItem[] {
                        new MenuItem(34,"Tomato Soup", "Italian Tomato Soup", "7.00", R.drawable.menuitem027,0,false),
                        new MenuItem(35,"Pumpkin Soup", "Fresh Pumpkin Soup", "$7.00", R.drawable.menuitem028,0,false),
                        new MenuItem(36,"Leak and Garlic Soup", "Chefs special Leak and Garlic", "$7.00", R.drawable.menuitem029,0,false),
                        new MenuItem(37,"Chicken Soup", "Free range chicken soup", "$6.00", R.drawable.menuitem030,0,false),
                        new MenuItem(38,"Basil Soup", "Freshly cut Basil", "$7.00", R.drawable.menuitem031,0,false)
                })),
                new Restaurant("Jim's Fish and Chips", R.drawable.restaurant009, Arrays.asList(new MenuItem[] {
                        new MenuItem(44,"Large Chip and Fish", "Large chip and fish, best value!", "$16.00", R.drawable.menuitem032,0,false),
                        new MenuItem(45,"Medium Chip and Fish", "Medium size", "$10.00", R.drawable.menuitem032,0,false),
                        new MenuItem(46,"Small Chip and Fish", "Small size", "$8.00", R.drawable.menuitem032,0,false),
                        new MenuItem(47,"Can of Lemonade", "350ml Lemonade", "$5.00", R.drawable.menuitem033,0,false),
                        new MenuItem(48,"Can of Sprite", "350ml Sprite", "$5.00", R.drawable.menuitem034,0,false)
                })),
                new Restaurant("Dumping Dons", R.drawable.restaurant011, Arrays.asList(new MenuItem[] {
                        new MenuItem(54,"Pea and Chicken Dumplings", "6 Pea and Chicken Dumplings", "$9.00", R.drawable.menuitem035,0,false),
                        new MenuItem(55,"Mint and Basil Dumplings", "Basil and Mint Dumplings cooked fresh", "$9.00", R.drawable.menuitem035,0,false),
                        new MenuItem(56,"Chicken Dumplings", "5PC chicken Dumplings", "$9.00", R.drawable.menuitem035,0,false),
                        new MenuItem(57,"Pork and Miso Dumplings", "12 Pork and Miso Dumplings", "$9.00", R.drawable.menuitem035,0,false),
                        new MenuItem(58,"Veggie and Miso Dumplings", "12 Veggie and Miso Dumplings", "$9.00", R.drawable.menuitem035,0,false)
                })),
                new Restaurant("Desert Central", R.drawable.restaurant012, Arrays.asList(new MenuItem[] {
                        new MenuItem(59,"Ice Cream and Brownie", "Delicious Brownie Ice Cream", "$7.00", R.drawable.menuitem036,0,false),
                        new MenuItem(60,"Fruit Salad", "Healthy Fruit Salad", "$7.00", R.drawable.menuitem037,0,false),
                        new MenuItem(61,"Raspberry Chocolate Tart", "Frozen Rasberry Chocolate TArt", "$9.00", R.drawable.menuitem038,0,false),
                        new MenuItem(62,"Chocolate Cake", "Chocolate Mud Cake", "$9.00", R.drawable.menuitem039,0,false),
                        new MenuItem(63,"Vanilla and Lemon Cake", "Chefs special Vanilla and Lemon", "$9.00", R.drawable.menuitem040,0,false)
                })),
        });
        this.createSpecials();
    };

    public Restaurant get(int i) { return restaurantList.get(i); }

    public int size() { return restaurantList.size(); }

    public void add(Restaurant restaurant) { restaurantList.add(0, restaurant); }

    public void remove(int i) { restaurantList.remove((i)); }

    public MenuItem findMenuItem(String id) {
        MenuItem returnedItem = null;
        for (int ii = 0; ii<=this.size() -1; ii++)
        {
            Restaurant tempRestaurant = restaurantList.get(ii);
            for(int jj=0; jj<=tempRestaurant.getNumItems() -1; jj++) {
                MenuItem tempMenuItem = tempRestaurant.getMenuList().get(jj);
                if(tempMenuItem.getFoodName() == id) {
                    returnedItem = tempMenuItem;
                }
            }
        }
        return returnedItem;
    }


    public void createSpecials()
    {
        for (int ii = 0; ii <= this.size()-1; ii++)
        {
            Restaurant temp = restaurantList.get(ii);
            for (int yy =0; yy <= temp.getNumItems()-1; yy++){
                MenuItem tempItem = temp.getMenuList().get(yy);
                double rand = Math.random();
                if ((rand >0 ) && (rand < 0.3))
                {
                    Log.i("Rand","SetSpecial!");
                    tempItem.setSpecial();
                    String rawPrice = tempItem.getFoodPrice();
                    int price = Integer.parseInt(rawPrice.substring(1,2));
                    int discountPrice = price - (int)Math.round(price * 0.1);
                    tempItem.setPrice("$" + Integer.toString(discountPrice) + ".00");
                    restaurantList.get(ii).getMenuList().set(yy, tempItem);
                }
                else
                {
                    Log.i("Rand","No special!");
                }
            }
        }
    }
}

