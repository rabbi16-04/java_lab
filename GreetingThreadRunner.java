
public class GreetingThreadRunner
{
public static void main(String[] args)
{
	GreetingRunnable r1 = new GreetingRunnable("Hello\n");
	GreetingRunnable r2 = new GreetingRunnable("Good Morning\n");
	GreetingRunnable r3 = new GreetingRunnable("Good Evening\n");
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	Thread t3 = new Thread(r3);

	t1.start();
	t2.start();
	t3.start();
	}
}
