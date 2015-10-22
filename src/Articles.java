import java.util.*;

/**
 * Created by mpurola on 18.10.15.
 */
public class Articles {

    public static void main(String[] args) {

        String[] articles = new String[]  {"Der", "Die", "Das"};

        Map<String,String> wordArticlesPairs = new HashMap<String, String>();

        wordArticlesPairs.put("Bruder", articles[0]);
        wordArticlesPairs.put("Vater", articles[0]);
        wordArticlesPairs.put("Blume", articles[1]);
        wordArticlesPairs.put("Mutter", articles[1]);
        wordArticlesPairs.put("Kind", articles[2]);
        wordArticlesPairs.put("Haus", articles[2]);


        Iterator<String> articlesIterator = wordArticlesPairs.keySet().iterator();

        while(articlesIterator.hasNext()) {
            String sona = articlesIterator.next();

            System.out.println(sona);

            for (int i = 0; i < articles.length; i++) {
                System.out.println(i + ": " + articles[i]);
            }

            while(true) {

                System.out.print("Write the corrent number to select article: ");

                int answer = TextIO.getlnInt();

                if (answer >= articles.length || answer < 0) {
                    System.out.println("Please try again");
                    continue;  // jump back beginning of this while loop
                }

                if (articles[answer].equals(wordArticlesPairs.get(sona))) {
                    System.out.println("Correct!");
                    break;  // exits this while loop
                } else {
                    System.out.println("Wrong!");
                }
            }
        }
   }
}



