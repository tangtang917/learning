package com.learning.basics.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a02_input {
    public static void main(String[] args) throws IOException {
        // FileInputStream是InputStream的一个子类。顾名思义，FileInputStream就是从文件流中读取数据
        FileInputStream input = null;
        try {
            input = new FileInputStream("D:\\codex-copy.log");
            for(;;){
                int n = input.read();
                if( n == -1 ) break;
                System.out.println(n);
            }
        } finally {
            input.close();
        }

    }
}
