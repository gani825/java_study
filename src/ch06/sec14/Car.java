package ch06.sec14;

public class Car {
    // 은닉화 혹은 캡슐화, 멤버필드를 private으로 외부 접근을 막는다.
    // private 한 멤버 필드에 값 넣는 방법
//    1. 생성자 이용
    // 2. 메서드 이용 (Setter)

    // private한 멤버 필드에 값 빼는 방법
    // 메서드 이용 (Getter)
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    /*
     setter 만드는 방법
     접근지ㅣ어는 public
     메서드명 set 시작 + 필드명
     리턴타입은 void (값은 받기만 하지 리턴하진 않는다.)
     파라미터는 필드의 타입과 동일하게 한다.
     전달받은 값을 필드에 대입한다.

     setter가 있으면 mutable이다. 수정 가능하다.
     setter가 없으면 immutable이다. 수정 불가능하다.
    */
    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
