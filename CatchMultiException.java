package com.geekbang.exception;

import java.io.IOException;

public class CatchMultiException {
    public static void main(String[] args) {
        catchMultiNew();
        catchMultiOld();
    }

    private static void catchMultiOld() {
        try {
            throwMultiException(0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void catchMultiTypeMultiMatch() {
        try {
            throwMultiException(0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void catchMultiNew() {
        try {
            throwMultiException(0);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void throwMultiException(int i) throws ClassNotFoundException, IOException {
        switch (i) {
            case 1:
                throw new NullPointerException("demo");
            case 2:
                throw new ClassNotFoundException("demo");
            case 3:
                throw new IOException("demo");
        }
    }
}
