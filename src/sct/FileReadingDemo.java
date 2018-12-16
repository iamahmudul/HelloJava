package sct;

import java.io.*;

/**
 * Created by mahmudul on 12/17/2018.
 */
public class FileReadingDemo {
    static final String path = File.separator + "Apps" + File.separator + "test" + File.separator;
    public static void main(String[] args) {

        InputStream inputStream;
        OutputStream outputStream;

        int c;
        final int EOF = -1;
        outputStream = System.out;
        try {
            File file = new File(path + "word.doc");
            inputStream = new FileInputStream(file);
            try {
                while ((c = inputStream.read()) != EOF )
                    outputStream.write(c);
            } catch (IOException e){
                System.out.println("Writing Error: " + e.getMessage());
            } finally {
                try {
//                    System.out.println(outputStream.toString());
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e){
                    System.out.println("Closing Error: " + e.getMessage());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
