
/**
 *  Burak Demirci
 *  141044091
 */
import java.util.*;

public class StackA<E> extends ArrayList<E> implements StackInterface<E>
{
    /**
     * Pop metodu imlement edildi
     * @return Eklenen data
     */
    @Override
    public E pop()
    {
        return remove(size()-1);
    }

    /**
     * pushmetodu imlemen edildi
     * @param obj gelen data
     * @return eklenen data
     */
    @Override
    public E push(E obj)
    {
        add(0,obj);
        return obj;
    }

    /**
     *  toString metodu
     * @return String
     */
    public String toString()
    {
        String str;
        str = super.toString();
        str=str.substring(1,str.length()-1);
        return str;
    }


}