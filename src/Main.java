import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Ingrese primer valor:");
        a = scanner.nextInt();

        System.out.println("Ingrese segundo valor:");
        b = scanner.nextInt();

        if(a==b){
            System.out.println("Los numeros no pueden ser iguales, ingrese valores distintos");
            return;
        }

        System.out.println("Ingrese el tercer valor:");
        c = scanner.nextInt();
        if (a==c || b==c){
            System.out.println("Los numeros no pueden ser iguales, ingrese valores distintos");
            return;
        }

        System.out.println("-------------------------------------------");

        if (a>b && a>c){
            System.out.println("El numero mayor es: " + a );
        }
        else if (b>a && b>c){
            System.out.println("El numero mayor es: " + b );
        }
        else {
            System.out.println("El numero mayor es: " + c );
        }

        System.out.println("-------------------------------------------");

        if (a<b && a<c){
            System.out.println("El numero menor es: " + a );
        }
        else if (b<a && b<c){
            System.out.println("El numero menor es: " + b );
        }
        else {
            System.out.println("El numero menor es: " + c );
        }
    }
}