package View;

import kLn.Pilha;

public class Main {
    public static void main(String[] args) {

        int[] vec = {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1-5};
        Pilha pilha = new Pilha();
        int tam = vec.length - 1;
        int auxO = 0;
        int auxT = 0;
        int auxS = 0;
        for(int i = 0; i < tam; i++) {

            if(vec[i] >= 0) {
                pilha.push(vec[i]);
            }
            else {
                if (pilha.tamanho() >= 2) {
                    try {
                        auxO = pilha.pop();
                        auxT = pilha.pop();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                    auxS = auxO + auxT;

                    pilha.push(vec[i]);
                    pilha.push(auxS);


                }
            }
        }

        System.out.println("Tamanho da pilha: " + pilha.tamanho());

    }
}
