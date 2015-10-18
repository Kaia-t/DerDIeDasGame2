import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by mpurola on 18.10.15.
 */
public class Articles {
    public static void main(String[] args) {
        int Bruder = 1;
        int Vater = 1;
        int Blume = 2;
        int Mutter = 2;
        int Kind = 3;
        int Haus = 3;

        int[] Articles = {1,2,3};
        int[] Der = new int [1];
        int[] Die = new int [2];
        int[] Das = new int [3];

        System.out.println("Bruder");


        String[] a = {"Bruder", "Vater"};
        String[] b = {"Der"};


        Arrays.equals(a, b);

        System.out.println(Arrays.toString(b));


        String[] c = {"Blume", "Mutter"};
        String[] d = {"Die"};

        Arrays.equals(c, d);

        System.out.println(Arrays.toString(d));

        String[] e = {"Kind", "Haus"};
        String[] f = {"Das"};

        Arrays.equals(e, f);

        System.out.println(Arrays.toString(f));




        Scanner user = new Scanner(System.in);


        System.out.println("Click on the correct article");
        int entry = user.nextInt();
        int hit = Articles[entry];
        if (hit == 1) {
            System.out.println("Correct answer!");

        } if (hit!= 1)

        {
            System.out.println("Wrong answer, try again!");





        }
        }
    }



