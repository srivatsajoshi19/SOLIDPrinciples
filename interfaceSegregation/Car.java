package interfaceSegregation.goodExample;

public class Car implements Vehicle, Movable {
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
}