package Stack;

import java.util.Scanner;

public class UserStack implements StackOperations{

		int arr[];
		int top;
		//initializer
		public UserStack(int[] arr, int top) 
		{
			this.arr = arr;
			this.top = top;
		}
	@Override
	public void add(int value) {
		// TODO Auto-generated method stub
		   top++;
		   arr[top] = value;
		   System.out.println(value +" is added to Stack");
		}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		   int temp = arr[top];
		   top--;
		   System.out.println("Deleted Value: ");
		   System.out.println(temp);

	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		int i;
		   System.out.println("Values in stack:");
		   for(i = top; i >= 0; i--)
		   {
			   System.out.printf("%d\t", arr[i]);
		   }

	}

	
	public static void main(String[] args) {
		int[] arr = new int[100];
		UserStack stack = new UserStack(arr,-1);	
		int ch;
		do
		  {
			 System.out.println("----Menu driven----");
		     System.out.println("\n1. Push\n2. Pop\n3.Print\n0. Exit\n");
		     Scanner input = new Scanner(System.in);
			ch = input.nextInt();

		switch(ch){
		case 1:
			System.out.println("Enter the elements ");
			 int e = input.nextInt();
			stack.add(e);
			break;
		case 2:
			stack.remove();
			break;
		case 3:
			stack.print();
			break;
		case 4:
			System.out.println("Invalid Input");
			break;
		}
	}while(ch != 0);
	}
}