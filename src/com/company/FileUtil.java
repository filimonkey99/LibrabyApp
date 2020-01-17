package com.company;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    // read file "data.txt"
    //Scanner scanner = new Scanner(System.in);

    //Read from file...
    public static void readAllLines() {
        String fileName = "books.txt";
        try {

            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> readListAndAddContent(){
        String fileName = "books.txt";
        try{
            List<String> lines= Files.readAllLines(Paths.get(fileName));
            return lines;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    //Write some lines to a file
    public static void writeAllLines(List<String> listOfNames) {
        List<String> lines = new ArrayList<>();

        try {
            Path path = Paths.get("books.txt");
            Files.write(path, listOfNames, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
