import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola vienvenido al programa de calculo de areas");

        System.out.println("Puedes calcular el area de estas figuras geometricas: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");

        System.out.print("Ingresa el numero de la figura geometrica que deseas calcular: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Codigo para calcular el area del cuadrado
                System.out.print("Para calcular el area del cuadrado, ingresa el lado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;
            case 2:
                // Codigo para calcular el area del rectangulo
                System.out.print("Para calcular el area del rectangulo, ingresa la base: ");
                double base = scanner.nextDouble();
                System.out.print("Para calcular el area del rectangulo, ingresa la altura: ");
                double altura = scanner.nextDouble();
                double areaRectangulo = base * altura;
                System.out.println("El area del rectangulo es: " + areaRectangulo);

                break;
            case 3:
                // Codigo para calcular el area del triangulo
            //para calcular el area del triangulo necesitamos la base y la altura
            System.out.print("Ingresa la base del triangulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingresa la altura del triangulo: ");
            double altura = scanner.nextDouble();
            double areaTriangulo = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + areaTriangulo);
                break;
            case 4:
                // Codigo para calcular el area del circulo

                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        scanner.close();
    }

}
