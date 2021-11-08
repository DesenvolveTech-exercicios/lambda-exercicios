import interfaces.Palavra;

import java.util.ArrayList;

public class app {
    public static ArrayList<String> nomes = new ArrayList<>();

    public static void mudaAPalavra(ArrayList<String> nomesMetodo, Palavra maiuscula){
        for(String nome: nomesMetodo) {
            System.out.println(maiuscula.mudaString(nome));
        }
    }
    public static void main(String[] args) {
        nomes.add("edivaldo");
        nomes.add("duda");
        nomes.add("edu kng");

        mudaAPalavra(nomes, String::toUpperCase);
    }
}
