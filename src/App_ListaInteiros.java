import services.ListaInteiros;

import java.util.ArrayList;

public class App_ListaInteiros {
    public static ArrayList<Integer> inteiros = new ArrayList<>();

    public static void main(String[] args) {
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(30);
        inteiros.add(40);

        new ListaInteiros().listagem(inteiros, (int g, int p) -> g+p);
    }
}
