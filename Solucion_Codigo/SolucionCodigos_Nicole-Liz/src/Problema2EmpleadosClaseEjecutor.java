
import java.util.ArrayList;
import java.util.Scanner;
public class Problema2EmpleadosClaseEjecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean opc = true;
        String respt = null;
        double promedio_general;
        ArrayList<Problema2EmpleadosClaseBase> lista_empleados = new ArrayList<Problema2EmpleadosClaseBase>();
        while (opc) {

            System.out.println("Escoja una opcion: ");
            System.out.println("1. Agregar un empleado ");
            System.out.println("2. Mostrar Informacion ");
            System.out.println("3. Calcular Aumento de Salario ");
            System.out.println("4. Salir ");

            respt = teclado.next();

            if (respt.equals("1")) {
                System.out.println("Ingrese el nombre , salario y edad de el empleado ");
                Problema2EmpleadosClaseBase empleado = new Problema2EmpleadosClaseBase(teclado.next(), teclado.nextDouble(), teclado.nextInt());
                lista_empleados.add(empleado);
            }

            if (respt.equals("2")) {
                for (int i = 0; i < lista_empleados.size(); i++) {
                    System.out.println(lista_empleados.get(i).mostrarInformacion());
                }
            }

            if (respt.equals("3")) {
                System.out.println("Ingrese el porcentaje de aumento salarial ");
                double porcentaje = teclado.nextDouble();
                int numero_empleados = lista_empleados.size();
                double suma_salarios = 0;
                for (int i = 0; i < numero_empleados; i++) {
                    suma_salarios = suma_salarios + lista_empleados.get(i).getSalario();
                }
                promedio_general = suma_salarios / numero_empleados;
                for (int i = 0; i < numero_empleados; i++) {
                    System.out.println(lista_empleados.get(i).calcularAumentoSalario(porcentaje, promedio_general));
                }
            }
            if (respt.equals("4")) {
                break;
            }

        }

    }

}

