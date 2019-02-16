/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 01 de febrero de 2019
Proposito: Esta clase es el main de la Hoja de Trabajo 2, es decir,
esta el la clase encargada de interactuar con el usuario, pues
le pide datos y tambien es la unica que puede mostrar datos en pantalla.
 */
//Importo la libreria completa de java util
import java.util.*;

public class MainCalculadora {
    public static void main(String[] args){
        //Se declaran las variables con las que trabajara esta clase
        String direccion, texto;
        int opcion1, opcion2;
        String menu1 = "Indique la implementacion que desea usar para el stack\n" +
                "1. ArrayList\n2. Vector\n3. Lista",
        menu2 = "Indique la implementacion de listas a emplear\n" +
                "1. Simplemente encadenada\n2. Doblemente encadenada\n3. Lista circular",
        error = "El numero que ingreso no es valido, ingreselo nuevamente";
        //Se instancian todas los objetos necesarios para el funcionamiento
        //del programa
        //El objeto calculadora, encargada de hacer las operaciones
        Calculadora calculadora = new Calculadora();


        //El objeto stack, esta contiene los metodos de una pila
        //StackArrayList<Integer> pila = new StackArrayList<>();
        StackFactory<Integer> stackFactory = new StackFactory<Integer>();


        //El objeto archivo, esta se encarga de leer el archivo de texto
        Archivos archivo = new Archivos();
        //El bojeto scanner, encargada de recibir datos ingresador por el
        //usuario
        Scanner scan = new Scanner(System.in);

        //Se pide al usuario que ingrese la direccion en la que se encuentra el archivo de texto
        //que se va a leer
        System.out.println("Ingrese la direccion del archivo: ");
        //C:\Users\josue\Desktop\prueba\prueba.txt
        //El usuario ingresa la direccion en la variable direccion
        direccion = scan.nextLine();

        //Se lee el archivo y se almacena en la variable texto
        texto = archivo.leerTxt(direccion);

        //Se separan los caracteres de la cadena guardada en la variable texto
        //Y se almacena dentro de un arreglo tipo string llamado lista
        //Esta se separa cada vez que se encuentre un " "
        String[] lista = texto.split(" ");

        System.out.println(menu1);
        opcion1 = scan.nextInt();

        while (opcion1 != 1 || 2 || 3){
            if (opcion1 == 1){
                Stack<String> stack = stackFactory.getStack("AL");
            } else if (opcion1 == 2){
                Stack<String> stack = stackFactory.getStack("V");
            } else if (opcion1 == 3){
                System.out.println(menu2);
                opcion2 = scan.nextInt();

                while (opcion2 != 1 || 2 || 3){
                    if (opcion2 == 1){
                        u
                    } else if (opcion2 == 2){

                    } else if (opcion2 == 3){

                    } else {
                        System.out.println(error);
                        System.out.println(menu2);
                        opcion2 = scan.nextInt();
                    }
                }
            } else {
                System.out.println(error);
                System.out.println(menu1);
                opcion1 = scan.nextInt();
            }
        }

        //Para cada elemento que se encuentra dentro del arreglo lista...
        for (int i = 0; i < lista.length; i++){
            //Si el elemento en cuestion es un signo +, entonces...
            if (lista[i].equals("+")){
                //Se realizan los calculos con el metodo Calculate
                stack.push(calculadora.Calculate(pila.pop(), pila.pop(), "+"));

            //Si el elemento en cuestion es un signo -, entonces se hace lo mismo que en
            //la condicion anterior
            } else if (lista[i].equals("-")){
                stack.push(calculadora.Calculate(pila.pop(), pila.pop(), "-"));

             //Si el elemento es *...
            } else if (lista[i].equals("*")){
                stack.push(calculadora.Calculate(pila.pop(), pila.pop(), "*"));

             //Si el elemento es /...
            }else if (lista[i].equals("/")){
                stack.push(calculadora.Calculate(pila.pop(), pila.pop(), "/"));

             //En cambio, si no es ningun signo que represente un operador, entonces
             //Este se tomara como un numero y lo agregara a la pila
            } else {
                stack.push(Integer.parseInt(lista[i]));
            }
        }
        //Luego de recorrer todos los elementos de la lista
        //Se muestra el resultado de todas las operaciones en pantalla
        System.out.println("El resultado es: " + stack.pop());
    }
}
