package services;

import interfaces.InteirosToStr;

import java.util.ArrayList;

public class ImprimiNovaStr {
    public void imprimir(ArrayList<Integer> inteiros, InteirosToStr inteirosToStr){
        for(Integer inteiro:inteiros) {
            System.out.println(inteirosToStr.intToStr(inteiro));
        }
    }
}
