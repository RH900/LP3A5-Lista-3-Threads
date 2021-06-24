/*Codificar uma classe Java para exibir uma mensagem por meio da 
implementação de uma interface chamada “InterfaceFuncional”,
adicionando uma anotação de interface funcional, utilizando do método 
“show” da interface para exibição da mensagem.*/



package listathreadex2;


public class ListaThreadEx2 {

    
    public static void main(String[] args) {
        
        MinhaInterfaceFuncional test = () -> {
            System.out.println("Hello World !");  
        };
       test.show();       
    }
    
}
