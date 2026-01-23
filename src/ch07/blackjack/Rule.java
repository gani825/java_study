package ch07.blackjack;

public class Rule {
    private static final int BLACKJACK_SCORE = 21;

    public static int calcScore(Card[] cards) {
        // 2 ~ 10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1점으로 계산
        // 카드들의 모든 점수를 더하고 더한 점수를 리턴하시오.
        int sum = 0;

        for (int i = 0; i < cards.length; i++) {
            String num = cards[i].getDenomination();
            // switch 표현식
            int score = switch (num) {
                case "A" -> 1;
                case "K", "Q", "J" -> 10;
                default -> Integer.parseInt(num);
            };
            sum += score;
        }
        //
//            switch (num) {
//                case "A":
//                    sum += 1;
//                    break;
//                case "K":
//                case "Q":
//                case "J":
//                    sum += 10;
//                    break;
//                default:
//                    sum += Integer.parseInt(num);
//            }
//        }
//            if (num.equals("A")) {
//                sum += 1;
//            } else if (num.equals("K") || num.equals("Q") || num.equals("J")) {
//                sum += 10;
//            } else {
//                sum += Integer.parseInt(num);
//            }
//        }
        return sum;
    }

    // 게임 객체를 점수로 변환해주는 메서드(각 객체를 받음)
    public static void whoIsWinner(Dealer dealer, Gamer gamer) {
        Card[] dealerCards = dealer.openCard();
        Card[] gamerCards = gamer.openCard();

        int dealerScore = calcScore(dealerCards);
        int gamerScore = calcScore(gamerCards);

        // 메서드 오버로딩해서 출력 확인할 때
//        whoIsWinner(dealerScore, gamerScore);
        // int dealerScore = 10;
//        int gamerScore = 11;

        /*
        둘의 점수가 같으면 무승부,
        둘 다 21점 초과이면 무승부,
        딜러가 21점 초과, 게이머가 21점 이하면 게이머 승,
        게이머가 21점 초과, 딜러가 21점 이하면 딜러 승,
        둘 다 21점 초과가 안된 상태에서, 게이머가 딜러보다 점수가 높으면 게이머 승
        .....
        .....
        결과가 나오게 해주세요.
        */
        if (dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE) {
            System.out.println("무승부");
        } else if (dealerScore > BLACKJACK_SCORE || gamerScore <= BLACKJACK_SCORE && dealerScore <= BLACKJACK_SCORE && gamerScore > dealerScore) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }
    }

//    // 승패 판단 메서드(값만 받음)
//    public static void whoIsWinner(int dealerScore, int gamerScore) {
//        if(dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE) {
//            System.out.println("무승부");
//        } else if(dealerScore > BLACKJACK_SCORE || gamerScore <= BLACKJACK_SCORE && dealerScore <= BLACKJACK_SCORE && gamerScore > dealerScore) {
//            System.out.println("게이머 승");
//        } else {
//            System.out.println("딜러 승");
//        }
//    }
}

