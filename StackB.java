/**
 *  Burak Demirci
 *  141044091
 */


import java.util.*;

public class StackB<E> implements StackInterface<E>
{
    ArrayList<E> mylist = new ArrayList<E>();

    /**
     *  Pop islemi yağildi son eleman cikarildi
     * @return arraylistin kalan kıismi return edildi
     */
    @Override
    public E pop()
    {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return mylist.remove(mylist.size()-1);
    }

    /**
     *  Push the new value to stack
     * @param obj eklenmek icin gelen data
     * @return eklenen data
     */
    @Override
    public E push(E obj)
    {
        mylist.add(0,obj);
        return obj;
    }

    /**
     *  Listin bos olup olmadigi kontrolu yapılır
     * @return true,false
     */
    @Override
    public boolean isEmpty()
    {
        return mylist.isEmpty();
    }

    /**
     *  Listin size'ini dondurur
     * @return size
     */
    @Override
    public int size()
    {
        return mylist.size();
    }

    /**
     *  toString metodu
     * @return String
     */
    @Override
    public String toString()
    {
        String str;
        str=mylist.toString();
        str=str.substring(1,str.length()-1);
        return str;
    }
}