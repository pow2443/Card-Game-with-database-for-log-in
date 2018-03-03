package cardGame24;
/**
 * Class:       <b>FullStackException</b>
 * File:        FullStackException.java
 * Description: Provides an exception class to be used in CardDriver, which
 *                inherits from StackException class. Class of objects thrown 
 *                when an operation to add an element to a full stack is attempted
 * Date:        3/1/2016
 * History Log: 3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     <i>Edgar Hyeongwoo Park</i>
 */
public class FullStackException extends StackException
{
	public FullStackException()
	{
            System.out.println("Stack is Full");
	}
}

