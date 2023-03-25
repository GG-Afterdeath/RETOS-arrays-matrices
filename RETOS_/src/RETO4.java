import java.util.Scanner;

public class RETO4 {
    
    public static void main(String[] args){
        //Definir variables
        String producto;
        int precio;
        Scanner TT = new Scanner(System.in);
        //Crear la matriz
        Object machine[][] = new Object[5][2];
        
        System.out.println("Esta es la máquina expendedora: registre 5 productos y luego 5 precios.");
        
        for (int f =0; f <5; f++) {
            System.out.println("Ingrese el nombre del producto: ");
            producto =TT.next();
            machine[f][0] = producto;
            System.out.println("Ingrese el valor del producto: ");
            precio =TT.nextInt();
            machine[f][1] =precio;
            System.out.println("Producto " + (f+1) + " registrado: " + producto + " -- " + precio);
        }
        
        System.out.println("Productos registrados:");
        for (int f = 0; f <5; f++) {
            for (int c =0; c <2; c++) {
                System.out.print(machine[f][c] + " ");
            }
            System.out.println(" ");
        }
    TT.close();
    }
}