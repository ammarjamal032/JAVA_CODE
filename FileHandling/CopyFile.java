package FileHandling;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
     
      try {
//    	  File myObj = new File("file4.txt");
//          if (myObj.createNewFile()) {
//            System.out.println("File created: " + myObj.getName());
//            System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
//          } else {
//            System.out.println("File already exists.");
//          }
          
         in = new FileReader("HCL JAVA Series\\file.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         
      }
      catch(IOException ex){
     	 System.out.println(ex);
      }
      finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
