import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;

public class Myset<E> implements Set<E> {
    private HashMap data;

    Myset() {
        data = new HashMap<>();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean contains(Object o) {
        return data.containsKey(o);
    }

    public Iterator<E> iterator() {
        return data.keySet().iterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(E o) {
        data.putIfAbsent(o, data.size());
        return true;
    }

    public boolean remove(Object o) {
        data.remove(o);
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        c.forEach(e -> data.put(e, data.size()));
        return true;
    }

    public void clear() {
        data.clear();
    }

    public boolean retainAll(Collection<?> c) {
        if (this.isEmpty()) return false;
        Myset intersect = new Myset();
        this.forEach(e ->
        {
            if (c.contains(e)) intersect.add(e);
        });
        data = intersect.data;
        return true;
    }

    public boolean removeAll(Collection<?> c) {
        c.forEach(e -> data.remove(e));
        return true;
    }

    public boolean containsAll(Collection<?> c) {
        if (this.isEmpty()) return true;
        for (Object key : this) {
            if (!c.contains(key)) return false;
        }
        return true;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}