package loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new class called Loops. In the main method of this class, create 
		//the following loops with any variables you feel are needed:
		//	
		// A while loop that prints all even numbers from 0 to 100
				//int number = 1; 	 
				//while( number <= 100 ) 
				//{ 
					//if( (number % 2) == 0 ) 
					//{ 
					//System.out.println(number); 
				//} 
				//number++;
				//}  
		//
		// A while loop that prints every 3rd number going backwards from 100 until we reach 0
				//for (int i = 100; i >=0; i = i - 3) {
				//System.out.println(i);
			//}
		//
		// A for loop that prints every other number from 1 to 100
		//
				//for (int i = 1; i <= 100; i = i + 2) {
				//	System.out.println(i);
				//}
		// A for loop that prints every number from 0 to 100, but 
		// if the number is divisible by 3, it prints “Hello” instead of the 
		// number, and if the number is divisible by 5, it prints “World” instead 
		// of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
				for (int i = 0; i <= 100; i++) {
					if ((i%3== 0) && (i%5==0)) {
						System.out.println("HelloWorld");
					} else if (i % 5 == 0) {
							System.out.println("World");
					} else if (i%3== 0){
							System.out.println("Hello");
					} else {	
						System.out.println(i);
					}
			 }
			}
	}

