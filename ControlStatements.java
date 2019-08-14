package Training_Day2;

public class ControlStatements {

	public static void main(String[] args) {
		// if statement
		int grade = 68;
		if( grade > 60 ){
		System.out.println("Congratulations!");
		System.out.println("You passed!");
		}
		//if else statement
		int grade1 = 78;
		if( grade1 > 60 )
		System.out.println("Congratulations!");
		else
		System.out.println("Sorry you failed");
		//nested if else statements
		int grade2 = 68;
		if( grade2 > 90 ){
		System.out.println("Very good!");
		}
		else if( grade2 > 60 ){
		System.out.println("Good!");
		}
		else{
		System.out.println("Sorry you failed");
		} 
		//sample programe
		
			 double grade3 = 92.0;
			 if( grade3 >= 90 ){
			 System.out.println( "Excellent!" );
			 }
			 else if( (grade3 < 90) && (grade3 >= 80)){
			 System.out.println("Good job!" );
			 }
			 else if( (grade3 < 80) && (grade3 >= 60)){
			 System.out.println("Study harder!" );
			 }
			 else{
			 System.out.println("Sorry, you failed.");
			 }
			 //switch statements
			
				  int grade4 = 92;
				  switch ((grade4/10)*10) { // Round down to nearest 10
				  case 100:
				  System.out.println( "Excellent!" );
				  break;
				  case 90:
				  System.out.println("Good job!" );
				  break;
				  case 80:
				  System.out.println("Study harder!" );
				  break;
				  // If there is no match, this will be chosen
				  default:
				  System.out.println("Sorry, you failed.");
				 
			 }
	}
}



