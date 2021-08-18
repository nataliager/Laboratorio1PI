/**
 * @comments Clase Florista.java.
 * @comments Clase hija que hereda (extends) de la clase padre Empleado.
 * @comments Hace uso de los atributos de la clase padre, y adquiere atributos propios.
 * @comments Crea los metodos set y get correspondientes a los atributos propios de la clase.  
 * @comments Fecha de creacion: 07-07-2020
 * @comments Ultima ediccion:  22/07/2020
 */
package laboratorio.pkg1;

/**
 * @author Jhon Edward Correa, Natalia Andrea Giraldo, Miguel Angel Paz.
 */

public class Florista extends Empleado
{
    //Atributos propios de la clase
    private int añosExperiencia;
    private String especializacion;
    private int interiores=0;
    private int exteriores=0;
    
    /*
     * @commnets constructor vacio para usar las funciones de la clase Florsita
     */
    public Florista(){}
    //contrsuctor con los atributos que entran en el array y guardar sus datos
    public Florista(int añosExperiencia, String especializacion, String nombre, double identificacion, String categoria)
    {
        super(nombre, identificacion, categoria);//Se hace llamado a los atributos y metodos de la clase padre.
        this.añosExperiencia =  añosExperiencia;
        this.especializacion =  especializacion;
        
    }//Fin del constructor
    
    //Métodos
    /**
     * @return interiores
     */
    public int getInteriores() {
        return interiores;
    }//fin getInteriores
    
    
    /**
     * @return exteriores
    */
    public int getExteriores() {
        return exteriores;
    }//fin getExteriores
    
    
    /**
     * @return añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }//Fin getAñosExperiencia

    
    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }//Fin setAñosExperiencia

    
    /**
     * @return La especialización
     */
    public String getEspecializacion() {
        return especializacion;
    }//Fin getEspecializacion
    
    
    /** 
     * 
     * @return conatdor de interiores o exteriores
    */
    public int contarEspecializaciones(String especialiazacionTemp){
        if("interiores".equals(especialiazacionTemp))
        {
            return interiores++;
        }
        else
        {
            return exteriores++;
        }
    }//Fin contarEspecializaciones

    
    /**
     * @param especializacion the especializacion to set
     */
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }//fin setEspecializacion
    
    
    /**
     * @return el salario según la categoria
    */
    public int calcularSalarioFlorista()
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
    }//fin metodo calcularSalarioFlorista
    
}// Fin de la clase Florista.
