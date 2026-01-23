package ch07.sec02;

// 상속 + 생성자 마무리
// Phone 클래스를 상속받고 싶다면 extends 키워드를 사용한다.
public class SmartPhone extends Phone {
    public boolean wifi; // 전역 변수 boolean타입은 디폴트 값이 false

    public SmartPhone(String model, String color) {
        // super(); // 부모가 기본 생성자가 없어서 에러 발생
        super(model, color);
    }

    public void toggleWifi() {
        wifi = !wifi;
//        if (wifi == false) {
//            wifi = false;
//        } else {
//            wifi = true;
//        }
        System.out.println("wifi = " + wifi);
    }

    /*
    * 오버라이딩(Overriding)은 부모가 가지고 있는 메서드를
       다시 정의하는 것을 얘기한다. 선언부가 똑같아야 한다.
       @Override 애노테이션을 붙여준다.(실수 방지용)
       부모가 가지고 있지 않은 메서드를 정의하시면 이거는 새로운 메서드를 추가하는것.
       @Override에 빨간줄이 생기면 이건 새로운 메서드를 만드는 것
       즉, 부모에 그 메서드가 없다.
       final은 오버라이딩이 불가능
    */

    @Override
    public void bell() {
        super.bell();
        System.out.println("스마트폰 진동과 벨이 울린다");
    }
}
