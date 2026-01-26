package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// 위 import는 밑에 애들을 import하는 것과 같은 효과가 난다.
//import java.util.HashMap;
//import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 제네릭 첫번째 타입은 : Key 타입
        // 제네릭 두번째 타입은 : Value 타입
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        System.out.println("value0-0 : " + map.get("홍길동")); // 90
        map.put("홍길동", 95); // 추가되지 않고 덮어쓰기 된다.
        System.out.println("value0-1 : " + map.get("홍길동")); // 95

        int value1 = map.get("신용권");
        System.out.println("value1 = " + value1); // 85
        System.out.println("value2 = " + map.get("동장군")); // 80
        System.out.println("value3 = " + map.get("크크크")); // null

        System.out.println("size = " + map.size()); // size : 너 몇개 put됬니 ? 같은 키로 한번 더 풋되면 덮어씌기. 추가되지 않는다.

        // Set은 Value만 저장하고 중복값 저장이 안된다.
        Set<String> keySet = map.keySet(); // KEY 값들만 빼내서 Set으로 만든 것.(동장군, 신용권, 홍길동)이 문자열로 Set 타입에 들어있다는 것.
        // Set 객체를 이용하여 Itorator 반복자 반복자를 생성한다. (반복하기 위해서)
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) { // 다음을 가리켰을 때 데이터가 있으면 true 없으면 false
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n", k, v);
        }
    }
}
