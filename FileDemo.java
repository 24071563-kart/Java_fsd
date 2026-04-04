import java.io.*;

public class FileDemo {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("Sample58.txt");
            fw.write("Welcome to java file handling!!");
            fw.close();

            FileReader fr = new FileReader("Sample58.txt");
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
            fr.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
