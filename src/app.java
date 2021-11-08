import java.util.ArrayList;

import static services.Modificador.mudaAPalavra;

public class app {
    public static ArrayList<String> nomes = new ArrayList<>();

    public static void main(String[] args) {
        nomes.add("edivaldo");
        nomes.add("duda");
        nomes.add("edu kng");

        mudaAPalavra(nomes, String::toUpperCase);
        mudaAPalavra(nomes, (String p) -> p + " galinha");
    }
}
