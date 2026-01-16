package ch06.sec03;

/*
객체는 무엇으로 이루어져 있는가?
속성: 맴버필드, 전역(변수/상수), 역할: 값 저장, 객체가 살아있는 동안 값이 유지된다.
메서드: 맴버메서드, 역할 : 변화 action

클래스는 객체가 아니다. 틀(Frame), 설계도 같은 것.

클래스로 실체를 만들면 그게 객체(object, instance)가 된다.

작성 순서는 아래 순서로 적자.
멤버필드 -> 생성자 -> 메서드

생성자 vs 메서드 다른 점 2가지
1. 이름은 클래스명과 동일
2. 리턴 타입을 작성하면 안된다.

생성자의 역할 : 객체 생성 + 멤버필드 초기화
*/
public class Student {
    int no;
    String name;

    public Student() { // 기본 생성자 정의
        this(0, "홍길동"); // this() 다른 생성자 호출, 항상 최상위에 호출해야한다.
        System.out.println("--Studnet 기본 생성자--");
//        no = 0;
//        name = "홍길동";
    }

    public Student(int no, String name) { // 오버로딩
        System.out.println("-- 오버로딩 --");
        this.no = no;
        this.name = name;
    }


    public Student(String bbbb, int aaa) { // 오버로딩
        this.no = aaa;
        this.name = bbbb;
        System.out.println("-----");
    }

    void introduceMyself() {
        System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no, name);
    }
}
