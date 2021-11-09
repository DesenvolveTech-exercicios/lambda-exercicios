import services.ListaInteiros;

import java.util.ArrayList;

public class App_ListaInteiros {
    public static ArrayList<Integer> inteiros = new ArrayList<>();

    public static void main(String[] args) {
        ListaInteiros listaInteiros = new ListaInteiros();
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(30);
        inteiros.add(40);
        inteiros.add(5);
        inteiros.add(80);
        inteiros.add(4);
        System.out.println("---- Retorna nova lista----");
        listaInteiros.listagem(inteiros, Integer::sum);
        // expressão contida no segundo parametro
        // (int g, int p) -> g+p;
        System.out.println("----Returna media----");
        listaInteiros.listagem(inteiros,(int g, int p) -> (g+p)/2);
        System.out.println("----Retorna o maior valor em pares----");
        listaInteiros.listagem(inteiros, Math::max);
        // expressão contida no segundo parametro
        // (int g, int p) -> (g>=p) ? g:p;
    }
}
