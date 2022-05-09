import java.util.Scanner;
public class CicloFor {
    public static void main(String args[]){
        
        int ContadorDePar=0, ContadorDeImpar=0, N1;
      Scanner Captura=new Scanner(System.in);
      System.out.println("Ingrese hasta que numero desea saber los numeros pares e impares");
        N1=Captura.nextInt();
        for (int i = 1; i <= N1; i++){
            int E=i%2;
         if(E==0)
               ContadorDePar++;
             else {
                ContadorDeImpar++; 
           }
        }
        System.out.println("Total de pares: "+ContadorDePar);
        System.out.println("Total de impar: "+ContadorDeImpar);
        }
      
    
    }
