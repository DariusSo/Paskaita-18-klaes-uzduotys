package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FailoBazineInformacija {
    String failoPavadinimas = "surikiuotiSkaiciai";
    String filePath = "C:\\Users\\Darius\\IdeaProjects\\Paskaita-18-klaes-uzduotys\\src\\main\\java\\org\\example\\";
    String failoDydis;
    String path = filePath + failoPavadinimas + ".txt";

    public String getFileSizeInKB(Path path) {
        try {
            long sizeInBytes = Files.size(path);
            long sizeInKB = sizeInBytes / 1024;
            return sizeInKB + " KB";
        } catch (IOException e) {
            System.err.println("Unable to determine file size: " + e.getMessage());
            return "Error";
        }
    }
}
