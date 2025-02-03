import java.util.Scanner;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();

        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("ingreso " + result);
        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("ingreso " + result);

        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Maria", "Senior"));

        empleadoContoller.displayEmpleados();
        empleadoContoller.displayEmpleadosSoloNombres();
        empleadoContoller.displayLlaves();
        empleadoContoller.displayValues();
    }

    private static void runMapExample() {
        new Mapa();

    }

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();
        Scanner scanner = new Scanner(System.in);

        System.out.println("PRIMER EJERCICIO");
        System.out.println("Ingrese el primer string");
        String str1 = scanner.nextLine();

        System.out.println("Ingrese el segundo  string");
        String str2 = scanner.nextLine();
        boolean resultado = ejercicios.areAnagrams(str1, str2);
        System.out.println(resultado);

        System.out.println("SEGUNDO EJERCICIO");
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int tam = scanner.nextInt();
        int[] nums = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.println("Ingrese el numero de la posicion " + i);
            nums[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el objetivo a sumar");
        int obj = scanner.nextInt();

        int[] result = ejercicios.sumatoriaDeDos(nums, obj);
        if (result != null) {
            System.out.print("devolvemos [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("null");
        }

    }
}
