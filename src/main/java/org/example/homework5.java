package org.example;

public class homework5 {
    public static void main(String[] args) {
        {
            int b = 10;
            for (int i = 0; i < 10; i++) {
                System.out.println();

                for (int j = 0; j < b; j++) {
                    System.out.print(j+ " ");
                }
                b = b - 1;
            }
        }

        {
            int c = 10;
            String d = "";
            for (int i = 0; i < 10; i++) {
                System.out.println();
                System.out.print(d);
                for (int j = 0; j < c; j++) {
                    System.out.print(j + " ");
                }
                c = c - 1;
                d = d + "  ";

            }
        }


        int f = 10;
        int b = 10;
        String d="";
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print(d);
            f = f - 1;
            for (int j = f; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < b; j++) {
                System.out.print(j + " ");
            }
            b = b - 1;
            d = d + "  ";

        }
    }
}

