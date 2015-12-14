import java.applet.Applet;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by mpurola on 18.10.15.
 */
public class Articles  {



    public static void main(String[] args) throws IOException {

        String[] articles = new String[]  {"Der", "Die", "Das"};

        Map<String,String> wordArticlesPairs = new HashMap<String, String>();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/Users/kaiatomson/Desktop/Programmeerimine/DerDIeDasGame2/src/db"));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file!");
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            //System.out.println(br.readLine());
            wordArticlesPairs.put(br.readLine(), br.readLine());
        }

        Iterator<String> articlesIterator = wordArticlesPairs.keySet().iterator();

        while(articlesIterator.hasNext()) {
            String sona = articlesIterator.next();

            System.out.println(sona);

            for (int i = 0; i < articles.length; i++) {
                System.out.println(i + ": " + articles[i]);
            }


        while(true) {

                System.out.print("Write the correct number to select article: ");

                int answer = TextIO.getlnInt();

                /*if (answer) {
                    System.out.println("Please try again");
                    continue;  // jump back beginning of this while loop
                }*/

                if (articles[answer].equals(wordArticlesPairs.get(sona))) {
                    System.out.println("Correct!");
                    break;  // exits this while loop
                } else {
                    System.out.println("Wrong! Try again");
                }
            }
        }
   }
}



