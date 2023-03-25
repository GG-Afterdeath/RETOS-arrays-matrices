import java.util.Scanner;

public class RETO2 {
    
    public static void main(String[] args){
        //Declarar variables y scanner
        int n;
        Scanner uwu = new Scanner(System.in);

        System.out.println("Digíte la cantidad de datos que va a registrar");
        n = uwu.nextInt();

        //Creamos el array
        String com[] = new String[n];
        int t[] = new int[n];

        //Llenar arreglo
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese el nombre del deportista");
            com[i] = uwu.next();
            System.out.println("Ingrese el tiempo del susodicho");
            t[i] = uwu.nextInt();
        }

        //Imprimir valores ingresados
        for(int i = 0; i < n; i++){
            System.out.println("Nombre: \n"+ com[i]);
            System.out.println(t[i]);
        }

        // Buscar el mejor tiempo
        int mejor = t[0];
        for(int i = 1; i < n; i++){
            if(t[i] < mejor){
                mejor = t[i];
            }
        }
        System.out.println("El mejor tiempo fue " + mejor);
        System.out.println("Gracias por usar el sistema");
        uwu.close();
    }
}
