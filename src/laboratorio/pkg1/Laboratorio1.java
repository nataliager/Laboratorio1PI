/**
 * @comments Clase Laboratorio1
 * @comments Clase en donde se manejan los menus y se hace uso de la clase padre Empleado y sus hijas.
 * @comments Fecha de creacion: 07-07-2020.
 * @comments Ultima ediccion:  22/07/2020.
 */
package laboratorio.pkg1;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jhon Edward Correa, Natalia Andrea Giraldo, Miguel Angel Paz.
 */

public class Laboratorio1 
{
    /*
    * @comments Definir los colores para imprimir por consola. */
    public static final String RED = "\u001B[31m";//color rojo.
    public static final String GREEN = "\u001B[32m";//color verde.
    public static final String YELLOW = "\u001B[33m";//color amarillo.
    public static final String FIN = "\u001B[0m";//final.
    
    /**
     * @param args the command line arguments
     */
    
    //Main
    public static void main(String[] args) 
    {
        /*
        * @comments Instancias de las clases vacias para el uso de los metodos de las clases
        */
        Panadero panadero = new Panadero();
        Empleado empleado = new Empleado();
        Florista florista = new Florista();
        
        /* 
        * @commnets Variables que funcionan como indice de los arreglos de panadero, florsita y productor audiovisual 
        */
        int h=0;
        int f=0;
        int k = 0;
        
        /*
        * @comments arreglo en el que se introducen de las tecnologias del productor audiovisual.
        */
       String Tecnologias[];
       /*
        * @comments arreglo de las tecnologias validas del productor audiovisual.
        */
       String tecnologiasValidas[] = {"videobeam", "Avid Media Composer", "Adobe Premiere Pro", "Final Cut Pro", "Adobe Photoshop"};
       /*
        * @comments arreglo que tiene como función contar la tecnologias que se repiten 
        */
       int cantidadTecnologias[] = {0,0,0,0,0};//Cantidad de Tecnologías
       
       /* 
       * @comments arreglos tipo panadero, florita y productor audiovisual, su funcionan es almacenar los panaderos, floristas y productores 
       */
       Panadero listaPanaderos[];
       Florista listaFlorista[];
       ProductorAudiovisual listaProductor[];
       
       /*
       * @comments Definición de Strings, boolean and int. 
       */
       String categoria ;
       String especializa;
       String esChef;
       /*
       * @comments boolean que determina la continuidad del ciclo do-while para el menu final
       */
       boolean menu = true;
      
       /*
       * @comments Imprime en pantalla los datos de la empresa Los pollos hermanos.
       */
       System.out.println(YELLOW + "*************LOS POLLOS HERMANOS*************"+ FIN);
       System.out.print(YELLOW +"Nit: "+ FIN);
       System.out.println("893291010");
       System.out.print(YELLOW +"Contacto: "+ FIN);
       System.out.println("2256503");
       System.out.print(YELLOW +"Correo Electronico: "+ FIN);
       System.out.println("PollosHermanos@gmail.SA");
       System.out.println(YELLOW +"*********************************************"+ FIN);
       
       /*
       * @comments Pide al usuario(Gerente) cuantos empleados quiere ingresar.
       */
       System.out.println("Cuantos Empleados quiere ingresar ?");
       Scanner entrada = new Scanner(System.in);
       int entrada2 = entrada.nextInt(); 
       
       /*
       * @comments Determina el tamaño de los arreglos que almacenan los empleados  
       */
       listaPanaderos = new Panadero[entrada2];
       listaFlorista = new Florista[entrada2];
       listaProductor= new ProductorAudiovisual[entrada2];
       
       /*
       * @comments for que itera el ingreso de empleados.
       */
       for(int i=0; i < entrada2; i++)
       {
           System.out.println(YELLOW +"*****************EMPLEADO*******************"+ FIN);
           System.out.println("ingrese el tipo de empleado");
           System.out.println(YELLOW +"1) Panadero"+ FIN);
           System.out.println(YELLOW +"2) Florista"+ FIN);
           System.out.println(YELLOW +"3) Productor Audiovisual"+ FIN);
           int entrada3 = entrada.nextInt();// entrada del usuario.
           
           /*
           * @comments Switch dentro del for que captura los datos dependiendo del tipo.
           */
           switch (entrada3)
           {
               case 1:  
                   /*
                   * @comments Captura datos y atributos si es panadero.
                   */
                    System.out.println(YELLOW +"*******************PANADERO******************"+ FIN);
                    System.out.println("Ingrese el nombre");
                    String nombrePanadero = entrada.next();
                    System.out.println("Ingrese el identificacion");
                    double identificacionPanadero = entrada.nextDouble();
                    
                    System.out.println("Ingrese la categoria");
                    System.out.println(YELLOW +"1) novato"+ FIN);
                    System.out.println(YELLOW +"2) normal"+ FIN);
                    System.out.println(YELLOW +"3) canchero"+ FIN);
                   int categoriaPanadero = entrada.nextInt();
                        
                   /*
                   * @comments sentencias if que ayudan a transformas las opciones 1,2 y 3 a novato, normal y canchero respectivamente 
                   * @comments para así hacer mas facil la interaccion Usuario - programa.
                   */
                    if(1 == categoriaPanadero )
                    {
                        categoria = "novato";
                    }
                    else
                   {
                        if(2 == categoriaPanadero) 
                        {
                            categoria = "normal";
                        }
                        else
                        {
                            categoria = "canchero";
                        }
                    }
                    System.out.println("Ingrese los panes por horas");
                    int panesHora = entrada.nextInt();
                    System.out.println("es chef?");
                    System.out.println(GREEN +"1) si"+ FIN);
                    System.out.println(RED +"2) no"+ FIN);
                    int chef = entrada.nextInt();
                    /*
                   * @comments sentencia if que transforma la opcion 1 y 2 a "si" y "no" respectivamente 
                   */
                    if( 1 == chef) 
                    {
                        esChef = "si";
                    }
                    else
                    {
                        esChef = "no";
                    }
                    /*
                    * @comments se agrega al array los objetos Panadero para guardar sus datos 
                    */
                    listaPanaderos[h]=new Panadero(esChef, panesHora, nombrePanadero, identificacionPanadero, categoria);
                    /*
                    * @comments variable que guarda la posicion actual del arreglo
                    */
                    h++;
                    break;
               case 2: 
                   /*
                   * @comments Captura datos y atributos si es florista.
                   */
                    System.out.println(YELLOW +"*******************FLORISTA******************"+ FIN);
                    System.out.println("Ingrese el nombre");
                    String nombreFlorista = entrada.next();
                    System.out.println("Ingrese el identificacion");
                    double identificacionFlorista = entrada.nextDouble();
                   
                    System.out.println("Ingrese la categoria");
                    System.out.println(YELLOW +"1) novato"+ FIN);
                    System.out.println(YELLOW +"2) normal"+ FIN);
                    System.out.println(YELLOW +"3) canchero"+ FIN);
                    int categoriaFlorista = entrada.nextInt();
                    /*
                   * @comments sentencias if que ayudan a transformas las opciones 1,2 y 3 a novato, normal y canchero respectivamente 
                   * @comments para así hacer mas facil la interaccion Usuario - programa.
                   */
                    
                    if(1 == categoriaFlorista )
                    {
                        categoria = "novato";
                    }
                    else
                    {
                        if(2 == categoriaFlorista) 
                        {
                            categoria = "normal";
                        }
                        else
                        {
                            categoria = "canchero";
                        }
                    }
                    System.out.println("Ingrese la años de experiencia");
                    int añosExperiencia = entrada.nextInt();
                    System.out.println("Ingrese la especializacion");
                    System.out.println(YELLOW +"1) interiores"+ FIN);
                    System.out.println(YELLOW +"2) exteriores"+ FIN);
                    int especializacion = entrada.nextInt();
                   /*
                   * @comments sentencia if que transforma la opcion 1 y 2 a "interiores" y "exteriores" respectivamente 
                   */
                    if(1 == especializacion)
                    {
                        especializa = "interiores";
                    }
                    else
                    {
                        especializa = "exteriores";
                    }
                    /*
                    * @comments se agrega al array los objetos Florista para guardar sus datos 
                    */
                    listaFlorista[f]=new Florista(añosExperiencia, especializa, nombreFlorista, identificacionFlorista, categoria);
                    /*
                    * @comments variable que guarda la posicion actual del arreglo
                    */
                    f++;
                    break;
               case 3:  
                   /*
                   * @comments Captura datos y atributos si es Productor Audiovisual.
                   */
                    System.out.println(YELLOW +"*********PR0DUCTOR*AUDIOVISUAL***************"+ FIN);
                    System.out.println("Ingrese el nombre");
                    String nombreProductor = entrada.next();
                    System.out.println("Ingrese el identificacion");
                    double identificacionProductor = entrada.nextDouble();
                    
                    System.out.println("Ingrese la categoria");
                    System.out.println(YELLOW +"1) novato"+ FIN);
                    System.out.println(YELLOW +"2) normal"+ FIN);
                    System.out.println(YELLOW +"3) canchero"+ FIN);
                    int categoriaProductor = entrada.nextInt();
                   /*
                   * @comments sentencias if que ayudan a transformas las opciones 1,2 y 3 a novato, normal y canchero respectivamente 
                   * @comments para así hacer mas facil la interaccion Usuario - programa.
                   */
                    if(1 == categoriaProductor)
                    {
                        categoria = "novato";
                    }
                    else
                    {
                        if(2 == categoriaProductor) 
                        {
                            categoria = "normal";
                        }
                        else
                        {
                            categoria = "canchero";
                        }
                    }
                    
                    System.out.println("Ingrese el cobro por hora");
                    int cobroHora = entrada.nextInt();
                    System.out.print("Ingrese el número de tecnologías ");
                    System.out.println(RED +"Maximo 5!"+ FIN);
                    int numTecnologia = entrada.nextInt();
                    /* 
                    * @comments se determina el tamaño del arreglo Tecnologias 
                    */
                    Tecnologias = new String[numTecnologia];

                    /*
                    * @comments For que itera el tipo de tecnologia a base del numero de tecnologias que el usuario desea ingresar.
                    */
                    for(int j = 0; j < numTecnologia; j++)
                    {
                        System.out.println("Ingrese el tipo de tecnologia");
                        System.out.println("1) videobeam");
                        System.out.println("2) Avid Media Composer");
                        System.out.println("3) Adobe Premiere Pro");
                        System.out.println("4) Final Cut Pro");
                        System.out.println("5) Adobe Photoshop");
                        int tecnologia = entrada.nextInt();
                        /*
                        * @comments el switch es el encargado de evaluar las opciones de tecnologias   
                        * @comments posteriormente almacenar la tecnologia en la posicion j del arreglo 
                        */
                        switch (tecnologia) 
                        {
                            case 1:
                                Tecnologias[j] = "videobeam";
                                break; 
                            case 2:
                                Tecnologias[j] = "Avid Media Composer";
                                break;
                            case 3:
                                Tecnologias[j] = "Adobe Premiere Pro";
                                break;
                            case 4:
                                Tecnologias[j] = "Final Cut Pro";
                                break;
                            case 5:
                                Tecnologias[j] = "Adobe Photoshop";
                                break;
                            default:
                                System.out.println("Opcion invalida!");
                        }
                    }
                    /*
                    * @comments se agrega al array los objetos Productor Audiovisual para guardar sus datos 
                    */
                    listaProductor[k]=new ProductorAudiovisual(Tecnologias, cobroHora, nombreProductor, identificacionProductor, categoria );
                    /*
                    * @comments variable que guarda la posicion actual del arreglo
                    */
                    k++;
                    break;
           }
           //final del switch
        }    
        // final del for
       
       
       /*
        * @comments Despues de iterar el for con el Switch entra a un ciclo do-while para repetir las opciones del menu
        */
       do
       {
            /*
            * @comments Imprime en pantalla el menú para el gerente opciones de Nomina.
            */
            System.out.println(YELLOW +"*************OPCIONES*DE*NOMINA**************"+ FIN);
            System.out.println("1) Costo total de nomina");
            System.out.println("2) Total de empleados cancheros");
            System.out.println("3) Especializacion de floristas predominante");
            System.out.println("4) Total de panes producidos por hora");
            System.out.println("5) Tecnologia mas usada por los Productores");
            System.out.println("6) salir");
            int opcion = entrada.nextInt();
            System.out.println(YELLOW +"*********************************************"+ FIN);

            /* 
             * @comments Switch dentro del do que evalua la opcion del usuario
             */
            switch(opcion)
            {
                case 6: System.out.println(GREEN +"Gracias por preferirnos!"+ FIN);
                        menu=false;//Opción de salida del menú
                        break;
                case 1: 
                    //calcula el salario total de la nomina 
                    int salarioPanadero = 0;
                    int salarioFlorista = 0;
                    int salarioTotal = 0;
                    int salarioProductor = 0;
                    
                    for (int i = 0; i < h; i++)
                    {
                       salarioPanadero += listaPanaderos[i].calcularSalario();
                    }
                    
                    for (int j = 0; j < f; j++)
                    {
                        salarioFlorista += listaFlorista[j].calcularSalarioFlorista();  
                    }
                    
                    for (int i = 0; i < k; i++)
                    {
                        salarioProductor += listaProductor[i].calcularSalarioProductor();
                        salarioProductor += listaProductor[i].getCobroHora();
                    }
                    
                    salarioTotal+=salarioFlorista+salarioPanadero+salarioProductor;
                    System.out.println(RED +"Costo total nomina: "+ FIN + salarioTotal);
                    break;
                case 2:
                    for (int i = 0; i < h; i++) 
                    {
                        listaPanaderos[i].contarCancheros();
                    }
                    
                    for (int j = 0; j < f; j++) {
                         listaFlorista[j].contarCancheros();
                    }
                    
                    for (int i = 0; i < k; i++)
                    {
                        listaProductor[i].contarCancheros();
                    }
                    //Imprime el total de Empleados categoria canchero 
                    System.out.println(RED +"Total cancheros "+ FIN + empleado.getContador());
                    break;
                case 3:
                    for (int i = 0; i < f; i++)
                    {
                        florista.contarEspecializaciones(listaFlorista[i].getEspecializacion());
                    }
                    
                    if(florista.getExteriores() == florista.getInteriores())
                    {
                        System.out.println(" Hay igual cantidad de floristas de interiores y exteriores");
                    }
                    else
                    { 
                        if(florista.getExteriores() > florista.getInteriores())
                        {
                            System.out.println(RED +"Hay mayor cantidad de floristas exteriores"+ FIN);
                        }
                        else
                        {
                            System.out.println(RED +"Hay mayor cantidad de floristas interiores"+ FIN);
                        }
                    }
                    break;
                case 4: 
                    //For que itera el objeto panadero en la lista panaderos en la posición i con gePanesHora
                    for (int i = 0; i < h; i++) 
                    {
                        panadero.setPanesHora(listaPanaderos[i].getPanesHora());
                    }
                    //Imprime la cantidad de panes producidos por hora
                    System.out.println(RED +"La cantidad de Panes por hora es: "+ FIN +panadero.getPanesHora());
                    break;
                case 5:
                    //Definición de lista
                    String lista[];
                    for (int i = 0; i < k; i++) 
                    {
                        lista = listaProductor[i].getTecnologias();
                        for (String L1 : lista)
                        {
                            cantidadTecnologias[Arrays.asList(tecnologiasValidas).indexOf(L1)]+=1;
                        }
                    }
                    //Definicion variables
                    int max = cantidadTecnologias[0];
                    int posicion = 0;
                    //For que itera la lista de tecnologías para retornar la más usada.
                    for (int i = 1; i < 5; i++) {
                        if (max <= cantidadTecnologias[i])
                        {
                            max=cantidadTecnologias[i];
                            posicion=i;
                        }
                    }
                    //Imprime la tecnología más usada
                    System.out.println(RED +"La tecnologia mas usada es:"+ FIN +tecnologiasValidas[posicion]);
                    
            }//Fin del Switch.
            
        }//Fin del do.
       
        //Mientras(menu) sea true siga iterando el menu.
        while(menu);
    }//Fin del main.
    
}//Fin de la clase Laboratorio1.
