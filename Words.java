
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        int randomNumber = (int) (Math.random() * words.length);
        String hiddenWord = words[randomNumber];

        Scanner sc = new Scanner(System.in);
        System.out.println("Постарайтесь угадать слово, загаданное компьютером\n");
        System.out.println("Это слова, которые может загадать комьютер\n");
        for (int i = 0; i <words.length ; i++) {
            System.out.print(words[i]+", ");
            if(i%5==0) System.out.println();
        }
        System.out.println();
        System.out.print("\nВведите слово: ");

        String userAnswer = sc.nextLine();
        char us;
        char hid;

        char[] arra = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        do {

            if (hiddenWord.equals(userAnswer)) {
                System.out.println("Поздравляю, Вы угадали!!!");

            } else {

                for (int p = 0; (p < hiddenWord.length() && p < userAnswer.length()); p++) {

                    us = userAnswer.charAt(p);
                    hid = hiddenWord.charAt(p);

                    if (us == hid) {
                        arra[p] = hid;
                    }
                }
                System.out.println("Вы не угадали, посмотрите совпавшие буквы и попробуйте ещё раз");
                String out = new String(arra);
                System.out.println(out);

            }
            userAnswer = sc.nextLine();
        }while(!(hiddenWord.equals(userAnswer)));
        System.out.println("Поздравляю, Вы угадали!!!");

    }

}




