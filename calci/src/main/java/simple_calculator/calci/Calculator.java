package simple_calculator.calci;
import java.util.*;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" option0:Exit Calculator\n option1:Addition\n option2:Substraction\n option3:Multiplication\n option4:Division\n");
		while(true)
		{
			int option = sc.nextInt();
			double x = 0;
			double y = 0;
			switch(option)
			{
				case 0:
					return ;
				case 1:
					System.out.println("Enter Two Numbers:");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Addition a = new Addition(x,y);
					a.add();
					break;
				case 2:
					System.out.println("Enter Two Numbers:");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Substraction b = new Substraction(x,y);
					b.sub();
					break;
				case 3:
					System.out.println("Enter Two Numbers:");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Multiplication c = new Multiplication(x,y);
					c.mul();
					break;
				case 4:
					System.out.println("Enter Two Numbers:");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Division d = new Division(x,y);
					d.div();
					break;
				default:
					System.out.println("Enter Valid Option");
			}
		}
	}
}
