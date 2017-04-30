/**
 *  Burak Demirci
 *  141044091
 */

import java.util.*;
public class myQueue<E> extends KWLinkedList<E> implements Queue<E>
{
    private Queue<E> temp= new KWLinkedList<E>();
    private int count=0;
    private int flag =1;

    /**
     *  Reverse method without do not use new node
     */
    public void reverse()
    {
        int i=0;;
        while(i < size())
        {
            add(i,getLast());
            poll();
            i++;
        }
    }

    /**
     *  reverse Recursive
     * @param val Reversed data
     */
    public void reserve(Queue val)
    {
        if(flag==1)
            count=val.size();
        if(count==0)
        {
            flag=1;
            count = 0;
            recursiveHelper(val);
            return;
        }else {
            flag=0;
            temp.add((E) val.poll());
            count--;
            reserve(val);
        }

    }

    /**
     *  Recursive helper
     * @param val Queue value
      */
    private void recursiveHelper(Queue val )
    {
      for(int i=temp.size(); i>=1; i--)
          val.add(temp.peek());
    }

}