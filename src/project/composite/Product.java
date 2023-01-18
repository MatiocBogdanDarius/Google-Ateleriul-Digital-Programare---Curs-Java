package project.composite;

public class Product extends MenuItem{
    public Product() {
        super();
    }

    public Product(String title, double rating, int calories, int protein, int fat, int sodium, int price) {
        super(title, rating, calories, protein, fat, sodium, price);
    }
}
