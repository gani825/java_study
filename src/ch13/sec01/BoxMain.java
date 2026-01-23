package ch13.sec01;

public class BoxMain {
    public static void main(String[] args) {
        // 제네릭은 컴파일 될 때 타잉ㅂ이 결정된다.
        Box<Integer> boxInt = new Box<>();
        boxInt.setContent(10);
        int result = boxInt.getContent();

        Box<String> boxString = new Box<>(); // T 자리가 전부 String이 되었다.
        boxString.setContent("하하");
        String result2 = boxString.getContent();
    }
}
