package ch06.sec03;

public class StudentMain {
    public static void main(String[] args) {
        // Student 객체 생성 (객체화)
        // Student s1은 레퍼런스 변수이고 객체의 주소값을 담을 수 있다.
        // 단 Student 객체의 주소값만 담을 수 있다.
        // Student s0 = new String(""); // Student 객체 주소값만 담을 수 있다.
        // String str0 = new Student(); // String 객체 주소값만 담을 수 있다.

        // Student() >> 기본 생성자(constructor)
        // 기본 생성자는 메서드의 한 종류인데 특별한 메서드다.
        // 객체 생성때만 호출할 수 있고, 생성 이후에는 호출할 수 없는 메서드이다.
        // 객체 생성할 때는 무조건 생성자를 호출해야 합니다.
        // 생성자를 정의 하지 않으면 컴파일러가 기본 생성자는 자동으로 만들어 준다. 중요.
        Student s1 = new Student(100, "김예림");
        s1.introduceMyself();
        s1.no = 1;
        s1.name = "권수영";
        s1.introduceMyself();
        System.out.println(s1); // 참조값 확인

        Student s2 = new Student();
        s2.no = 12;
        s2.name = "임준이";
        s2.introduceMyself();
        System.out.println(s2); // 참조값 확인

        Student s3 = new Student("김예림", 10);
        s3.introduceMyself();
        System.out.println(s3);

        s3 = s1;
        s3.introduceMyself();
        System.out.println(s3);

    }
}
