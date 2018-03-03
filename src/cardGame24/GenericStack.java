package cardGame24;
/**
 * Class:       <b>GenericStack</b>
 * File:        GenericStack.java
 * <pre>
 * Description: Provides GenericStack class to be used in the CardDriver
 * Date:        3/1/2016
 * History Log: 3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    1.6
 * @see:        javax.swing.JFrame
 * @author:     <i>Edgar Hyeongwoo Park</i>
 * </pre>
 */
public class GenericStack<E> 
{
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    /**
     * @return list.size()
     */
    public int getSize() 
    {
      return list.size();
    }
    
    /**
     * @return list.get(getSize() - 1)
     */
    public E peek() throws EmptyStackException
    {
      if ( isEmpty() ) 
      {
         throw new EmptyStackException();
      }
      return list.get(getSize() - 1);
    }

    public void push(E o) throws FullStackException
    {
      list.add(o);
    }
    
    /**
     * @return 0
     */
    public E pop() throws EmptyStackException
    {
      if ( isEmpty() ) 
      {
         throw new EmptyStackException();
      }
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
    }

    /**
     * @return list.isEmpty(
     */
    public boolean isEmpty() 
    {
      return list.isEmpty();
    }

    @Override
    /**
     * @return "stack: " + list.toString()
     */
    public String toString() 
    {
      return "stack: " + list.toString();
    }
}
