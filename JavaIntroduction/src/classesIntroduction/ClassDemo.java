package classesIntroduction;

public class ClassDemo {
    public static void main(String[] args) {
        Car peugeot = new Car();
        peugeot.setColor("Red");
        System.out.println(peugeot.getColor());
        peugeot.increaseSpeed();

        Car audi = new Car();
        audi.setColor("Red");
        audi.setBrand("Audi");
        System.out.println(audi.getBrand());
        System.out.println(audi.getColor());

        Car bmw = new Car(10, 1);
        System.out.println(bmw.speed);
        System.out.println(bmw.gear);
    }
}
