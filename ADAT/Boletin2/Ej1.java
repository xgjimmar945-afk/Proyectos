package Boletin2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
    
        try (FileReader fic = new FileReader("Reader.txt")){
            int n;
            String palabra = "";
            while ((n= fic.read()) != -1){
                palabra += (char) n;
            }
            System.out.println(palabra);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
