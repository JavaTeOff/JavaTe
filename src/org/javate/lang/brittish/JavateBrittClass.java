package org.javate.lang.brittish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import java.awt.Color;

import javax.swing.JFrame;

import org.javate.lang.ui.JavateApp;

public class JavateBrittClass {
    /*
     * 
     * Brittish version of Javate, so that the britts dont go after me
     * 
     */

     public static void print(Object x) {
        System.out.print(x);
    }

    public static void println(Object x) {
        System.out.println(x);
    }

    public static void printf(String format, Object... x) {
        System.out.printf(format, x);
    }

    public static String html(String url) {
        String html = "";
        try {
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            while ((line = br.readLine()) != null) {
                html += "\n" + line;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            println("ERROR: " + e.getMessage() + " | " + e.getCause() + " | " + url);
        }
        return html;
    }

    public static Scanner SIscan() {
        return new Scanner(System.in);
    }

    public static String getSILine() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public static String getSIString() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.next();
        }
    }

    public static int getSIInt() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }

    public static String jsonify(Object x) {
        if (x instanceof String || x instanceof CharSequence) return "{ \"object\": \"" + x + "\" }";
        else if (x instanceof Character) return "{ \"object\": \'" + x + "\' }";
        return "{ \"object\": " + x + " } ";
    }

    public static List<Object> list(Object x) {
        if (x instanceof String || x instanceof CharSequence) {
            return Arrays.asList("\"" + x + "\"");
        } else if (x instanceof Character) {
            return Arrays.asList("\'" + x + "\'");
        }
        return Arrays.asList(x);
    }

    public static List<Object> list(Object... x) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            if (x[i] instanceof String || x[i] instanceof CharSequence) {
                list.add("\"" + x[i] + "\"");
            } else if (x[i] instanceof Character) {
                list.add("\'" + x[i] + "\'");
            } else {
                list.add(x[i]);
            }
        }
        return list;
    }

    public static String b64encode(byte[] x) {
        return Base64.getEncoder().encodeToString(x);
    }

    public static byte[] b64decode(String x) {
        return Base64.getDecoder().decode(x);
    }

    public static String encode(String x, int rot) {
        String encoded = "";
        char[] encodedc = x.toCharArray();
        for (char c : encodedc) {
            c += rot;
            encoded += c;
        }
        return encoded;
    }

    public static String decode(String x, int rot) {
        String decoded = "";
        char[] decodedc = x.toCharArray();
        for (char c : decodedc) {
            c -= rot;
            decoded += c;
        }
        return decoded;
    }

    public static JavateApp createGUI() {
        return new JavateApp();
    }

    public static JavateApp createGUI(String title) {
        return new JavateApp(title);
    }

    public static JavateApp createGUI(String title, int width, int height, boolean centered) {
        return new JavateApp(title, width, height, centered);
    }

    public static Color colour(int r, int g, int b) {
        return new Color(r, g, b);
    }
}
