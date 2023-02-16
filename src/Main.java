import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product usb = new Product("USB-Кабель",230.54);
        Product glass = new Product("Защитное стекло",500.32);
        Product earphones = new Product("Наушники",970.25);
        Product.listProduct.add(usb);
        Product.listProduct.add(usb);
        Product.listProduct.add(usb);
        Product.listProduct.add(usb);
        Product.listProduct.add(glass);
        Product.listProduct.add(glass);
        Product.listProduct.add(glass);
        Product.listProduct.add(earphones);
        Product.listProduct.add(earphones);
        Wending.fillWending();




    }
}