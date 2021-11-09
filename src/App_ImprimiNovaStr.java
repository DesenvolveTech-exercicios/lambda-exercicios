import services.ImprimiNovaStr;

import java.util.ArrayList;

public class App_ImprimiNovaStr {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();
        ImprimiNovaStr imprimiNovaStr = new ImprimiNovaStr();
        inteiros.add(12);
        inteiros.add(0);
        inteiros.add(24);
        inteiros.add(-74);
        inteiros.add(-14);
        inteiros.add(119);
        imprimiNovaStr.imprimir(inteiros,(int inteiro) -> "R$"+inteiro);
        imprimiNovaStr.imprimir(inteiros,(int inteiro) -> (inteiro>=0) ? inteiro + "<C>":inteiro + "<D>");
    }
}
