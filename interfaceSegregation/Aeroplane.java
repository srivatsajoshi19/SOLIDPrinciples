package interfaceSegregation.goodExample;

public class Aeroplane implements Vehicle, Movable, Flyable {
    double price;
    String color;


    public void setPrice(double price) {

        this.price = price;
    }


    public void setColor(String color) {
        this.color=color;
    }

    public void start(){
        System.out.println("Started");
    }

    public void stop(){
        System.out.println("Stopped");
    }

    public void fly(){
        System.out.println("Started Flying");
    }
}