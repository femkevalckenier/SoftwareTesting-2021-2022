package classesIntroduction;

public class Car {
    private String brand;
    private String color;
    private String model;
    private int year;

    int speed;
    int gear;

    public Car() {

    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void increaseSpeed() {
        System.out.println("Increasing the speed!");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        }
        else {
            System.out.println("This year is not valid!");
        }
    }



}
