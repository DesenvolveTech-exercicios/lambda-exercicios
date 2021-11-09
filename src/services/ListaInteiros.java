package services;

import interfaces.Inteiros;

import java.util.ArrayList;

public class ListaInteiros {
    public void listagem(ArrayList<Integer> listaInteiros, Inteiros inteiros){
        for(int i = 0; i < listaInteiros.size(); i++) {
            if (i == (listaInteiros.size()-1)) break;
            System.out.println(inteiros.nome(listaInteiros.get(i), listaInteiros.get(i+1)));
        }
    }
}
