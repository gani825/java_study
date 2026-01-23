package ch07.sec08;


/*
멤버필드는 어차피 private으로 캡슐화 할꺼니
메소드에만 집중

대전제!!! 3가지
1. 부모 타입의 변수는 자식 객체 주소값을 담을 수 있다.
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 메서드 호출은 타입이 알고 있는 메서드만 호출 할 수 있고,
    호출이 되면 객체 기준에서 메서드를 찾는다.

    레퍼런스 타입끼리의 형변환은 상속관계에서만 간으하다.
    다형성은 상속관계에서만 나타난다.
*/

public class AnimalMain {
    public static void main(String[] args) {
        // 1. Animal 객체 주소값 담을 수 있는 animal 변수 + Animal 자식 객체의 주소값도 가능
        Animal animal = new Dog();
        animal.crying();

        // Dog타입의 변수로 BullDog객체 주소값을 담을 수 있다.
        Dog dog = new BullDog();
        dog.crying();

        // 대전제 2번 내용
//        Dog dog2 = new Animal(); // 컴파일 에러 뜬다.
//        Dog dog2 = (Dog)(new Animal); // 강제 형변환 해도 안된다. 대전제 2번 위반.

        Dog dog3 = (Dog) animal; // animal 변수에는 Dog객체 주소값이 담겨져 있기 때문에 Dog 타입 변수에 주소값을 담을 수 있다.

        Dog dog4 = new Dog();

        // 대전제 3번 내용
        animal.crying();

    }
}
