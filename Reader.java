import java.io.*;
import java.util.List;
import java.util.ArrayList;



public class Reader {

    public List Branje(String potDatoteke){

    try {
        File datoteka = new File(potDatoteke);
        BufferedReader vhod = new BufferedReader(new InputStreamReader(new FileInputStream(datoteka), "UTF-8"));

        String niz;
        String[] dataFromFileOne;

        List<List> listOfRows = new ArrayList<List>();

        while ((niz = vhod.readLine()) != null) {
           dataFromFileOne = niz.trim().split(" ");

           List<Integer> rowNumbers = new ArrayList<>();
           for (int index = 0; index < dataFromFileOne.length; index++) {
              rowNumbers.add(Integer.parseInt(dataFromFileOne[index]));
           }

           listOfRows.add(rowNumbers);

        }

    
        vhod.close();
        return (List) listOfRows;    
     }

     catch (Exception e) {
        System.out.println("Exception oz. error, t.j. napaka -> " + e.getMessage());
     }
     
    return null;
}
}