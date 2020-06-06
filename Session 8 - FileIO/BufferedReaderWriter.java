package com.upGrad;

import java.io.*;

public class BufferedReaderWriter {
    public static void readDataFromFile()throws Exception{
        try{
            FileReader fr=new FileReader("D:\\upGrad_file.txt");
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
    public static void writeDataOnFile() {
        //initializing FileWriter
        FileWriter upgrad_file;
        try {
            upgrad_file = new FileWriter("upGrad_file.txt");
            // Initialing BufferedWriter
            BufferedWriter upgradWrite = new BufferedWriter(upgrad_file);
            System.out.println("Starting to write on the document");
            // Use of write() method to write the value in 'upGrad_file' file
            // Printing F
            upgradWrite.write(70);
            // Printing 5
            upgradWrite.write(53);
            //Printing new line
            upgradWrite.write("\n");
            //Printing name of course - "upGrad full stack development"
            upgradWrite.write("upGrad Full Stack development");
            //adding a new line using newLine()
            upgradWrite.newLine();
            //last statement on the file
            upgradWrite.write("Ending the document here");
            // Closing BufferWriter to end operation
            upgradWrite.close();
            System.out.println("Written successfully");
        }catch (IOException excpt)        {
            excpt.printStackTrace();
        }
    }
    public static void readDataFromConsole() throws IOException {
        //read data from console input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String string = reader.readLine();
        // Printing the read line
        System.out.println(string);
    }
    public static void main(String[] args) throws IOException {
        writeDataOnFile();
    }
}

