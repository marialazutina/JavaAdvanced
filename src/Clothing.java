import java.util.Random;

public class Clothing extends Item{
    public int id;
    public Type type;
    public String producer;
    public float price;
    public static int counter = 1;

    public Clothing(Type type, String producer, float price ){
        this.id = counter++;
        this.type = type;
        this.producer = producer;
        this.price = price;
    }

    public Type getType(){
        return type;
    }

    public String toString() {
        return "\n Clothing id: " + id + "\n Type: " + type + "\n Producer: " + producer + "\n Price: " + price + " EUR \n";
    }

}
