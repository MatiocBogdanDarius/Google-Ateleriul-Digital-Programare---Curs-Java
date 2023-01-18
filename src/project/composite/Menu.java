package project.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem{
    private List<MenuItem> menuItems;

    public Menu() {
        super();
        menuItems = new ArrayList<>();
    }

    public Menu(String title, double rating, int calories, int protein, int fat, int sodium, int price) {
        super(title, rating, calories, protein, fat, sodium, price);
    }

    public Menu(String title, double rating, int calories, int protein, int fat, int sodium, int price, List<MenuItem> menuItems) {
        super(title, rating, calories, protein, fat, sodium, price);
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        calculatePrice();
    }

    private void calculatePrice(){
        Integer newMenuPrice = this.menuItems.stream().map(MenuItem::getPrice).reduce(0, Integer::sum);
        setPrice(newMenuPrice);
    }
}
