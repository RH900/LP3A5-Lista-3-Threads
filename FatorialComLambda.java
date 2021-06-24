/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package fatoriallambda;

import java.util.Scanner;
import java.util.function.IntFunction;

/**
 *
 * @author usuario1
 */
public class FatorialComLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        IntFunction<Long> fatorialCalc = FatorialComLambda::fatorial;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n = scan.nextInt();
        
        
       
        
        long fact = fatorialCalc.apply(n);
        System.out.println("Fatorial de " + n + " e "+ fact);
    }
    
    public static long fatorial(int n){
        if (n < 0){
            String erro ="Numero invalido";
            throw new IllegalArgumentException(erro);
        }
        if (n==0){
            return 1;
        }
        else {
            return n*fatorial(n-1);
        }
    }
    
}
