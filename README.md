# OOPSimpleCalculatorAndCar from Udemy's Java Programming Masterclass for Software Developers

Sum Calculator

Write a class with the name Simple Calculator. The class needs two fields (instance variables) with names
firstNumber and secondNumber both of type double.

Write the following methods (instance methods).

  * Getters and setters for firstNumber and secondNumber
  
  * Method named getAdditionResult without any parameters, it need to return the result of adding the field
    values of firstNumber and secondNumber
    
  * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the   
    field values of secondNumber from the firstNumber.
    
  * Method names getMultiplicationResult without any parameters, it needs to return the result of multiplying the
    field values of firstNumber and secondNumber.
    
  * Method named getDivisionResult without any parameters it needs to return the result of dividing the field
    values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
    
TEST EXAMPLE
TEST CODE:

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        
OUTPUT
      add= 9.0
      subtract= 1.0
      multiply= 0.0
      divide= 0.0
      
TIPS:
  * add= 9.0 is printed because 5.0 + 4 is 9.0
  * subtract= 1.0 is printed because 5.0 - 4 is 1.0
  * multiply= 0.0 is printed because 5.25*0 is 0.0
  * divide= 0.0 is printed because secondNumber is set to 0
  
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
NOTE: Do not add the main method to the solution code.



