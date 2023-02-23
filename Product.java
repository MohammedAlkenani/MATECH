
public class Product {

    protected String name;

    protected String detail;

    protected double price;

    public Product(String name, String detail, double price) {
        this.name = name;

        this.detail = detail;

        this.price = price;
    }

    public void getName(int i) {
     	System.out.println((i+1)+" - Product Name : "+name);
    }
	public void getProductName() {
     	System.out.println("Product Name : "+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getDetails() {
        System.out.println("Product Details : "+ detail);
    }

    public void getPrice() {
        System.out.println("Product Price : "+price + " SAR ");
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Details: " + detail + ", Price: " + price + " SAR";
    }
}
