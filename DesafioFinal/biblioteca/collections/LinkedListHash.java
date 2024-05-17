package biblioteca.collections;

public class LinkedListHash<T> extends Collections<T>{

    private NodeHash<Integer, T> head;

    public void add(int key, T value) {
        
        NodeHash<Integer, T> node = new NodeHash<Integer, T>(key, value);
        NodeHash<Integer, T> atual = head;

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

    public T get(int key) {
        
        NodeHash<Integer, T> atual = head;

        while(atual.getNext() != null){
            if(atual.getKey() == key){
                return atual.getValue();
            }

            atual = atual.getNext();
        }

        return null;
    }

    public void set(int key, T value) {
        
        NodeHash<Integer, T> atual = head;

        for(int i = 0; i < key; i++)
        {
            atual = atual.getNext();
        }

        atual.setValue(value);
        atual.setKey(key);
    }
    
}
