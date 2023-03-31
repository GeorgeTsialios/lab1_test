package gr.upatras.first;

//Demo Java program
//Importing classes from packages
import java.io.*;

//Main class
public class GFG {
	private String name; 
//Main driver method
	public static void main(String[] args) {
//Print statement
		System.out.println("Welcome to GeeksforGeeks");
		GFG myObject = new GFG();
		myObject.setName("George");
		System.out.println("Hello " + myObject.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
