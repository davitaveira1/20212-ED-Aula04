package Matriz;

import java.util.Scanner;


public class Ex1 {
    
    public static void main(String[] args) {
        
        int[][] mat;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a ordem da matriz: ");
        int n = sc.nextInt();
        
        mat = new int[n][n];
        
        //preencher a matriz
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        //imprimir matriz
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Elemento["+i+"]["+j+"]: "+mat[i][j]);
            }
        }  
        System.out.println("=========================");
        System.out.println("Elementos da diagonal principal:");
        //valores da diagonal principal
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    System.out.println("Elemento["+i+"]["+j+"]: "+mat[i][j]);
            }
        }    
        
        System.out.println("=========================");
        int cont=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]<0){
                    System.out.println("Elemento["+i+"]["+j+"]: "+mat[i][j]);
                    cont++;
                }
                    
            }
        }

        System.out.println("Quantidade de elementos negativos: "+cont);
        
        
        
    }
    
}
