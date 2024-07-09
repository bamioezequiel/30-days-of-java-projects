import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Unit converter!");

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Ingrese el numero de las unidades a convertir:");
        System.out.println("( 1 ) Centimetros a pulgadas");
        System.out.println("( 2 ) Yardas a metros ");
        System.out.println("( 3 ) Kilometros a millas");
        int unit = scanner.nextInt();

        switch (unit) {
            case 1:
                System.out.println("Ingresa la cantidad de centimetros.");
                double cmToInch = scanner.nextDouble();
                double inch = cmToInch / 2.54;

                System.out.println("La cantidad de Centimetros (" + cmToInch + "cm) a Pulgadas es: " + inch);
                  break;
            case 2:
                System.out.println("Ingresa la cantidad de yardas.");
                double ydToMeter = scanner.nextDouble();
                double meter = ydToMeter * 0.9144;

                System.out.println("La cantidad de Yardas (" + ydToMeter + "cm) a Metros es: " + meter);
                break;
            case 3:
                System.out.println("Ingresa la cantidad de Kilometros.");
                double kmToMile = scanner.nextDouble();
                double mile = kmToMile * 0.621371;

                System.out.println("La cantidad de Kilometros (" + kmToMile + "cm) a Millas es: " + mile);
                break;
        
            default:
            System.out.println("Esa no es una opción.");
                break;
        }



    }
}
