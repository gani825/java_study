package ch07.sec08;

public class AnimalMain4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        haha();

        doCrying(dog);
        AnimalMain4.doCrying(cat);
        AnimalMain4.doCrying(bullDog);
    }

    public static void doCrying(Animal animal) {
        animal.crying();
    }

    public static void haha() {
        System.out.println("하하");
    }
}
