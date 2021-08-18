/**
 * @comments Clase Panadero.java.
 * @comments Clase hija que hereda (extends) de la clase padre Empleado.
 * @comments Hace uso de los atributos de la clase padre, y adquiere atributos propios.
 * @comments Crea los metodos set y get correspondientes a los atributos propios de la clase.  
 * @comments Fecha de creacion: 07-07-2020
 * @comments Ultima ediccion:  22/07/2020
 */
package laboratorio.pkg1;

/**
 *
 * @author Jhon Edward Correa, Natalia Andrea Giraldo, Miguel Angel Paz.
 */

public class Panadero extends Empleado
{
    
    //Atributos propios de la clase
    private int panesHora;
    private String chef;
    
    //constructor vacio para usar las funciones de la clase panadero
    public Panadero(){}
    //contrsuctor con los atributos que entran en el array y guardar sus datos
    public Panadero ( String chef, int panesHora, String nombre, double identificacion, String categoria)
    {
        super(nombre, identificacion, categoria);//Se hace llamado a los atributos y metodos de la clase padre.
        this.chef = chef;
        this.panesHora = panesHora;
    }//fin del constructor 
    
    //Métodos 
    /**
     * @return the panesHora
     */
    public int getPanesHora() {
        return panesHora; 
    }//Fin getPanesHora

    
    /**
     * @param chefTemp the panesHora to set
     */
    public void setPanesHora(int chefTemp) {
        panesHora += chefTemp;
    }//Fin setPanesHora

    
    /**
     * @return the chef
     */
    public String isChef() {
        return chef;
    }//Fin isChef

    
    /**
     * @param chef the chef to set
     */
    public void setChef(String chef) {
        this.chef = chef;
    }//Fin setChef
    
    
    /**
     * @return Salario según la categoria.
     */
    public int calcularSalario()
    {
        
        if("novato".equals(getCategoria()))
        {
            
            return 500000;
            
        }
        else
        {
            if("normal".equals(getCategoria())) 
            {
                return 1000000;
            }
            else
            {
                 return 2000000;
            }
        }
    }//fin del metodo calcularSalario
    
}//Fin de la clase Panadero
