//Trabajo en grupo Nicole-Liz 
public class Problema2EmpleadosClaseBase {
    public String nombre;
    private double salario;
    public int edad;

    public Problema2EmpleadosClaseBase(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String mostrarInformacion() {
        return "Informacion_empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }

    public double getSalario() {
        return salario;
    }

    public String calcularAumentoSalario(double porcentaje, double salario_promedio) {
        if (salario < salario_promedio) {
            salario = salario + (salario * (porcentaje / 100.0));
            return "El nuevo salario de " + nombre + " es de : " + salario;

        } else {
            return "No se aplica  el aumento salarial ";
        }

    }

}