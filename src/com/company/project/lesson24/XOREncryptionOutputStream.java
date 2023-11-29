package com.company.project.lesson24;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XOREncryptionOutputStream extends FilterOutputStream {

    private final byte key;

    protected XOREncryptionOutputStream(OutputStream out, byte key) {
        super(out);
        this.key = key;
    }

    @Override
    public void write(int b) throws IOException {
        b ^= key;
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            b[i] ^= key;
        }
        super.write(b, off, len);
    }
}
