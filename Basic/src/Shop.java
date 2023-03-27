import java.util.ArrayList;

public class Shop {
    private String name;
    private String category;
    private String location;

    public Shop(String name, String category, String location) {
        this.name = name;
        this.category = category;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }
}

class FoodShop extends Shop {
    private String menu;
    private String specialtyDish;

    public FoodShop(String name, String category, String location, String menu, String specialtyDish) {
        super(name, category, location);
        this.menu = menu;
        this.specialtyDish = specialtyDish;
    }

    public String getMenu() {
        return menu;
    }

    public String getSpecialtyDish() {
        return specialtyDish;
    }
}

class Mall {
    private ArrayList<Shop> shops;

    public Mall() {
        this.shops = new ArrayList<Shop>();
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void displayShopDetails(String shopName) {
        for (Shop shop : shops) {
            if (shop.getName().equals(shopName)) {
                System.out.println("Name: " + shop.getName());
                System.out.println("Category: " + shop.getCategory());
                System.out.println("Location: " + shop.getLocation());
                if (shop instanceof FoodShop) {
                    FoodShop foodShop = (FoodShop) shop;
                    System.out.println("Menu: " + foodShop.getMenu());
                    System.out.println("Specialty Dish: " + foodShop.getSpecialtyDish());
                }
                return;
            }
        }
        System.out.println("Shop not found.");
    }

    public static void main(String[] args) {
        Mall mall = new Mall();

        // Add some shops
        mall.addShop(new Shop("Bookstore", "Books", "Second Floor"));
        mall.addShop(new Shop("Clothing Store", "Fashion", "First Floor"));
        mall.addShop(new FoodShop("Pizza Place", "Food", "Third Floor", "Pizza, Pasta, Salad", "Margherita Pizza"));

        // Display shop details
        mall.displayShopDetails("Pizza Place");
    }
}
