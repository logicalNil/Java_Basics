public class NonVeg extends Food{
    private int price;

    public void eat(){
        System.out.println("Various");
    }
    public int setPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

