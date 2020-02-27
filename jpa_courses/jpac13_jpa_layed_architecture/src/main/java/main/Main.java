package main;


import services.ProductService;

public class Main {


    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addProduct("Beer");
        service.addProduct("Peanuts");
        service.findProducts().forEach(System.out::println);
    }
}
