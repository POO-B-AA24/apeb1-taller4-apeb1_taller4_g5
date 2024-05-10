import java.util.Scanner;
public class Problema1Venta_Claseejecutor {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean opc = true;
        String respt = null;
        Problema1Venta_Clasebase venta = new Problema1Venta_Clasebase();

        while (opc) {

            System.out.print("Dame el precio y el numero de productos:  ");
            venta.calcularDescuento(teclado.nextDouble(), teclado.nextInt());
            System.out.println(venta.getDescuento());
            System.out.println("Deseamos comprar mas (S/N)?:");
            respt = teclado.next();
            if (respt.equals("N")) {
                System.out.println(venta.calcularprecioFinal());
                break;
            }

        }

    }

}