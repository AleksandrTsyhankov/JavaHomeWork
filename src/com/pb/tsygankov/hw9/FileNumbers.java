package com.pb.tsygankov.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {

    static void createNumbersFile() throws IOException {
        FileWriter writer = new FileWriter("d:/numbers.txt");
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int[][] array = new int[10][10];

        try{for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt((max - min) + 1) + min;
                writer.write(array[i][j] + " ");
                }
            writer.write("\n");
        }

            writer.close();
        } catch(Exception exception) {
            System.out.println("File write error: " + exception);
        }
    }


    static void createOddNumbersFile  () throws Exception {
        Path numbersFile = Paths.get("d:/numbers.txt");
        FileWriter writer = new FileWriter("d:/odd-numbers.txt");
        Scanner readFileLines = new Scanner(numbersFile);
        Scanner readFileNumbers = new Scanner(numbersFile);

        try{
            int lines = 0;
            int numbers = 0;

            while(readFileLines.hasNextLine()) {
                lines++;

                readFileLines.nextLine();
            }

            int[][] nums = new int[lines][lines];
            String newArray[][] = new String[lines][lines];

            while(readFileNumbers.hasNextInt()) {
                numbers++;

                for(int i = 0; i < lines; i++) {
                    for (int j = 0; j < lines; j++) {
                        nums[i][j] = readFileNumbers.nextInt();
                    }
                }
            }



            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < lines; j++) {
                    newArray[i][j] = String.valueOf(nums[i][j]);
                    int n = Integer.parseInt(newArray[i][j]) % 2 == 0 ? 0 : Integer.parseInt(newArray[i][j]);
                    writer.write(n + " ");
                }
                writer.write("\n");
            }

        } catch (Exception exception) {
            System.out.println("File read error: " + exception);
        }

        writer.close();
        readFileLines.close();
        readFileNumbers.close();
    }

        public static void main (String[] args) throws Exception {

            createNumbersFile();
            createOddNumbersFile();
        }
    }

