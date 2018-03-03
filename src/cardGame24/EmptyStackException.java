
package cardGame24;
/**
 * Class:       <b>EmptyStackException</b>
 * File:        EmptyStackException.java
 * <pre>
 * Description: Provides an exception class to be used in CardDriver, which 
 *                inherits from StackException class class of objects thrown when
 *                an operation to access an element of an empty stack is attempted
 * Date:        3/1/2016
 * History Log: 3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    1.6
 * @see:        javax.swing.JFrame
 * @author:     <i>Edgar Hyeongwoo Park</i>
 * </pre>
 */
public class EmptyStackException extends StackException 
{
      
	public EmptyStackException()
	{
            System.out.println("Stack is Empty");
	}
}
