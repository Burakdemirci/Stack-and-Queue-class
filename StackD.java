/**
 *  Burak Demirci
 *  141044091
 */
import java.util.*;
import java.lang.*;

public class StackD<E> implements StackInterface<E>
{
    Queue<E> myque = new LinkedList<> ();
    private int size =0;
    /**
     *  Pop metodu
     * @return Cikarilan eleman
     */
    @Override
    public E pop()
    {
        size--;
        return myque.remove();
    }

    /**
     *  Push metodu
     * @param obj Eknecek obje
     * @return Eklenen obje
     */
    @Override
    public E push(E obj)
    {
        myque.add(obj);

        size++;
        return obj;
    }




    /**
     *  isEmpty metodu
     * @return Turue , False
     */
    @Override
    public boolean isEmpty()
    {
        return myque.isEmpty();
    }

    /**
     * Size metodu
     * @return Size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     *  To Stringmetodu
     * @return String
     */
    @Override
    public String toString()
    {

        String str;
        str = myque.toString();
        str=str.substring(1,str.length()-1);
        return str;
    }

}