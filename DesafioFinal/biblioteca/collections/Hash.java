package biblioteca.collections;

public class Hash<T>  extends Collections<T>{
    
    private LinkedListHash<T>[] data;

    Hash()
    {
        data = (LinkedListHash<T>[])(new Object[256]);
    }

    Hash(Integer capacity)
    {
        data = (LinkedListHash<T>[])(new Object[capacity]);
    }

    void add(Integer key,T value)
    {
        int index = key % data.length;

        if(getSize() == (data.length) * 0.7)
        {
            LinkedListHash<T>[] copy = (LinkedListHash<T>[])(new Object[2 * data.length]); 
            
            for(int i = 0; i < data.length; i++)
            {
                copy[i] = data[i];
            }
            data = copy;
        }

        if(data[index] == null)
        {
            data[index] = new LinkedListHash<T>();
            setSize(getSize()+1);
        }

        data[index].add(key, value);

    }


    public T get(int key)
    {
        int index = key % data.length;

        return data[index].get(key);
    }

}
