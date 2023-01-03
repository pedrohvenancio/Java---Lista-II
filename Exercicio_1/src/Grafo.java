package Exercicio_1.src;

public class Grafo {
    private int[][] grafo = 
   {{0,1,0,0,1},
    {1,0,1,1,1},
    {0,1,0,1,0},
    {0,1,1,0,1},
    {1,1,0,1,0}};
    
    

    public void Vizinhos(int num1, int num2){
        int i, j;
        int y=0;

        for (i = 0; i < 5; i++){
            if((i+1) == num1 || (i+1) == num2){
                for(j=0; j < 5;j++){
                    if((j+1) == num1 || (j+1) == num2){
                        if(this.grafo[i][j] == 1){
                            y = 1;
                        }
                    }
                }
            }
            
        }

        if(y == 1){
            System.out.println(num1 + " e " + num2 +  " são vizinhos.");
        }
        else{
            System.out.println(num1 + " e " + num2 + " não são vizinhos.");
        }
    }
    
    public void ListarVizinhos(int num1){
        int i, j, k;
        int[] y = new int[5];

        for (i = 0; i < 5; i++){
            if((i+1) == num1){
                for(j=0; j < 5;j++){
                        if(this.grafo[i][j] == 1) {
                            y[j] = j+1;
                        }                   
                }
            }
            
        }

        System.out.println("Os vertices desse numero são:");

        for(i = 0; i < 5; i++){
            if(y[i] != 0){
                System.out.println(y[i]);
            }
        }
    }

}
