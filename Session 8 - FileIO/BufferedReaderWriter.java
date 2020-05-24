package com.upGrad;

import java.io.*;

public class BufferedReaderWriter {
    public static void bufferedReader()throws Exception{
        try{
            FileReader fr=new FileReader("D:\\testout.txt");
            BufferedReader br=new BufferedReader(fr);
            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
            br.close();
        }catch (FileNotFoundException file){
            System.out.println("this file was not found ");
        }
    }
    public static void buffredWriter() {
        //initializing FileWriter
        FileWriter upgrad_file;
        try {
            upgrad_file = new FileWriter("upGrad_file.txt");
            // Initialing BufferedWriter
            BufferedWriter upgradWrite = new BufferedWriter(upgrad_file);
            System.out.println("Buffered Writer starts writing");
            // Use of write() method to write the value in 'ABC' file
            // Printing E
            upgradWrite.write(69);
            // Printing 1
            upgradWrite.write(49);
            //Printing new line
            upgradWrite.write("\n");
            //Printing name of course - "upGrad full stack development"
            upgradWrite.write("upGrad Full Stack development");
            // Closing BufferWriter to end operation
            upgradWrite.close();
            System.out.println("Written successfully");
        }catch (IOException excpt)        {
            excpt.printStackTrace();
        }
    }
    public static void main(String[] args){
        buffredWriter();
    }
}
