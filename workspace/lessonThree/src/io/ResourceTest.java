package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
// try with resources
public class ResourceTest {
    public static void main(String[] args) throws Exception {
        String path ="C:\\Users\\Yusuf\\Desktop\\görevX\\out.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            writer.write("HTML");
            writer.write("CSS");
            writer.write("JS");
            writer.write("AJAX");

        }
        catch (Exception e){
            System.out.println("Yanlışlık oldu..");
            e.printStackTrace();
        }



    }
}
