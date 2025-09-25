package Boletin2;

import java.io.*;

public class Ej2 {
    public static void main(String[] args) {


        try (PrintWriter escritor = new PrintWriter(new FileWriter("numNaturales.txt"))) {

            for (int i = 0; i <= 100; i++) {
                escritor.println(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
