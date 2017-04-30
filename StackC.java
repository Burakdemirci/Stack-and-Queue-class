/**
 *  Burak Demirci
 *  141044091
 */

import java.util.*;

public class StackC<E> implements StackInterface<E>
{

    private int size=0;
    private Node <E> head = null;
    /**
     * Inner class implemetation
     * @param <E> Data type
     */
    private static class Node<E>
    {
        private E data;
        /** Yeni nodun refaransi  */
        private Node<E> next;
        /** Yeni node olusturma islemi.
         @param eleman  Yeni kaydedilecek eleman
         */
        private Node(E eleman) {
            data = eleman;
            next = null;
        }
        /** Yeni node olusturma metodu
         @param eleman kaydedilecek eleman
         @param newNodeRef yeni node refaransi
         */
        private Node(E eleman, Node<E> newNodeRef) {
            data = eleman;
            next = newNodeRef;
        }


        /**
         * To String metodu yeniden yazildi
         * @return String dondurur
         */
        @Override
        public String toString()
        {
            String temp = new String();
            temp = (String.valueOf(data));
            return temp;
        }
    }

    /**
     * Son elemani silme
     * @return silinen elemanin datasi
     */
    private E remove()
    {
        E dat = get(size()-1).data;
        get(size()-2).next=null;
        size--;
        return dat;
    }

    /**
     * Indexi verilen elamani dondurur
     * @param index index
     * @return Node
     */
    private Node<E> get(int index)
    {
        Node<E> temp =head;
        if(index> size() || index<0)
        {
            throw new NoSuchElementException();
        }
        for (int i=0; i<size(); i++)
        {
            if(i==index)
                i=size();
            else
                temp=temp.next;
        }
        return temp;
    }

    /**
     *  Pop metodu
     * @return removed data
     */
    @Override
    public E pop()
    {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove();
    }

    /**
     *  push metodu
     * @param obj gelen data
     * @return eklenen data
     */
    @Override
    public E push(E obj)
    {
        Node<E> temp= new Node<E>(obj);
        Node<E> tempH;
        if(head==null)
            head=temp;
        else
        {
            tempH=head;
            head=temp;
            head.next=tempH;
        }
        size++;
        return obj;
    }

    /**
     *  İsEmpty metodu
     * @return Node bossa true, doluysa false
     */
    @Override
    public boolean isEmpty() {
        if(head==null)
            return true;
        else
            return false;
    }

    /**
     *  Size metodu
     * @return size
     */
    @Override
    public int size()
    {
        return size;
    }

    /**
     *  toString MKetodu
     * @return String
     */
    @Override
    public String toString()
    {
        String str="";
        for(int i=0; i<size(); i++)
        {
            if (i>=1)
                str += ", ";

            str += get(i).toString();

        }
        return str;
    }


}