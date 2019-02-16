/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 11 de febrero de 2019
Proposito: Esta clase es la interfaz de Stack, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
public interface InterfaceStack<E> {

    public void push(E item);
    //Empuja el item a la pila

    public E pop();
    //Saca el primer elemento de la pila

    public E peek();
    //
    public boolean empty();
    //Vacia la pila
    public int size();
    //El tamanio de la pila

}