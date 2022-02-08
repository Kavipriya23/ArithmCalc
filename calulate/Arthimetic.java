package calulate;

import java.util.Scanner;

public class Arthimetic {

	public static void main(String[] args) {
		    Double n1,n2,result;
		    char oper;
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number1:");
			n1=sc.nextDouble();
			System.out.println("Enter the Number2:");
			n2=sc.nextDouble();
			System.out.println("Choose a Operator: +, -, *, / ");
			oper =sc.next().charAt(0);
			switch(oper) {
			case'+':
				result=n1+n2;
				System.out.println("Answer:" + result);
				break;
			case'-':
				result=n1-n2;
				System.out.println("Answer:" + result);
				break;
			case'*':
				result=n1*n2;
				System.out.println("Answer:" + result);
				break;
			case'/':
				result=n1/n2;
				System.out.println("Answer:" + result);
				break;
			default:
				System.out.println("Invalid Operator!");
				break;
			}
			sc.close();
	}

}
