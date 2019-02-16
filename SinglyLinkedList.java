/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 11 de febrero de 2019
Proposito: Esta clase es la interfaz de Stack, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
public SinglyLinkedList<E> extends AbstractList<E>{

    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public SinglyLinkedList(){
        // post: generates an empty list
        head=null;
        count=0;
    }

    public int size(){
        // post: returns number of elements in list
        return count;
    }

    public void addFirst(E value){
        // post: value is added to beginning of list
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value,head);
        count++;
    }

    public E removeFirst(){
        // pre: list is not empty
        // post: removes and returns value from beginning of list
        Node<E> temp=head;
        head=head.next(); // move head down list
        count--;
        return temp.value();
    }

    public E getFirst(){
        // pre: list is not empty
        // post: returns first value in list
        return head.value();
    }

    public void addLast(E value){
        // post: adds value to end of list
        // location for new value
        Node<E> temp=new Node<E>(value,null);
        if(head!=null){// pointer to possible tail
        Node<E> finger=head;
        while(finger.next()!=null){
            finger=finger.next();
        }
        finger.setNext(temp);
        }else {
            head=temp;
            count++;
        }
    }


    public boolean contains(E value){
        // pre: value is not null
        // post: returns true if value is found in list
        Node<E> finger=head;
        while(finger!=null && !finger.value().equals(value)){
            finger=finger.next();
        }
        return finger!=null;
    }
}