/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 11 de febrero de 2019
Proposito: Esta clase es la interfaz de List, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
}