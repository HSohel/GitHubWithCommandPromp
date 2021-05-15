package javareview;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadWrite {

    public static void main (String [] Args)  {

       String dirPath="src"+File.separator+"main"+File.separator+"resources";
       File dir=new File(dirPath);
       if (!dir.exists()){
        dir.mkdirs();
       }

        File file = new File(dirPath+File.separator+"MyTextFile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream outputStream=new FileOutputStream(file);
            String myString="This is my String";
            outputStream.write(myString.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream is=new FileInputStream(file);
            int i;
            while ((i= is.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*FileWriter fw= null;
        try {
            fw = new FileWriter(file);
            fw.write("This is first line ");
            fw.write("This is second line ");
            fw.write("This is third line ");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileReader fr= null;
        try {
            fr = new FileReader(file);
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }

}
