/**
 * @comments Clase Empleado.java
 * @comments Atributos de la clase: nombre, identificacion, categoria.   
 * @comments Crea metodos set y get que hacen uso de los atributos propios de la clase, 
   que seran tambien usados por las clases hijas.
 * @comments Fecha de creacion: 07-07-2020
 * @comments Ultima ediccion:  22/07/2020
 */
package laboratorio.pkg1;

/**
 *
 * @author Jhon Edward Correa, Natalia Andrea Giraldo, Miguel Angel Paz.
 */

public class Empleado 
{
    //Definición variables:
    private String nombre;
    private double identificacion;
    private String categoria;
    private int salarioTotal;
    private static int contador;
    
    
    //Construcror clase Empleado
    public Empleado(){}
    public Empleado (String nombre, double identificacion, String categoria){
        
        this.nombre=nombre;
        this.identificacion = identificacion;
        this.categoria = categoria;
        
    }//fin constructor
    
    //Metodos 
    /**
     * @return the salarioTotal
     */
    public int getSalarioTotal() {
        return salarioTotal;
    }//Fin getSalarioTotal

    
    /**
     * @param salarioTotalTemp the salarioTotal to set
     * calcula el salario total de los empleados 
     */
    public void SalarioTotal(int salarioTotalTemp) {
        setSalarioTotal(getSalarioTotal() + salarioTotalTemp);
    }//Fin SalarioTotal
    
    
    /**
     * Metodo getNombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }//Fin getNombre

    
    /**
     * Metodo setNombre.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin setNombre

    
    /**
     * Metodo getIdentificación.
     * @return the identificacion
     */
    public double getIdentificacion() {
        return identificacion;
    }//Fin getIdentificacion

    
    /**
     * Metodo setIdentificacion.
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }//Fin setIdentificacion

    
    /**
     * Metodo getCategoria.
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }//Fin getCategoria

    
    /**
     * Metodo setCategoria.
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }//Fin setCategoria
    
    
    /**
     * @return El contador de Empleados categoria "Canchero"
     */
    public int  contarCancheros()
    {
        if("canchero".equals(getCategoria()))
        {
             return contador++;
        }
        return getContador();  
    }//Fin contarCancheros
    
    
    /**
     * Metodo getIdentificación.
     * @return the identificacion
     */
    public int getContador() {
        return contador;
    }//Fin getContador

    
    /**
     * @param salarioTotal the salarioTotal to set
     */
    public void setSalarioTotal(int salarioTotal) {
        this.salarioTotal = salarioTotal;
    }//Fin setSalarioTotal

    
    /**
     * @param aContador the contador to set
     */
    public static void setContador(int aContador) {
        contador = aContador;
    }//Fin setContador
    
}// Fin clase Empleado.
