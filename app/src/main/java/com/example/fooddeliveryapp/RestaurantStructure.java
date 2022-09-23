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
                        new MenuItem(2,"Sweet Potato Salad", "Signature Beef Sausage Roll", "$25.00", R.drawable.menuitem002,0,false),
                        new MenuItem(3,"Toasted Avo and Egg", "Delicious beef pie", "$25.00", R.drawable.menuitem003,0,false),
                        new MenuItem(4,"Flat White", "Barrista made flat white", "$13.00", R.drawable.menuitem004,0,false),
                        new MenuItem(5,"Cappuccino", "Barrista made Latte", "$13.00", R.drawable.menuitem005,0,false),
                        new MenuItem(6,"Caesar Salad", "Braized beef and chicken", "$13.00", R.drawable.menuitem006,0,false)
                })),
                new Restaurant("Burgers are Us", R.drawable.restaurant002, Arrays.asList(new MenuItem[] {
                        new MenuItem(7,"Beef Burger", "Signature Grass fed beef", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(8,"Chicken Burger", "Free range chicken burger", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(9,"Small chips", "Small serving of chips", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(10,"Large chips", "Large serving of chips", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(11,"Chocolate milkshake", "Delicious chocolate milkshake", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(12,"Strawberry milkshake", "Classic Strawberry milkshake", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(13,"Cock milkshake", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("John's Italian", R.drawable.restaurant003, Arrays.asList(new MenuItem[] {
                        new MenuItem(14,"Panzenella", "Braized beef and chicken", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(15,"Pasta Carbonara", "Braized beef and chicken", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(16,"Mushroom Risotto", "Braized beef and chicken", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(17,"Margherita Pizza", "Braized beef and chicken", "$15.00", R.drawable.restaurant001,0,false),
                        new MenuItem(18,"Focaccia Bread", "Braized beef and chicken", "$6.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Steak and Wine House", R.drawable.restaurant004, Arrays.asList(new MenuItem[] {
                        new MenuItem(19,"3oz Tomahawk Steak", "Braized beef and chicken", "$40.00", R.drawable.restaurant001,0,false),
                        new MenuItem(20,"Beef and Mushroom", "Braized beef and chicken", "$25.00", R.drawable.restaurant001,0,false),
                        new MenuItem(21,"Rib Eye Steak", "Braized beef and chicken", "$35.00", R.drawable.restaurant001,0,false),
                        new MenuItem(22,"Bottle of House Red", "Braized beef and chicken", "$50.00", R.drawable.restaurant001,0,false),
                        new MenuItem(23,"Bottle of Hosue White", "Braized beef and chicken", "$50.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Rondo Lunch Bar", R.drawable.restaurant005, Arrays.asList(new MenuItem[] {
                        new MenuItem(24,"BMT Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(25,"Egg and Lettuce Sandwich", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(26,"Beef Sausage Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(27,"Bacon and Egg Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(28,"Can of Coke", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Fresh Farms Meats", R.drawable.restaurant006, Arrays.asList(new MenuItem[] {
                        new MenuItem(29,"Raw Chicken Breast", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(30,"Beef Fillets", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(31,"Lamp Chops", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(32,"Chicken Drumsticks", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(33,"Italian Sausage", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Soup House", R.drawable.restaurant007, Arrays.asList(new MenuItem[] {
                        new MenuItem(34,"Tomato Soup", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(35,"Pumpkin Soup", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(36,"Leak and Garlic Soup", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(37,"Chicken Soup", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(38,"Basil Soup", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("JCA Noodle Bar", R.drawable.restaurant008, Arrays.asList(new MenuItem[] {
                        new MenuItem(39,"Chicken Noodles", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(40,"Beef Noddles", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(41,"Lamp Noodles", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(42,"Miso Ramen", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(43,"Can of Pepsi", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Jim's Fish and Chips", R.drawable.restaurant009, Arrays.asList(new MenuItem[] {
                        new MenuItem(44,"Large Chip and Fish", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(45,"Medium Chip and Fish", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(46,"Small Chip and Fish", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(47,"Can of Lemonade", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(48,"Can of Sprite", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Su Sushi", R.drawable.restaurant010, Arrays.asList(new MenuItem[] {
                        new MenuItem(49,"Avocado and Chicken Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(50,"Crispy Chicken and Cucumber Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(51,"Smoked Salmon and Mayo Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(52,"Chicken Teriyaki Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(53,"Chicken Katsu Roll", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Dumping Dons", R.drawable.restaurant011, Arrays.asList(new MenuItem[] {
                        new MenuItem(54,"Pea and Chicken Dumplings", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(55,"Mint and Basil Dumplings", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(56,"Chicken Dumplings", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(57,"Pork and Miso Dumplings", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(58,"Veggie and Miso Dumplings", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
                })),
                new Restaurant("Desert Central", R.drawable.restaurant012, Arrays.asList(new MenuItem[] {
                        new MenuItem(59,"Ice Cream and Brownie", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(60,"Fruit Salad", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(61,"Raspberry Chocolate Tart", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(62,"Chocolate Cake", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false),
                        new MenuItem(63,"Vanilla and Lemon Cake", "Braized beef and chicken", "$13.00", R.drawable.restaurant001,0,false)
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

