/**
 * @comments Clase ProductorAudiovisual.java.
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

public class ProductorAudiovisual extends Empleado
{
    //Atributos de la clase
    private String[] tecnologias;
    private int cobroHora;
    
    //Constructor de la clase ProductorAudiovisual
    public ProductorAudiovisual (String[] tecnologias, int cobroHora,String nombre, double identificacion, String categoria)
    {
        super(nombre, identificacion, categoria);//Se hace llamado a los atributos y metodos de la clase padre.
        this.tecnologias = tecnologias;
        this.cobroHora = cobroHora;
    }//Fin del constructor
    
    //Métodos 
    /**
     * @return the tecnologias
     */
    public String[] getTecnologias() {  
        return tecnologias;
    }//Fin getTecnologias

    
    /**
     * @param tecnologias the tecnologias to set
     */
    public void setTecnologias(String[] tecnologias) {
        this.tecnologias = tecnologias;
    }//Fin setTecnologias

    
    /**
     * @return the cobroHora
     */
    public int getCobroHora() {
        return cobroHora;
    }//Fin getCobroHora

    
    /**
     * @param cobroHora the cobroHora to set
     */
    public void setCobroHora(int cobroHora) {
        this.cobroHora = cobroHora;
    }//Fin setCobroHora
    
    
    /**
     * 
     * @param cobroHora
     * @param salario
     * @return Suma de cobroHora + salario
     */
    public int calcularSalario(int cobroHora, int salario){
        
        return cobroHora+salario;
    }//Fin metodo calcularSalario
    
    
    /**
     * @return El Salario según la categoria
     */
    public int calcularSalarioProductor()
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
    }//Fin calcularSalarioProductor
    
}//Fin de la clase ProductorAudiovisual.
