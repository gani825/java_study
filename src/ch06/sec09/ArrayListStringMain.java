package ch06.sec09;

import java.util.Arrays;

public class ArrayListStringMain {
    public static void main(String[] args) {
        ArrayListString list = new ArrayListString();
        System.out.println("list = " + Arrays.toString(list.arr));
        list.add("하하"); // 0
        System.out.println("list = " + Arrays.toString(list.arr));
        list.add("후후"); // 1
        System.out.println("list = " + Arrays.toString(list.arr));
        list.add("크크"); //2
        System.out.println("list = " + Arrays.toString(list.arr));
        list.add("키키"); //3
        System.out.println("list = " + Arrays.toString(list.arr));

        String val = list.get(2);
        System.out.println("val = " + val);

        // 가장 마지막 방에 있는 값 삭제, 삭제 한 값 리턴
        String removeVal = list.remove();
        System.out.println("removeVal = " + removeVal);
        System.out.println("list = " + Arrays.toString(list.arr));

        list.add(1, "나야");
        System.out.println("추가 리스트 = " + Arrays.toString(list.arr));

        String removeVal2 = list.remove(2);
        System.out.println("removeVal2 = " + removeVal2);
        System.out.println("list = " + Arrays.toString(list.arr)); // 하하, 나야, 크크

        String removeVal3 = list.get(1); // 주소값으로 해야함. 나야를 다시 만들면 안됌.
        System.out.println("removeVal3 = " + removeVal3);
        list.remove(removeVal3);
        System.out.println("list = " + Arrays.toString(list.arr)); // 하하, 크크
    }
}
