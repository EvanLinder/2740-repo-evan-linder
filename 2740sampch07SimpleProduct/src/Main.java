public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.code = "java";
        product.description = "Cooooool Java product";
        product.price = 11.11;

        System.out.println(product.code);
        System.out.println(product.description);
        System.out.println(product.price);
    }
}
