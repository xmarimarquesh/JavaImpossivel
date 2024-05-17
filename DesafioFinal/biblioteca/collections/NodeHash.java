package biblioteca.collections;

public class NodeHash<Integer, T> {
    
    private NodeHash<Integer, T> next = null;
    private T value;
    private Integer key;

    NodeHash(Integer key, T value){
        this.value = value;
        this.key = key;
    }

    public NodeHash<Integer, T> getNext() {
        return next;
    }

    public void setNext(NodeHash<Integer, T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    
}
