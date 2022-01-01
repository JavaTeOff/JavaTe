package org.JavaTe.tools;

import java.io.File;
import java.io.IOException;

public class FileSystem {
    /**
     * @author ferderplays
     */
    /**
     * What does the function below do?:
     * -> It creates a temporary file
     * How can it make my coding easier?:
     * -> By making u type "ctf("<name>", "<extension/type>");", instead of
     * "File.createTempFile("<name>","<extension>");"
     */
    public static void ctf(String prefix, String suffix) throws IOException {
        File.createTempFile(prefix, suffix);
    }
}
