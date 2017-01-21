
public class forJava {

	public static void main(String[] args)
{

		
//		int i = 19;
//		int a = 1;
//		while( ++a<--i );
//		while(++a<--i){
//			
//		}
//		
//		
//		System.out.println("value of i is "+i);
//		
//		if(i>3)
//			System.out.println("i>3");
//		else
//			System.out.println("i<3");
//		
//
//		int r = 1;
//		while(r<10){
//			System.out.println("this is while loop, value is "+r);
//			r++;
//		}
//		
//		
//		for( int e = 1; e<10 ; e++){
//			System.out.println("this is for loop, value is "+e);
//		}
		
		for(int number = 1; number<10;number++){
			
			if(number ==5)
				continue;
			
			for(int line = 1; line<10;line++){
				System.out.println("number is "+number+" ,line is "+line);
				
			}
		
			
		}
		
		
		
		
		
		
		
//		dayInMonthNumber(7);
		
//		dayInMonthName("Feb");
		
//		monthName(8);
		
//		division(0, 7);
//		
//		multiplication(7, 8);
//		
//		subtraction(12, 72);
		
//		forJava obj = new forJava();
//		obj.countNumber(3,7);
		
		
//		multiArrayNumber();
		
//		 multiArrayWord();
		
		
/*		int[] numbers;
		numbers = new int[40];
	
//		chessboard game.
		for(int i =0; i< numbers.length; i++){
			
			if(i == 0){
				numbers[0] = 2;
			}else{
				numbers[i] = numbers[i-1]*2;
			}
			
			System.out.println(numbers[i]);
		
*/
		
		
		
/*		
//		give value to string by array.
		String[] fruits = {"apple", "banana", "paer", "pineapple"};
		
		for (String i:fruits){
		
			System.out.println(i);
		}
		String[] numbers;
		numbers = new String[3];
		
		numbers[0] = "one";
		numbers[1] = "two";
		numbers[2] = "three";
		
		for(String a: numbers){
			System.out.println(a);
		}
*/		
}
	
public static void dayInMonthNumber(int a){
	switch(a){
	case 1:  case 3:
	case 5:  case 7:
	case 8:  case 10:  case 12:
		System.out.println("31 days in month "+a);
		break;
	case 4:  case 6:
	case 9:  case 11:
		System.out.println("30 days in month "+a);
		break;
	case 2:
		System.out.println("29 days in month "+a);
		break;
	}	
}
	
	
	
	
	
	
public static void dayInMonthName(String a){
		switch(a){
		case "jan":  case "mar":
		case "may":  case "jul":
		case "aud":  case "oct":  case "dec":
			System.out.println(a+" is 31 days.");
			break;
		case "apr":  case "jun":  
		case "sep":  case "nov":
			System.out.println(a+" is 30 days.");
			break;
		case "feb":
			System.out.println(a+" is 29 days.");
			break;
		default : 
			System.out.println("The month your enter is invaild. "+a);
		}
	}
		
	
	
public static void monthName(int a){
	
	String monthString;
	
	switch(a){
    case 1:  monthString = "January";
    break;
    case 2:  monthString = "February";
    break;
    case 3:  monthString = "March";
    break;
    case 4:  monthString = "April";
    break;
    case 5:  monthString = "May";
    break;
    case 6:  monthString = "June";
    break;
    case 7:  monthString = "July";
    break;
    case 8:  monthString = "August";
    break;
    case 9:  monthString = "September";
    break;
    case 10: monthString = "October";
    break;
    case 11: monthString = "November";
    break;
    case 12: monthString = "December";
    break;
	default: monthString = "Invalid month";
    break;
	}
	System.out.println("The month name your enter is: " + monthString);
}
	
	
	
public static void division(double a, double b){
	double total;
	if(b != 0){
		total = a/b;
		System.out.println("The result for division is: "+ total);	
	}else{
		System.out.println("The denominator couldn't be 0");
	}
}
	
	
	
public static void multiplication(double a, double b){
	double total;
	total = a * b;
	System.out.println("The result for multiplication is: "+total);
}
	


public static void subtraction(double a, double b){
	double total;
	if(a>b){
		total = a-b;
	}else{
		total = b-a;
	}
	System.out.println("The result for subtraction is: " + total);
}
	
	
	

public void countNumber(double a, double b){
	
	double total;
	
	total = a+b;
	System.out.println("The addition is: "+ total);
}
	


public static void multiArrayNumber()
{
	
//	this is for multiple arrays in integer.
	int[][] nums = {
			{2,6,13,25},{0,23,45,2},{9,22,36,7}
	};
	
	for(int i=0; i<nums.length;i++){
		for(int col=0; col<nums[i].length;col++){
			System.out.print(nums[i][col] + " ");
		}
		System.out.println();
	}
}



public static void multiArrayWord()
{
	
	String[][] words = {
			{"abc", "ccd", "ert"},{"aer", "wed", "ioe"}
	};
	
	for(int i=0; i<words.length;i++){
		for(int col=0; col<words[i].length;col++){
			System.out.print(words[i][col] + " ");
		}
		System.out.println();
	}
}
	

}


















