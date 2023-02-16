import java.util.*;

public class Wending {
    private static List<String> listProduct = new ArrayList<>();
    private static Map<Product, Integer> listWending = new HashMap<Product, Integer>();
    private int maxCount;

    public Wending(List<String> listProduct) {
        this.listProduct = listProduct;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public List<String> getListProduct() {
        return listProduct;
    }

    static public List<String> getInfo() {
        return listProduct;
    }

    static public Map<Product, Integer> getThat() {
        return listWending;
    }


    public void setListProduct(List<String> listProduct) {
        this.listProduct = listProduct;
    }



    public String toString() {
        return listWending.toString();
    }

    static void fillWending() {
        int count = 1;
        for (Product it : Product.listProduct) {
            if (listWending.containsKey(it)) {
                count = listWending.get(it);
                count++;
                listWending.put(it, count);
            } else {
                count = 1;
                listWending.put(it, count);
            }
        }
        for (Map.Entry test: listWending.entrySet()
             ) {
            System.out.println(test);

        }

    }


}
