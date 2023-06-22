public class Trago {
//Atributos
    private int id;
   private  String nombre;
   private int precio;
   

//constructor

    public Trago(String nombre,  int precio ,int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id=id;
    }

//Metodos

    public void tragos() {
     System.out.println("nombre del trago:"+getNombre() + "el precio es :"+getPrecio()  );
     
        
    }
//getter

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getid() {
        return id;
    }
}
