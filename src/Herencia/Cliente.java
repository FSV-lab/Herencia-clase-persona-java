
package Herencia;

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, int telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public void mostrarDatosCliente(){
        System.out.println("Datos del Cliente:"+"\nEdad:"+getEdad()+"\nNombre:"+getNombre()+"\nTelefono:"+getTelefono()+"\nCredito:"+credito);
    }
}