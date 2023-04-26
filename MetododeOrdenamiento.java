package metodeordenamiento;

import java.util.Arrays;
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
        int opcion = sca.nextInt();

        switch (opcion) {
            case 1:

                System.out.print("Arreglo:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

                burbuja(arreglo);

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

                seleccion(arreglo);

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

                insercion(arreglo);

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

                shell(arreglo);

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

                quickSort(arreglo, 0, arreglo.length - 1);

                System.out.print("\nArreglo ordenado:\n");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.print(arreglo[i] + " ");
                }

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

    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void seleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arreglo[i];
            arreglo[i] = arreglo[minIndex];
            arreglo[minIndex] = temp;
        }
    }

    public static void insercion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }

    public static void shell(int[] arreglo) {
        int n = arreglo.length;
        for (int mitad = n / 2; mitad > 0; mitad /= 2) {
            for (int i = mitad; i < n; i += 1) {
                int aux = arreglo[i];
                int j;

                for (j = i; j >= mitad && arreglo[j - mitad] > aux; j -= mitad) {
                    arreglo[j] = arreglo[j - mitad];
                }

                arreglo[j] = aux;
            }
        }
    }

    private static void quickSort(int[] arreglo, int izq, int der) {
        if (izq < der) {
            int pivotIndex = particion(arreglo, izq, der);
            quickSort(arreglo, der, pivotIndex - 1);
            quickSort(arreglo, pivotIndex + 1, der);
        }
    }

    private static int particion(int[] arreglo, int izq, int der) {
        int pivote = arreglo[der];
        int i = izq - 1;
        for (int j = izq; j < der; j++) {
            if (arreglo[j] < pivote) {
                i++;
                intercambio(arreglo, i, j);
            }
        }
        intercambio(arreglo, i + 1, der);
        return i + 1;
    }

    private static void intercambio(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}
