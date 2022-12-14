public class Products extends Item{
    public int id;
    public Type type;
    public float price;
    public static int counter = 1;

    public Products(Type type, float price){
        this.id = counter++;
        this.type = type;
        this.price = price;
    }

    public Type getType(){
        return type;
    }

    public String toString(){
        return "\n Product id: "+id +"\n Type: "+type + "\n Price: "+price+" EUR \n";
    }
}
