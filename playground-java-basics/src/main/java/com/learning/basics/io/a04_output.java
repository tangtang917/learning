package com.learning.basics.io;

import java.io.*;

public class a04_output {
    public static void main(String[] args) throws IOException {
        // 将若干个字节写入文件流
        File file = new File("D:\\readme.txt");
        /*FileOutputStream output = new FileOutputStream(file);
        output.write(72);
        output.write(101);
        output.write(108);
        output.write(108);
        output.write(111);
        output.close();*/

        // 每次写入一个字节非常麻烦，更常见的方法是一次性写入若干字节。这时，可以用OutputStream提供的重载方法void write(byte[])来实现：
        FileOutputStream output = null;
        try {
            output =  new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file);
            output.write("Hello World".getBytes("UTF-8"));
        } finally {
            output.close();
        }
    }
}
