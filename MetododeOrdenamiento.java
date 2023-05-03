package metodeordenamiento;

import java.util.Random;
import java.util.Scanner;

public class MetododeOrdenamiento {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int n;

        System.out.println("ingresa el tamaño del arreglo");
        n = sca.nextInt();

        int[] arreglo = random(n);

        System.out.println("Selecciona el metodo de ordenamiento ");
        System.out.println("1. Metodo burbuja");
        System.out.println("2. Metodo de seleccion");
        System.out.println("3. Metodo de inserccion");
        System.out.println("4. Metodo shell");
        System.out.println("5. Metodo QuickSort");
        System.out.println("6. Metodo Ackerman");
        int opcion = sca.nextInt();

        switch (opcion) {
            case 1:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                Burbuja.burbuja(arreglo);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                break;
            case 2:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                Seleccion.seleccion(arreglo);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                break;
            case 3:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                Inserccion.insercion(arreglo);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                break;

            case 4:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                Shell.shell(arreglo);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                break;

            case 5:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                QuickSort.quickSort(arreglo, 0, arreglo.length - 1);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                break;
                
                case 6:

                System.out.print("Ingrese m y n:\n");
                int m = sca.nextInt();
                int h = sca.nextInt();

                System.out.print("\nAckerman de " + m + " , " + h + " es:\n");

                    System.out.println(Ackerman.ack(m, h)); 

                break;

            default:
                System.out.print("Opcion no valida.");
                return;
        }
    }

    public static int[] random(int n) {
        int[] arreglo = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
        }
        return arreglo;
    }

}
