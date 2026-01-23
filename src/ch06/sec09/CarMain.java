package ch06.sec09;

public class CarMain {
    //this.은 속성이나 메서드를 사용하고 싶을 때.
    public static void main(String[] args) {
        Car c1 = new Car("그랜저"); // 그랜저 문자열이 model에 저장되게 해주세요.
        c1.introduce();
        Car c2 = new Car(); // 모델명: 소나타
        c2.introduce();
    }
}
