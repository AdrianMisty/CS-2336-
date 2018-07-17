//Adriana Alva
//CS 2336.0u!
//HW#4
public class MyInteger {

	public static void main(String[] args) {
		//create objects
		MyInteger int1 = new MyInteger(3);
        MyInteger int2 = new MyInteger(1);
        MyInteger int3 = new MyInteger(2);
         //test 
        System.out.println("Is " +int1.getValue()+" prime ? : "  +int1.isPrime());
        System.out.println("Is " +int2.getValue()+" prime ? : "  + int2.isPrime());
        System.out.println("Is " + int3.getValue()+" prime ? : "  + int3.isPrime());
      //invoke methods
        System.out.println("is "+ int1.getValue()+" even ? : "+ int1.isEven());
        System.out.println("is "+ int2.getValue()+" even ? : "+ int2.isEven());
        System.out.println("is "+ int3.getValue()+" even ? : "+ int3.isEven());
        System.out.println("Testing ParseInt methods");
        System.out.println( MyInteger.parseInt(new char[] {'4', '3', '3'}));
        System.out.println(MyInteger.parseInt("678"));
	}
    private int Value;// int data field
    //constructor that creates MyInteger with a specified value
    public MyInteger(int value) {
        Value = value;
    }
    //getter for Value
    public int getValue() {
        return Value;
    }
    //return true if is even
    public boolean isEven() {
        boolean even =(Value % 2) == 0;
        return even;
    }
  //return true if is odd
    public boolean isOdd() {
        boolean odd = (Value % 2) == 1;
        return odd;
    }
   //return true if is prime
    public boolean isPrime() {
    	//if value is 1 or 2 , then its prime
        if (Value == 1 || Value == 2) {
            return true;
        }
        else {
        	//check to see if value is not prime
            for (int p = 2; p < Value; p++) {
                if (p % Value == 0)
                	{
                	return false;
                	
                	}
            }
        }//if it is prime, return true
        return true;
    }
    //static methods we need to create...
    public static boolean isEven(int myInt) {
        boolean even = (myInt % 2) == 0;
        return even;
    }

    public static boolean isOdd(int myInt) {
        boolean odd = (myInt % 2) == 1;
        return odd;
    }

    public static boolean isPrime(int myInt) {
        // 1 & 2 are prime #'s
    	if (myInt == 1 || myInt == 2) {
            return true;
        }
        else {
            for (int p = 2; p < myInt; p++) {
                if (p % myInt == 0) 
                	{//if not prime,return false
                	return false;
                	}
                }
        }//return true if prime
        return true;
    }    
    // static methods such as the ones before
    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }
  //same as previous methods
    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }
  //same as previous methods
    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }
  //same as previous methods
    public boolean equals(int testInt) {
        if (testInt == Value) 
            return true;
        return false;
    }
//same as previous methods
    public boolean equals(MyInteger myInt) {
        if (myInt.Value == this.Value) 
            return true;
        return false;
    }
    //converts an array of characters to an int value
    public static int parseInt(char[] values) {
        int result = 0;
        //easier than using the traditional for loop
        for (char c : values) {
            result += Character.getNumericValue(c);
        }
        return result;
    }
    //converts string into int value
    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
