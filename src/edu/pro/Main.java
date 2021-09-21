package edu.pro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

         String fileName = "https://norvig.com/big.txt";
      //  String fileName = "/home/george/Desktop/lines.txt";
        String namesAsString = "James,John,Robert,Michael,William,David,Richard,Charles,Joseph,Thomas,Christopher,Daniel,Paul,Mark,Donal\n" +
                "d,George,Kenneth,Steven,Edward,Brian,Ronald,Anthony,Kevin,Jason,Matthew,Gary,Timothy,Jose,Larry,Jeffrey,\n" +
                "Frank,Scott,Eric,Stephen,Andrew,Raymond,Gregory,Joshua,Jerry,Dennis,Walter,Patrick,Peter,Harold,Douglas,H\n" +
                "enry,Carl,Arthur,Ryan,Roger";
        String[] names = namesAsString.split(",");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
              count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);

    }
}
