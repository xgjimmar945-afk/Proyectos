package Boletin2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1BF {
    public static void main(String[] args) {

        try (BufferedReader fic = new BufferedReader(new FileReader("Reader.txt"))){
            String linea = "";
            while ((linea = fic.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
