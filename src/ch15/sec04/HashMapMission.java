package ch15.sec04;

import java.util.HashMap;

public class HashMapMission {
    public static void main(String[] args) {
        // 우리가 생성자를 사용하는 이유는? 객체 생성과 동시에 초기화 하기 위해.

        ValueBox vb1 = new ValueBox(1, "권수영"); // 생성자 명시
        ValueBox vb2 = new ValueBox(2, "권준하"); // 생성자 명시
        ValueBox vb3 = new ValueBox(3, "김가은"); // 생성자 명시
        ValueBox vb11 = new ValueBox(11, "임준이"); // 생성자 명시

        // ValueBox 객체 주소값을 4개 담을 수 있는 배열을 만들어 주세요.
        ValueBox[] valueBoxArr = new ValueBox[4];
        valueBoxArr[0] = vb1;
        valueBoxArr[1] = vb2;
        valueBoxArr[2] = vb3;
        valueBoxArr[3] = vb11;

        // 배열 > HashMap으로 컴퍼팅하기. key값은 id, value 객체 주소값
        HashMap<Integer, ValueBox> map = new HashMap<>();
        for (int i = 0; i < valueBoxArr.length; i++) {
            ValueBox vb = valueBoxArr[i];
            map.put(vb.id, vb);
        }
        ValueBox id3 = map.get(3);
        System.out.println(id3.name);

        System.out.println(map.get(11).name);
        System.out.println(map);
    }
}

class ValueBox {
    int id;
    String name;

    public ValueBox(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
