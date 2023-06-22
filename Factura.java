public class Factura extends Cliente { //Herencia con Cliente
//Atributos


    private int cantidad;

//contructor 


    public Factura(String nombre,int cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    //Metodos
    public void calcularTotal(){
        
    }
    public void verDetalle() {
        
    }
//getter


    public int getCantidad() {
        return cantidad;
    }
}
