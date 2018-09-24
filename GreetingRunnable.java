
import java.util.Date;

public class GreetingRunnable implements Runnable
{
    private static final int REPETITIONS = 4;
	private static final int DELAY = 4;
	private String greeting;
/*
Constructs the runnable object.
@param aGreeting the greeting to display
*/
	public GreetingRunnable(String aGreeting)
	{
	greeting = aGreeting;
}
	public void run()
{
	try
{
	for (int i = 1; i <= REPETITIONS; i++)
{
	Date now = new Date();
	System.out.println(now + " " + greeting);
	Thread.sleep(DELAY);
	}
}
	catch (InterruptedException exception)
{
		}
	}
}
