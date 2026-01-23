package ch06.sec11;
/*
프로젝트에서 단 하나의 객체만 만들어서 사용할 수 있도록 구조를 만든 것을 싱글톤이라고 한다.

1. 외부에서 객체 생성을 할 수 없다.
2. SingleTone 객체를 담을 수 있는 static 변수 필요.
3. 외부에서 객체 주소값을 없을 수 있는 static 메서드 필요
*/

public class SingleTone {
    static SingleTone singleTone = null;

    String name;
    int age;

    private SingleTone() {

    }

    public static SingleTone getInstance() {
       /* 만약, singleTone static 멤버필드가 null 이라면 SingleTone을
          객체화 하여 주소값을 담아준다.
          singleTone 담겨져 있는 주소값을 리턴한다.
       */
        if (singleTone == null) {
            singleTone = new SingleTone();
        }
        return singleTone;
    }
}
