public class Product {
    private String name = "Product";
    private int stock = 100;

    public void buyOne() {
        if (stock > 0) {
            stock--;
            System.out.println("("+name+" stock left:)"+stock);
        }
        else System.out.println("Out of stock!");
    }

    public void printInfo() {
        System.out.println("Product name: " + name + "  Stock left: " + stock);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name=name;
    }

    public void setStock(int stock) {
       this.stock=stock;
    }

    public int getStock() {
        return this.stock;
    }
}
