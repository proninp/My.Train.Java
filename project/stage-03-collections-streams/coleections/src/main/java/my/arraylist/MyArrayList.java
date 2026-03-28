package my.arraylist;

public class MyArrayList<T> implements MyList<T> {
    
    private static final int START_CAPACITY = 10;
    
    private Object[] data;
    
    private int size;
    
    public MyArrayList() {
        this(START_CAPACITY);
    }

    public MyArrayList(int capacity) {
        data = new Object[capacity];
    }
    
    @Override
    public void add(T element) {
        if (size == data.length) {
            grow();
        }
        data[size] = element;
        size++;
    }

    private void grow() {
        var increasedCapacity = (data.length << 1) - (data.length >> 1);
        var increasedData = new Object[increasedCapacity];
        System.arraycopy(data,0, increasedData, 0, data.length);
        data = increasedData;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index  + 1, data, index, size - index - 1);
        size--;
        data[size] = null;
    }

    @Override
    public int size() {
        return size;
    }
}
