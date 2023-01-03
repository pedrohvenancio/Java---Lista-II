package Exercicio_1.Application;
import java.util.Scanner;

import Exercicio_1.src.Grafo;


public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x, z;
        Grafo grafo = new Grafo();
/* 
        System.out.println("Digite dois numeros inteiros e descubra se eles são vizinhos:");
        x = input.nextInt();
        z = input.nextInt();

        grafo.Vizinhos(x, z);
*/
        System.out.println("Digite um numero inteiro e descubra seus vertices:");
        x = input.nextInt();

        grafo.ListarVizinhos(x);


        input.close();
    }
}
