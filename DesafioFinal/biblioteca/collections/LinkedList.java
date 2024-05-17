package biblioteca.collections;

public class LinkedList<T> extends List<T> {

    private Node<T> head;

    @Override
    public void add(T value) {
        
        Node<T> node = new Node<T>(value);
        Node<T> atual = head;

        if(head == null){
            head = node;
            return;
        }

        while(atual.getNext()!= null){
            atual = atual.getNext();
        }
        atual.setNext(node);

        setSize(getSize()+1);
        
    }

    @Override
    public T get(int index) {
        
        Node<T> atual = head;

        for(int i = 0; i < index; i++){
            atual = atual.getNext();
        }

        return atual.getValue();
    }

    @Override
    public void set(int index, T value) {
        
        Node<T> atual = head;

        for(int i = 0; i < index; i++)
        {
            atual = atual.getNext();
        }

        atual.setValue(value);
    }
    
}
