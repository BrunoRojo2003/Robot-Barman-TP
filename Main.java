//Se importan las clases necesarias para el programa 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
// mensajes de bienvenida
    System.out.println("Bienvenidos a BarRobot");
    System.out.println("\n");
    Scanner scanner = new Scanner(System.in); 
//Pide su nombre       
        System.out.println("Hola ¿cual es su nombre?");
        String nombre=scanner.nextLine();  
        System.out.println("");
        System.out.println("Hola "+nombre +" esto son los tragos disponibles" );

// Se instancia los tragos poniendoles el nombre,precio,id
        Trago tragos1 =new Trago(" Fernet ",700,1);
        Trago tragos2 =new Trago(" Daiquiri ",400,2);
        Trago tragos3 =new Trago(" Mojito ",600,3);
        Trago tragos4 =new Trago(" Margarita ",900,4);
        Trago tragos5 =new Trago(" Negroni ",800,5);
      

        System.out.println("");

//Imprime los tragos 
        System.out.println(tragos1.getid()+tragos1.getNombre()+tragos1.getPrecio()+" $");
        System.out.println(tragos2.getid()+tragos2.getNombre()+tragos2.getPrecio()+" $");
        System.out.println(tragos3.getid()+tragos3.getNombre()+tragos3.getPrecio()+" $");
        System.out.println(tragos4.getid()+tragos4.getNombre()+tragos4.getPrecio()+" $");
        System.out.println(tragos5.getid()+tragos5.getNombre()+tragos5.getPrecio()+" $");
        
        System.out.println("Selecione cual le gustaria ");
        int tragoElegido = scanner.nextInt();

//pregunta la cantidad
        System.out.println("¿Cuanta cantidad?");
        int cantidaTrago = scanner.nextInt();

 // Cálculo del precio total por trago
        int tragosTotal1= cantidaTrago*tragos1.getPrecio();
        int tragosTotal2= cantidaTrago*tragos2.getPrecio();
        int tragosTotal3= cantidaTrago*tragos3.getPrecio();
        int tragosTotal4= cantidaTrago*tragos4.getPrecio();
        int tragosTotal5= cantidaTrago*tragos5.getPrecio();

