import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperMarket{
    public static Map<String, List<Item>> map = new HashMap();

    public static void main(String[] args) {

        Item shoes = new Clothing(Type.SHOES, "Nike", 200.0f);
        Item pants = new Clothing(Type.PANTS, "Nike", 100.0f);
        Item dress = new Clothing(Type.DRESS, "Gucci", 500.0f);

        Item parmesan = new Products(Type.DAIRY, 20.0f);
        Item sweetPotato = new Products(Type.VEGETABLES, 10.0f);
        Item strawberries = new Products(Type.FRUITS, 20.0f);

        List<Item> clothingList = new ArrayList<>();

        clothingList.add(shoes);
        clothingList.add(pants);
        clothingList.add(dress);

        List<Item> productList = new ArrayList<>();

        productList.add(parmesan);
        productList.add(sweetPotato);
        productList.add(strawberries);

        map.put("clothing", clothingList);
        map.put("products", productList);

        System.out.println(map);
    }
}



