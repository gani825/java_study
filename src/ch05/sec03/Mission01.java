package ch05.sec03;

public class Mission01 {
    public static void main(String[] args) {
        String fileNm = "abc12-jjk-bbb.kkk.jpeg";

        // 유연하게 코드 짜야함.
        // 확장자명 알고 싶어.
        int idx = fileNm.lastIndexOf(".");

        String newSub = fileNm.substring(idx + 1);
        System.out.println("newSub = " + newSub);
    }
}
