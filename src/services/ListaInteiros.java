package services;

import interfaces.Inteiros;

import java.util.ArrayList;

public class ListaInteiros {
    public ArrayList<Integer> listagem(ArrayList<Integer> listaInteiros, Inteiros inteiros){
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0; i < listaInteiros.size(); i++) {
            if (i == 3) break;
            newList.add(inteiros.nome(listaInteiros.get(i), listaInteiros.get(i+1)));
            System.out.println(inteiros.nome(listaInteiros.get(i), listaInteiros.get(i+1)));
        }
        return newList;
    }
}
