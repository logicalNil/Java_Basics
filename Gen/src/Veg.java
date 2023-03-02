public class Veg extends Food{
    private int price;

    public void eat(){
        System.out.println("Tasteless");
    }
    public int setPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
