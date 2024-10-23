public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) throw new IllegalArgumentException("O nome precisa conter pelo menos 3 caracteres.");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("O preço não pode ser negativo");
        this.price = price;
    }

    double applyDiscount(int percentDiscount){
        if (percentDiscount < 0 || percentDiscount > 100) throw new IllegalArgumentException("O desconto tem que ser entre 0 e 100%");
        double amountToBeDiscounted = (this.price / 100) * percentDiscount;
        return this.price - amountToBeDiscounted;
    }
}
