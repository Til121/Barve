import java.util.LinkedList;
import java.io.*;
import java.util.List;

public class bral {

   public static void main(String[] args) {

      Reader btd = new Reader();
      List st1 = btd.Branje("D:\\Faks\\Faks_3\\JAVA\\Seminarska\\2\\stevila.txt");
      List br1 = btd.Branje("D:\\Faks\\Faks_3\\JAVA\\Seminarska\\2\\barv.txt");

      barve bar = new barve("D:\\Faks\\Faks_3\\JAVA\\Seminarska\\2\\test.html");
      bar.zapisiUvodnoHtmlZnacko();
      bar.zapisicssStil();
      bar.zapisiNaslov("Tabela");
      bar.zapisiZacetekTabele();
      bar.zapisiTr();

      int rowSum = 0;
      for (int i = 0; i < st1.size(); i++) {
         List listOfNumbers = (List) st1.get(i);
         List listOfColors = (List) br1.get(i);
         rowSum += (int) listOfNumbers.get(i);
         int colSum = 0;
         for (int y = 0; y < listOfNumbers.size(); y++) {
            int number = (int) listOfNumbers.get(y);
            int color = (int) listOfColors.get(y);
            colSum += (int) listOfNumbers.get(i);

            String backgrounColor = "";

            switch (color) {
               case 1:
                  backgrounColor = "#FF7F7F";
                  break;

               case 2:
                  backgrounColor = "#90EE90";
                  break;

               case 3:
                  backgrounColor = "#ADD8E6";
                  break;

               case 4:
                  backgrounColor = "#FFFF9E";
                  break;

               case 5:
                  backgrounColor = "#FFB347";
                  break;

               case 6:
                  backgrounColor = "#B19CD9";
                  break;

               default:
                  backgrounColor = "white";
                  break;

            }

           
            bar.zapisiVrsticoTabele(number, backgrounColor, rowSum);
            // izpiši v HTML tabelo ... barve ...
            
         }
         
      }
      bar.zapisiKoncTr();
      
      bar.zapisiKonecTabele();
      bar.zapisiKoncneZnacke();
   }

}
