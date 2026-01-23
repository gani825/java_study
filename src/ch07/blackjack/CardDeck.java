package ch07.blackjack;

// 카드통
public class CardDeck {
    // Card 객체 주소값 52개를 담을 수 있어야 합니다.
    private Card[] cards = new Card[52];
    private int drawIdx = 0;

    /*
    // 무늬 pattern (스페이드, 하트, 클로버, 다이아 중 한 값)
    // 숫자 denomination(A, 2 ~ 10, J, Q, K 중 한 값을 담을 수 있어야 한다.)
        CardDeck을 기본 생성자로 호출만 하여도
        Card 객체 52개를 생성하여 cards가 가리키는 배열에 순차적으로 저장(대입)한다.
        가능하면 무늬별로 다른 denomination 값이 저장되었으면 한다. */


    public CardDeck() {
        init();
        shuffle(); // 섞다

    }

    public void print() { //검증용!
        for(int i=0; i<cards.length; i++) {
            Card c = cards[i];
            if(c == null) {
                System.out.println("null");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }

    // 강사님 코드
//    private void init() {
//        int idx = 0;
//        for(int i=0; i<patterns.length; i++) { //4
//            String pattern = patterns[i];
//            for(int d=1; d<=13; d++) { //13
//                //정수 > 문자열
//                String denomination = null;
//                switch(d) {
//                    case 1: denomination = "A"; break;
//                    case 11: denomination = "J"; break;
//                    case 12: denomination = "Q"; break;
//                    case 13: denomination = "K"; break;
//                    default: denomination = String.valueOf(d);
//                }
//                Card c = new Card(pattern, denomination);
//                cards[idx++] = c;
//            }
//        }

    private void init() {
        String[] patterns = {"스페이드", "하트", "클로버", "다이아"};
        String[] denominations = {
                "A", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "J", "Q", "K"
        };

        int idx = 0;
        for (int pattern = 0; pattern < patterns.length; pattern++) {
            for (int denomination = 0; denomination < denominations.length; denomination++) {
                cards[idx++] = new Card(patterns[pattern], denominations[denomination]);
            }
        }
    }

    private void shuffle() {
        // cards 길이만큼 도는 for문 세팅
        for (int i = 0; i < cards.length; i++) {
            // 0 ~ 51 랜덤값 나올 수 있도록 해주세요.
            int randomIdx = (int) (Math.random() * cards.length);

            // i방과 randomIdx 방의 값을 서로 스와핑한다.
            Card temp = cards[i];
            cards[i] = cards[randomIdx];
            cards[randomIdx] = temp;
        }
    }

    public Card draw() {
        // cards의 방에 들어있는 card 주소값을 순차적으로 리턴해주며 리턴한 방은 null로 바꿔주세요.
//        내 코드
//        for (int i = 0; i < cards.length; i++) {
//            if (cards[i] != null) {
//                Card temp = cards[i];
//                cards[i] = null;
//                return temp;
//            }
//        }
//        return null;
        if (drawIdx > 51) {
            // 예외 처리, 안전 장치
            return null;
        }
        // cards의 방에 들어있는 card 주소값으르 순차적으로 리턴해주며 리턴한 방은 null로 바꾼다.
        Card temp = cards[drawIdx];
        cards[drawIdx++] = null;
        return temp;
    }
//      수빈이 코드
//    int y=0;
//    public Card draw(){
//        Card c = deck[y];
//        deck[y]=null;
//        y++;
//        return  c;
//    }
}

