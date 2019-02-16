public abstract class AbstractStack<E> implements InterfaceStack<E>{

    public boolean empty{
        //Regresa true si el stack esta vacio
        return size() == 0;
    }

}