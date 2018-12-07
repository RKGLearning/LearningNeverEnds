package com.copart.training.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsExample {

        public static void main(String[] args) throws IOException{
                FileWriter file = new FileWriter("c:\\Data1.txt");
                file.write("Guru99");
                file.close();

        }
}
