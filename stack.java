package Stackshort;
import java.util.Scanner;
import java.util.Stack;
public class stack {
	  public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	Stack<Integer> stack = new Stack<>();
	    	
	    	
	    	stack.push(10);
	    	stack.push(80);
	    	stack.push(60);
	    	stack.push(50);
	    	stack.push(30);
	    	
	    	int count = stack.size();
	    	int n = sc.nextInt();
	    	int size = stack.size();
	    	int a = sc.nextInt();
	    	
	    	System.out.println();
	    	if(stack.size() >= a) {
	    		 int elementToRemove = stack.get(stack.size() - a);
	    		 stack.remove(stack.size() - a);
	    		 
	    		 System.out.println(" Da xoa phan tu : "+ elementToRemove+" khoi Stack");
	    		 
	    	}else {
	    		System.out.println("vui long nhap lai a");
	    	}
}
}