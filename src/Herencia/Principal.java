
package Herencia;
public class Principal{
    

  public static void main(String [] args){
       
// Crear un objeto de la clase Cliente y mostrar sus propiedades
Cliente cliente = new Cliente(30, "Juan", 123498, 1000.0);
cliente.mostrarDatosCliente();
System.out.println(" ");
//System.out.println("Nombre del Cliente: " + cliente.getNombre());
//System.out.println("Edad: " + cliente.getEdad());
//System.out.println("Teléfono: " + cliente.getTelefono());
//System.out.println("Crédito: " + cliente.getCredito());

// Crear un objeto de la clase Trabajador y mostrar sus propiedades
Trabajador trabajador = new Trabajador(40, "María", 987654321, 2000.0);
trabajador.mostrarDatos();
//System.out.println("Nombre del Trabajador: " + trabajador.getNombre());
//System.out.println("Edad: " + trabajador.getEdad());
//System.out.println("Teléfono: " + trabajador.getTelefono());
//System.out.println("Salario: " + trabajador.getSalario());

    }
}