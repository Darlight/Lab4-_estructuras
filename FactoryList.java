/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 11 de febrero de 2019
Proposito: Esta clase es la interfaz de List, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
class FactoryList<E> {
    //selecciona la implementacion a utilizar para un stack
    //se utiliza el patron Factory
    public List<E> getList(String entry) {
        // seleccion de la implementacion a utilizar:
        if (entry.equals("SL") {
            return new SinglyLinkedList<E>(); //regresa un Singly Linked List
        }
        if (entry.equals("DL")) {
            return new DoublyLinkedList<E>(); //regresa Un doubly linked list
        }
        else{
            return  new CircularList<E>();// Regresa un circular List
        }
    }
}