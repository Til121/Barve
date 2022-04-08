import java.io.*;


public class barve {
   
      String potDoDatoteke;
      
      
  
      barve(String pot){
          this.potDoDatoteke = pot;
  
          try {
              FileOutputStream fos = new FileOutputStream(this.potDoDatoteke);
              Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
              w.write("");//izpraznimo datoteko
          
              w.flush();// zapiše znake v datoteko in izprazne vmesnik/Buffer
              w.close();//zapremo izhodni tok
          }
          
          catch (Exception e){
              System.out.println("Napaka -> " + e.getMessage());
          }
                  
          }
  
   
       public void zapisiUvodnoHtmlZnacko (){
              try {
              FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
              Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
  
              w.write("<!DOCTYPE html>"); w.write("\r\n");
              w.write("<meta charset='utf-8'"); w.write("\r\n");
              w.write("<html>"); w.write("\r\n");
  
              w.flush();
              w.close();
            }
      
           catch (Exception e) {
              System.out.println("Napaka -> " + e.getMessage());
           }
      
          }
  
           //CSS oblikovanje
           public void zapisicssStil(){
          try {
              FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
              Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
  
          w.write("<style>");w.write("\r\n");
          w.write("table {");w.write("\r\n");
          w.write("font-family: arial, sans-serif;");w.write("\r\n");
          w.write("border-collapse: collapse;");w.write("\r\n");
          w.write("width: 100%;");w.write("\r\n");
          w.write("}   ");w.write("\r\n");
          w.write("td, th {");w.write("\r\n");
          w.write("border: 1px solid #dddddd;");w.write("\r\n");
          w.write("text-align: left;");w.write("\r\n");
          w.write("padding: 8px;");w.write("\r\n");
          w.write("}");w.write("\r\n");
          w.write("th {");w.write("\r\n");
          w.write("background-color: #4caf50;");w.write("\r\n");
          w.write("color: white");w.write("\r\n");
          w.write("}");w.write("\r\n");
         
          w.write("tr:hover {");w.write("\r\n");
          w.write("background-color: #abffab;");w.write("\r\n");
          w.write("}");w.write("\r\n");
          w.write("</style>");w.write("\r\n");
  
  
          w.flush();
         w.close();
          }
      
          catch (Exception e) {
              System.out.println("Napaka -> " + e.getMessage());
          }
      
      }
      
      public void zapisiNaslov(String naslov){
          try {
              FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
              Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
  
          w.write("<head>"); w.write("\r\n");
          w.write("<title>"+naslov+"</title>"); w.write("\r\n");
          w.write("</head>");  w.write("\r\n");
          w.write("<body>");  w.write("\r\n");
  
          w.flush();
          w.close();
          }
          catch (Exception e) {
              System.out.println("Napaka -> " + e.getMessage());
          }
      }
      
      public void zapisiZacetekTabele (){
          try{
              FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
              Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
  
              w.write("<table border='1' id='tabela1'>"); w.write("\r\n");
  
              w.flush();
              w.close();
      
          }
          catch (Exception e) {
              System.out.println("Napaka -> " + e.getMessage());
          }
      }
       
      public void zapisiTr (){
        try{
          FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
          Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

          w.write("<tr>"); w.write("\r\n");

          w.flush();
          w.close();
  
      }
      catch (Exception e) {
          System.out.println("Napaka -> " + e.getMessage());
      }
      }

    
      public void zapisiVrsticoTabele(Integer i1, String backgroundColor ){
        try{
            
            FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
            Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

      w.write("<td style='background-color:" + backgroundColor+"';>"+i1 +"</td>"); w.write("\r\n");
       
        w.flush();
        w.close();
        }
        catch (Exception e) {
            System.out.println("Napaka -> " + e.getMessage());
        }
    }

    public void zapisisum(int i1){
      try{
          
          FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
          Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

    w.write("<td>" + i1+"</td>"); w.write("\r\n");
     
      w.flush();
      w.close();
      }
      catch (Exception e) {
          System.out.println("Napaka -> " + e.getMessage());
      }
  }

  public void zapisiColsum(int i1){
    try{
        
        FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
        Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

  w.write("<td>" + i1+"</td>"); w.write("\r\n");
   
    w.flush();
    w.close();
    }
    catch (Exception e) {
        System.out.println("Napaka -> " + e.getMessage());
    }
}

    public void zapisiKoncTr (){
      try{
        FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
        Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

        w.write("</tr>"); w.write("\r\n");

        w.flush();
        w.close();

    }
    catch (Exception e) {
        System.out.println("Napaka -> " + e.getMessage());
    }
    }





    public void zapisiKonecTabele (){
      try{
          FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
          Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

          w.write("</table>");  w.write("\r\n");

          w.flush();
          w.close();
      
      }
      catch (Exception e) {
          System.out.println("Napaka -> " + e.getMessage());
      }
  }
  
  
  public void zapisiKoncneZnacke (){
      try{
          FileOutputStream fos = new FileOutputStream(this.potDoDatoteke, true);
          Writer w = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

      w.write("</body>");  w.write("\r\n");
      w.write("</html>");

      w.flush();
      w.close();
      }
      catch (Exception e) {
          System.out.println("Napaka -> " + e.getMessage());
      }
  }

    }

    
  


