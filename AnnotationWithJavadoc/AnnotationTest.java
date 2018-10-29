import java.util.Scanner;

public class AnnotationTest {
	
	public static void main(String[] args)
	{
		Scanner in = new (System.in);
		Annotation ann = new Annotation();
		int check =1;
	}
	
	while(true)
	{
		System.out.println("Calculator");
		System.out.println("For Addition::Press 1");
		System.out.println("For Subtraction::Press 2");
		System.out.println("For Multiplication::Press 3");
		System.out.println("For Division::Press 4");
		System.out.println("Exit::Press E");
		
		check = in.nextInt();
		if(check==0)
		{
			break;
		}
		System.out.println("Enter the values: ");
	}

}
