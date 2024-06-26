package CreateBox;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner inputObj = new Scanner(System.in)) {
            System.out.println("Enter Dimension");
            int dimension = inputObj.nextInt();
            String hashtag = "#";
            String blank = " ";
            for (int i = 0; i < dimension; i++) {
                if (i == 0 || i == dimension - 1) {
                    String line = hashtag.repeat(dimension);
                    System.out.println(line);
                } else {
                    String line = blank.repeat(dimension - 2);
                    System.out.println(hashtag + line + hashtag);
                }
            }
        }
    }
}
