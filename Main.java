import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        double numero1 = scanner.nextDouble();

        System.out.println("Qual o segundo número?");
        double numero2 = scanner.nextDouble();
    
        scanner.nextLine();
        
        System.out.println("qual operação deseja fazer?(insira o simbolo da operação)");
        String operacao = scanner.nextLine();
        
        if (operacao.equals("+")){
            double resultado = numero1 + numero2;
            
 System.out.println("Resultado: " + resultado);
            
            
        } else if (operacao.equals("-")){
            double resultado = numero1 - numero2;
        
            
        
System.out.println("Resultado: " + resultado);
    
}       else if (operacao.equals("*")){
            double resultado = numero1 * numero2;
    
       System.out.println("Resultado: " + resultado);
    
    
    
    }         else if (operacao.equals("/")){
            if ( numero2==0) {
                System.out.println("Não é possivel dividir por zero.");
        }else{
            
              double resultado = numero1 / numero2;
       
        System.out.println("Resultado: " + resultado);

                 
    }    
}

    }  
}
