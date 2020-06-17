package danh_sach.my_list;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public int getSize() {
        return size;
    }
    public boolean contains(Object e){
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==e){
                return true;
            }
        }
        return false;
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void remove(int index) {
        if (index < elements.length && index >= 0) {
            for (int i = index; i < elements.length; i++) {
                elements[i - 1] = elements[i];
                elements[elements.length - 1] = null;
            }
        }
    }
}
