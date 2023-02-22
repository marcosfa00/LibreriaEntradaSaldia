import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar un pensaje por consola o por ventana
 * Se pide por consola distintos tipos de datos (FLOAT,INT,BOOLEAN,STRING)
 * @version 1.0
 * @author marcosfa
 */

public class EntradaSalida {
    /**
     * Creamos una constante estatica que sea la opción de salida por consola
     * valor 1
     */
    public static final int SALIDA_CONSOLA =1;
    /**
     * Creamos una constante estatica que sea la opcion salida por ventana
     * valor 2
     */
    public static final int SALIDA_VENTANA = 2;

    /**
     * Creo el constructor por defecto en privado, porque no me interesa crear un objeto de esta clase,
     * ya que es una librería
     */
    private EntradaSalida(){}


    /**
     * Mostrar datos por ventana o por consola
     * @param msj cadena de datos que queremos imprimir
     * @param device elección de como queremos imprimir la cadena de datos
     * @return Se muestra el mensaje TRUE, da error FALSE
     */
    public static boolean salida(String msj, int device){
        switch (device){//aquí se elige el tipo de salida que vamso a tener
            case SALIDA_CONSOLA:
                try{
                    System.out.println("Consola: " + msj);
                    return true;
                }catch (Exception e){
                    return false;
                }


            case SALIDA_VENTANA:
                try {
                    JOptionPane.showMessageDialog(null,"Window: " + msj);
                    return true; //!!OJO¡¡ importante poner el True después de mostrar el mensaje, si no nos dará falsos resultados.
                }catch (Exception e){
                    return false;
                }

            default:
                return false;

        }
    }

    // a continuación vamos a crear los métodos de pedir datos / entrada de datos
    /**
     * Declaro el objeto estatico sc Scanner para usar en todas las entradas de datos.
     */
    private  static Scanner sc = new Scanner(System.in);

    /**
     * Se pide un dato por consola y lo guardamos en un String
     * @param msg
     * @return  String dato
     */
    public static String EntradaString(String msg){

        System.out.println(msg);//se muestra el mensaje a solicitar
        String dato = sc.nextLine();//se guarda en dato lo solicitado
        return dato; //retorna el dato solicitado
    }

    /**
     * PEDIMOS UN ENTERO, RETORNAMOS UN INTEGER PARA QUE PODAMOS TRABAJAR CON NULL EN CASO DE QUE FALLE.
     * @param msg
     * @return NUMERO PEDIDO EN CASO DE QUE VAYA BIEN O NULL SI SALTA LA EXCEPCIÓN
     */
    public static Integer EmtradaInt(String msg){
       try{
          int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
          return num;
       }catch(Exception e){
           return null;
       }
    }

    /**
     * Pedimos que se introduzca un float
     * @param msg
     * @return num float en caso de que no salte error, si no retorna null
     */
    public static Float EntradaFloat(String msg){
        try{
            float num = Float.parseFloat(JOptionPane.showInputDialog(msg));
            return num;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * Pedimos que se introduzca un boolean
     * @param msg
     * @return true o false
     */
    public static Boolean EntradaBoolean(String msg){
        try{
            boolean result = Boolean.parseBoolean(JOptionPane.showInputDialog(msg));
            return result;
        }catch(Exception e){
            return null;
        }
    }



}
