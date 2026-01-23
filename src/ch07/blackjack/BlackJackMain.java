package ch07.blackjack;

import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        // 딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }

        // 딜러가 가지고 있는 카드의 점수가 16점 이하면 카드 한장을 더 소지하게 한다.
        if (dealer.needMoreCard()) {
            dealer.receiveCard(cd.draw());
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            // 게이머에게 카드를 더 받을지 물어본다.
            gamer.showYourCards();
            int gamerScore = Rule.calcScore(gamer.openCard());
            System.out.println("게이머 점수 합계: " + gamerScore);
            System.out.print("카드를 더 받으시겠습니까? (y/n):");
            String answer = sc.nextLine();
            if ("n".equalsIgnoreCase(answer)) {
                break;
            } else if ("y".equalsIgnoreCase(answer)) {
                gamer.receiveCard(cd.draw());
            }
        }

        dealer.showYourCards();
        int dealerScore = Rule.calcScore(dealer.openCard());
        System.out.println("딜러 점수 합계: " + dealerScore);
        System.out.println();

        // 비교, 누가 이겼습니까 ?
        Rule.whoIsWinner(dealer, gamer);

//        int gamerScore = Rule.calcScore(gamer.openCard());
//        System.out.println("게이머 점수 합계: " + gamerScore);
//
//        System.out.println();
//
//        dealer.needMoreCard();
//
//        System.out.println("-- 딜러 받은 카드 --");
//        Card[] dealerCards = dealer.openCard();
//        for (Card c : dealerCards) {
//            System.out.println(c);
//        }
//
//        int dealerScore = Rule.calcScore(dealerCards);
//        System.out.println("딜러 점수 합계: " + dealerScore);
//
//        System.out.println();
//
//        Rule.whoIsWinner(dealer, gamer);
        // Rule 메서드를 따로 쪼갤 경우
//        System.out.println("-- 게이머 받은 카드 --");
//        Card[] gamerCards = gamer.openCard();
//        for (Card c : gamer.openCard()) {
//            System.out.println(c);
//        }
//
//        // 게이머 카드 배열을 받아 점수 계산
//        int gamerScore = Rule.calcScore(gamerCards);
//        System.out.println("게이머 점수 합계: " + gamerScore);
//
//        System.out.println();
//
//        dealer.needMoreCard();
//
//        System.out.println("-- 딜러 받은 카드 --");
//        Card[] dealerCards = dealer.openCard();
//        for (Card c : dealerCards) {
//            System.out.println(c);
//        }
//
//        // 딜러 카드 배열을 받아 점수 계산
//        int dealerScore = Rule.calcScore(dealerCards);
//        System.out.println("딜러 점수 합계: " + dealerScore);
//        System.out.println();
//
//        // 카드 받는게 종료.
//        Rule.whoIsWinner(dealerScore, gamerScore); // 비겼다, 딜러 승, 게이머 승
    }
}
