//Trabajo en grupo Nicole-Liz 
public class Problema1Venta_Clasebase {
    double total = 0;
    double descuento;

    public void calcularDescuento(double precio, int num_productos) {
        if (precio >= 1000 && num_productos >= 10) {
            descuento = 10;

        } else if (precio <= 1000) {
            descuento = 5;

        } else {
            descuento = 0;

        }
        total = total + (precio * num_productos) - (precio * num_productos * (descuento / 100.0));

    }

    public String getDescuento() {
        return "El descuento es de :"+descuento ;
    }
    
    public String calcularprecioFinal(){
        return"El precio total de la venta es de :"+total;
    }

}
    
