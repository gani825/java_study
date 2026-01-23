package ch07.sec08;

/*
대전제 3 deep
메서드 호출은 타입이 알고 있는 메서드만 호출할 수 있고,
호출이 되면 객체 기준에서 메서드를 찾는다.

Dog 클래스에 새로운 메서드 jump() 하나 추가.
*/
public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new BullDog(); // Dog 객체는 jump()가지고 있다.
        animal.crying(); // animal 입장에서는 알고 있는 메서드
//        animal.jump(); // animal 모르는 메서드이기 때문에 찾을 수 없다.

        // jump()메서드를 호출하고싶다.
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }
//        ((Dog)animal).jump();

        // 변수에 담겨져 있는 객체를 타입에 담을 수 있으면 true, 없으면 false리턴
        // 왼쪽 변수 우츠 타입
        System.out.println("animal instanceof Dog = " + (animal instanceof Dog));
    }
}
