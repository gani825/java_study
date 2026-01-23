package ch06.sec08;

import java.util.Arrays;

public class PracticeMethod2Main {
    public static void main(String[] args) {
        // PracticeMethod2 객체화
        PracticeMethod2 pm = new PracticeMethod2();

        String randomFileName = pm.getRandomFileName();
        System.out.println("randomFileName = " + randomFileName);

        String originalFileName = "크크크크dkdkdkdk.hahahaha.jpg";
        System.out.println("originalFileName = " + originalFileName);

        String ext = pm.getExt(originalFileName); //".jpg"
        System.out.println("ext = " + ext);

        // 파일명만 랜덤하고 확장자는 같으면 된다. 중요!! 나중에 프로젝트 할 때 씀!!

        String rFileName2 = pm.getRandomFileName(originalFileName);
        System.out.println("rFileName2 = " + rFileName2);

        int[] arr = {10, 5, 8, 11, 12, 13};
        int sum= pm.sumArr(arr); // 배열의 모든 값 더한 뒤 리턴
        System.out.println("sum = " + sum);

        int[] arr2 = pm.deepCopy(arr); // 깊은 복사, 딥카피한디
        // Arrays.toString()
        // 파라미터로 지정한 배열의 내용을 문자열(String)타입으로 데이터로 반환해주는 메서드
        System.out.println("arr2 = " + Arrays.toString(arr2));

        int max = pm.getMax(arr);
        System.out.println("max = " + max);

        int min = pm.getMin(arr);
        System.out.println("min = " + min);
    }
}
