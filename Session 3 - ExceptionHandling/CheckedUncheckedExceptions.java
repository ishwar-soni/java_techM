package com.upGrad;

import java.io.*;

public class CheckedUncheckedExceptions {

    //checkedExceptions
    private static void checkedExceptionWithTryCatch() {
        File file = new File("not_existing_file.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //uncheckedExceptions
    public static void readFile() { try {
            FileReader file = new FileReader("pom.xml");
            file = null;
            file.read();
        } catch (IOException e) {
            //Alternate logic
            e.printStackTrace();
        }
    }
}
