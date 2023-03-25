import java.util.Scanner;
public class RETO1 {
    public static void main(String[] args){
//declaramos las variable a usar
        int n;
        Scanner tec=new Scanner(System.in);

        System.out.println("Especifique de cuanto quiere que sea el array");
        n=tec.nextInt();

//Creamos el array
        int num[]=new int [n];

//Llenamos el array
        for(int i=0; i<n; i++){
            System.out.println("Ponga el número en la posición "+ (i+1));
            num[i]=tec.nextInt();
        }
//Imprimimos los valores del arreglo
        for(int i=0; i<n; i++){
            if(num[i] %2==0){
                System.out.println("De todo ese chorro de números los pares son: " + num[i]);
            }
        }
        tec.close();
    }
}
