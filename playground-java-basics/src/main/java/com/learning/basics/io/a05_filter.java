package com.learning.basics.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class a05_filter {
    public static void main(String[] args) throws IOException {
        byte[] data = "hello,world".getBytes("UTF-8");
        CountINputStream input = null;
        try {
            input = new CountINputStream(new ByteArrayInputStream(data));
            int n;
            while ((n = input.read()) != -1) {
                System.out.println((char)n);
            }
            System.out.println("Total read " + input.getBytesRead() + " bytes");
        } finally {
            input.close();
        }
    }
}

class CountINputStream extends FilterInputStream {

    public int count = 0;

    protected CountINputStream(InputStream in) {
        super(in);
    }

    public int getBytesRead() {
        return this.count;
    }

    @Override
    public int read() throws IOException {
        int n = in.read();
        if (n != -1) {
            this.count++;
        }
        return n;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int n = in.read(b, off, len);
        if (n != -1) {
            this.count++;
        }
        return n;
    }
}
