package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest {
    public static void main(String[] args)  {

        try {
            String path = "C:\\Users\\Yusuf\\Desktop\\görev\\in.txt";
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            StringBuilder builder = new StringBuilder();

            while ((line=reader.readLine())!=null){
                // System.out.println(line);
                builder.append(line).append("\r\n");
            }

            reader.close();

            String text = builder.toString();

            System.out.println(text);
        }
        catch (Exception e){
            System.out.println("Bir Yanlışlık oldu...");
            e.printStackTrace();
        }

    }
}
