package ch04.sec02;

public class PrintStarRectangle {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 7.0) + 3;
        System.out.println(star);

        /*
        ****
        ****
        ****
        */
        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *
        **
        ***
        ****
        *****
        */
        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *****
         ****
         ***
         **
         *
        */
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
