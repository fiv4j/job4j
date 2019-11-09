package ru.job4j.pojo;

public class Shop {

    private void delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
    }

    private void printProducts(Product[] products) {
        for (Product item: products) {
            if (item != null) {
                System.out.println(item.getName() + " : " + item.getCount());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Shop superMarket = new Shop();
        Product[] products = new Product[5];
        products[0] = new Product("milk", 3);
        products[1] = new Product("bread", 5);
        products[2] = new Product("egg", 2);
        products[3] = new Product("cookie", 10);
        products[4] = new Product("candy", 4);
        superMarket.printProducts(products);

        superMarket.delete(products, 2);
        superMarket.printProducts(products);

        superMarket.delete(products, 0);
        superMarket.printProducts(products);
    }
}

