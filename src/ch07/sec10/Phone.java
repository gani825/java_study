package ch07.sec10;
/*
추상클래스란 class 키워드 앞에 abstract 들어간 클래스를 의미한다.
특징
- 객체화가 안 된다.
- 추상 메서드가 있으면 무조건 추상 클래스가 되어야한다.
 */

public abstract class Phone {
    // 멤버 필드도 가질 수 있다.
    private String owner;

    // 추상 메서드 : 선언부만 있고 구현부가 없는 메서드를 의미
    // 나는 이 메서드가 있다는 걸 알고 있다. 내 자식들아~
    // 추상메서드는 강제성이 있다. 자식은 무조건 오버라이딩 해야 한다.
    public abstract void bell();

    // 멤버 메서드도 가질 수 있다.
    public void turnOn() {
    }
}
