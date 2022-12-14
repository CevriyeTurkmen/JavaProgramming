package Tasks_Adam;

public class HouseItems {

    public String name;
    public String color;
    public int amount;

    public HouseItems(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String toString() {
        return
                "name= " + name +" "+
                "color= " + color +" "+
                "amount= " + amount;
    }


    public static void main(String[] args) {

        HouseItems houseItems1=new HouseItems( "chair","grey",5);

        System.out.println(houseItems1);

    }









}
