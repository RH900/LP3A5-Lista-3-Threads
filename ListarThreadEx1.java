/*Elaborar uma classe Java que possui uma lista de cinco números inteiros,
um método que receba a lista e a expressão lambda para imprimir todos 
os números, assim como o quadrado, o dobro e somar mais 3 em cada
um dos elementos da lista.
*/





package listarthreadex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;



public class ListarThreadEx1 {

  
    public static void main(String[] args) {
     
        List<Integer> list = Arrays.asList(1 ,2 ,3 ,4, 5);
        
        list.forEach( l -> System.out.println("Numeros da lista : "+l));
        
        
        System.out.println("Ao quadrodo");
        aplicaCalculo(list, (n) -> n*n);
        
        System.out.println("2x o numero");
        aplicaCalculo(list, (n) -> n*2);
        
        System.out.println("Soma 3");
        aplicaCalculo(list, (n) -> n+3);
        
        
        
    }
    public static void aplicaCalculo(List<Integer> list, IntFunction<Integer> function ){
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n +" ");
        });
    }

    
}