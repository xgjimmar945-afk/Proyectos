package Boletin2;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {

        try (PrintWriter escritor = new PrintWriter(new FileWriter("numPrimos.txt"))){
            int contador = 0;
            for (int i = 0; contador <= 20 ; i++) {
                if (esPrimo(i)){
                    escritor.println(i);
                    contador++;
                }
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader lector = new BufferedReader(new FileReader("numPrimos.txt"))){
            String linea;
            while((linea = lector.readLine())!=null){
                System.out.println(linea);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }
        }
        return primo;
    }
}
