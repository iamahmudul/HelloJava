package sct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mahmudul on 12/17/2018.
 */
public class FileReadingCharacterStream {
    public static void main(String[] args) throws IOException {
        System.out.println(Constants.path);
        FileReader fileReader = new FileReader(Constants.path + "word.doc");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        while ((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        fileReader.close();
    }
}
