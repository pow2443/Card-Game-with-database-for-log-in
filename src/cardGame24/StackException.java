package cardGame24;
/**
 * Class:       <b>StackException</b>
 * File:        StackException.java
 * <pre>
 * Description: Provides a parent classs to EmptyStackException and FullStackexception
 * Date:        3/1/2016
 * History Log: 3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    1.6
 * @see:        javax.swing.JFrame
 * @author:     <i>Edgar Hyeongwoo Park</i>
 * </pre>
 */

/** parent class of all stack exceptions */
class StackException extends Exception 
{
	public StackException()
	{
		System.out.println("Stack Exception");
	}
}

