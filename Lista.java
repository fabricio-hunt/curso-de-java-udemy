import java.util.ArrayList;
/*import java.util.Scanner;*/

public class Lista {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fabrício");
        nomes.add("Davi");
        nomes.add("Sofhie");

        for (int indice = 0; indice < nomes.size(); indice++){
            System.out.println(nomes.get(indice));
        }
    }
}