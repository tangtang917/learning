package com.learning.basics.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a03_input2 {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        try {
            input = new FileInputStream("D:\\codex-copy.log");
            byte[] bytes = new byte[1000];
            int n;
            while((n = input.read(bytes)) != -1){
                System.out.println("read " + n + " bytes");
            }
        } finally {
            input.close();
        }
    }
}