// Se instancia las factura y hace Herencia con la clase Cliente 
        Factura fac1 =new Factura(tragos1.getNombre(), cantidaTrago);
        Factura fac2 =new Factura(tragos2.getNombre(), cantidaTrago);
        Factura fac3 =new Factura(tragos3.getNombre(), cantidaTrago);
        Factura fac4 =new Factura(tragos4.getNombre(), cantidaTrago);
        Factura fac5 =new Factura(tragos5.getNombre(), cantidaTrago);
        

        
 //Seleciona el trago elegido y lo prepara 


        switch (tragoElegido) {
            case 1: tragoElegido= 1;
            System.out.println("Su  "+ tragos1.getNombre() +" estara en un momento ");
            System.out.println("...");
            System.out.println("Aqui tiene su "+ cantidaTrago + tragos1.getNombre()+ " seria:"+tragos1.getPrecio()*cantidaTrago + " $" );
//          calcular el vuelto
            System.out.println("¿con cuanto paga ?");
            int pago1 = scanner.nextInt();
            int vuelto1 =pago1 - tragosTotal1;
            System.out.println( " su vuelto es:"+ vuelto1 + " $");


// Imprime la factura y mustra los datos de los tragos 
        System.out.println(" Gracias por visitar El BarRobot aca  tiene su factura ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                         Factura");
        System.out.println("Cliente:"+nombre);
        System.out.println("Precio: "+tragosTotal1 +"$" );
        System.out.println("Producto:"+tragos1.getNombre());
        System.out.println("Cantidad: "+ cantidaTrago);
// Mustra en la factura la fecha y hora de la compra 
        LocalTime horaActual = LocalTime.now(); 
        LocalDate fechaActual= LocalDate.now();
        System.out.println( "Hora: "+ horaActual);
        System.out.println("Fecha: "+ fechaActual);

        System.out.println("------------------------------------------------------------");

                break;
        
            case 2 : tragoElegido=2;
             System.out.println("Su  "+ tragos2.getNombre() +" estara en un momento ");
            System.out.println("...");
            System.out.println("Aqui tiene su "+ cantidaTrago + tragos2.getNombre()+ " seria:"+tragos2.getPrecio()*cantidaTrago + " $" );
//          calcular el vuelto
            System.out.println("¿con cuanto paga ?");
            int pago2 = scanner.nextInt();
            int vuelto2 =pago2 - tragosTotal2 ;
            System.out.println( " su vuelto es:"+ vuelto2 + " $");


 //          Factura
                System.out.println(" Gracias por visitar El BarRobot aca  tiene su factura ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                         Factura");
        System.out.println("Cliente:"+nombre);
        System.out.println("Precio: "+tragosTotal2 +"$" );
        System.out.println("Producto:"+tragos2.getNombre());
        System.out.println("Cantidad: "+ cantidaTrago);

        LocalTime horaActua2 = LocalTime.now(); 
        LocalDate fechaActua2= LocalDate.now();
        System.out.println( "Hora: "+ horaActua2);
        System.out.println("Fecha: "+ fechaActua2);

        System.out.println("------------------------------------------------------------");

                break;
            case 3: tragoElegido=3;
            System.out.println("Su "+ tragos3.getNombre() +"estara en un momento ");
            System.out.println("...");

            System.out.println("Aqui tiene su "+ cantidaTrago + tragos3.getNombre()+ " seria:"+tragos3.getPrecio()*cantidaTrago + " $" );
//          calcular el vuelto
            System.out.println("¿con cuanto paga ?");
            int pago3 = scanner.nextInt();
            int vuelto3 =pago3 - tragosTotal3 ;
            System.out.println( " su vuelto es:"+ vuelto3 + " $");

            //          Factura
                System.out.println(" Gracias por visitar El BarRobot  tiene su factura ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                         Factura");
        System.out.println("Cliente:"+nombre);
        System.out.println("Precio: "+tragosTotal3 +"$" );
        System.out.println("Producto:"+tragos3.getNombre());
        System.out.println("Cantidad: "+ cantidaTrago);

        LocalTime horaActua3 = LocalTime.now(); 
        LocalDate fechaActua3= LocalDate.now();
        System.out.println( "Hora: "+ horaActua3);
        System.out.println("Fecha: "+ fechaActua3);

        System.out.println("------------------------------------------------------------");

            break;
            case 4: tragoElegido=4;
            System.out.println("Su "+ tragos4.getNombre() +"estara en un momento ");
            System.out.println("...");
             System.out.println("Aqui tiene su "+ cantidaTrago + tragos4.getNombre()+ " seria:"+tragos4.getPrecio()*cantidaTrago + " $" );
//          calcular el vuelto
            System.out.println("¿con cuanto paga ?");
            int pago4 = scanner.nextInt();
            int vuelto4 =pago4 - tragosTotal4 ;
            System.out.println( " su vuelto es:"+ vuelto4 + " $");

              //          Factura
                System.out.println(" Gracias por visitar El BarRobot  tiene su factura ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                         Factura");
        System.out.println("Cliente:"+nombre);
        System.out.println("Precio: "+tragosTotal4 +"$" );
        System.out.println("Producto:"+tragos4.getNombre());
        System.out.println("Cantidad: "+ cantidaTrago);

        LocalTime horaActua4 = LocalTime.now(); 
        LocalDate fechaActua4= LocalDate.now();
        System.out.println( "Hora: "+ horaActua4);
        System.out.println("Fecha: "+ fechaActua4);

        System.out.println("------------------------------------------------------------");

            break;

            case 5: tragoElegido=5;
            System.out.println("Su "+ tragos5.getNombre() +"estara en un momento ");
            System.out.println("...");
             System.out.println("Aqui tiene su "+ cantidaTrago + tragos5.getNombre()+ " seria:"+tragos5.getPrecio()*cantidaTrago + " $" );
//          calcular el vuelto
            System.out.println("¿con cuanto paga ?");
            int pago5 = scanner.nextInt();
            int vuelto5 =pago5 - tragosTotal5 ;
            System.out.println( " su vuelto es:"+ vuelto5 + " $");


            //          Factura
                System.out.println(" Gracias por visitar El BarRobot aca  tiene su factura ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                         Factura");
        System.out.println("Cliente:"+nombre);
        System.out.println("Precio: "+tragosTotal5 +"$" );
        System.out.println("Producto:"+tragos5.getNombre());
        System.out.println("Cantidad: "+ cantidaTrago);

        LocalTime horaActua5 = LocalTime.now(); 
        LocalDate fechaActua5= LocalDate.now();
        System.out.println( "Hora: "+ horaActua5);
        System.out.println("Fecha: "+ fechaActua5);

        System.out.println("------------------------------------------------------------");

            break;
        }
} }