import java.util.Scanner;

public class RETO3 {
    
    public static void main(String[] args){
//Scanner y definir matriz
        Scanner uwu = new Scanner(System.in);

        String cont[][] = new String[4][4];
        int ripit[][] = new int[4][4];

        System.out.println("JUEGO DE CONCÉNTRESE");

        //Capturar datos
        for (int c = 0; c < 4; c++) {
            
            for (int f = 0; f < 4; f++) {

                System.out.println("Digite la palabra en la columna " + (f + 1) + " fila " + (c + 1));
                cont[c][f] = uwu.next();
            }
        }

        
        System.out.println("Palabras digitadas: ");

       //Imprimir captura
        for (int c = 0; c < 4; c++) {

            for (int f = 0; f < 4; f++) {
                
                System.out.print(cont[c][f] + " ");
                
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (cont[c][f].equals(cont[i][j])) {
                            ripit[c][f]++;
                        }
                    }
                }
                
                if (ripit[c][f] > 1) {
                    System.out.print("(repetido " + ripit[c][f] + " veces) ");
                }
            }
            
            System.out.println(" ");
        }
    uwu.close();
    }
}
