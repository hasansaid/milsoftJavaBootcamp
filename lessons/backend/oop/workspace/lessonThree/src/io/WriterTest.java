package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterTest {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer=null; // decleration
        try {
            String path ="C:\\Users\\Yusuf\\Desktop\\görev\\out.txt";
            FileWriter fileWriter = new FileWriter(path);
            writer = new BufferedWriter(fileWriter); // defination
            writer.write("HTML");
            writer.write("CSS");
            writer.write("JS");
            writer.write("AJAX");


            writer.close();
        }
        catch (Exception e){
            System.out.println("Yanlışlık oldu..");
            e.printStackTrace();
        }
        finally {
            if(writer!=null){
                try {
                    writer.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
