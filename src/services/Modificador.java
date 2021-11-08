package services;

import interfaces.Palavra;

import java.util.ArrayList;

public class Modificador {
    public static void mudaAPalavra(ArrayList<String> nomesMetodo, Palavra maiuscula){
        for(String nome: nomesMetodo) {
            System.out.println(maiuscula.mudaString(nome));
        }
    }
}