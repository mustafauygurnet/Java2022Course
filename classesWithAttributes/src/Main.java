public class Main {
    public static void main(String[] args) {

        //Product product = new Product(1,"Laptop","Asus Laptop", 13000,12,"Black");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.getCode();

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
    }
}
