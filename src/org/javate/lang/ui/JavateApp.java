package org.javate.lang.ui;

import java.awt.*;

import javax.swing.*;

public class JavateApp extends JFrame {
    public JavateApp() {
        this.setTitle("My Swing App");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public JavateApp(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public JavateApp(String title, int width, int height, boolean centered) {
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width, height);
        if (centered) this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Container contentpane() {
        return this.getContentPane();
    }
}
