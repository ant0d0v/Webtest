package org.example;

public class HW7 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        s = s.toLowerCase();
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'о') {
                System.out.print(c);
            }
        }

        String s1 = "Перевыборы выбранного президента";
        s = s.toLowerCase();
         int count = 0;
        for (int i = 0 ; i < s1.length(); i++){
            char c = s1.charAt(i);
            if (c == 'е') {
                count++;
            }
        }
        System.out.println(count);

        String s2 = "Посмотрите как рите нравится ритм";
        s = s.toLowerCase();


            System.out.println(s.indexOf("рит"));

        }
}

