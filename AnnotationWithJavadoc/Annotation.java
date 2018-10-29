/** <h1> Annotation <h1>
 * This is a simple program for calculator using annotation
 * This calculator can do simple mathematical operations
 * 
 * <p>
 * <b>Note:</b> this calculator can do operations like addition, subtraction, division & multiplication.
 * 
 * @author Fazley Rabbi
 * @version 1.0
 * @since 29-10-2018
 */

package main;

public class Annotation {
	
	
/**
 * This method is used to add two integer values
 * @param value1 This is the first parameter to Addition method
 * @param value2 This is the second parameter to Addition method
 * @return This returns sum of value1 & value2.
 */

public int Addition(int value1, int value2)
{
	return value1+value2;
}

/**
 * This method is used to subtract two integer values
 * @param value1 This is the first parameter to Subtraction method
 * @param value2 This is the second parameter to Subtraction method
 * @return This returns subtraction of value1 & value2.
 */

public int Subtraction(int value1, int value2)
{
	return value1-value2;
}

/**
 * This is used to multiply two integer values
 * @param value1 This is the first parameter to Multiplication method
 * @param value2 This is the first parameter to Multiplication method
 * @return This returns multiplication of value1 & value2.
 */

public int Multiplication(int value1, int value2)
{
	return value1*value2;
}

/**
 * This is used to divide two integer values
 * @param value1 This is the first parameter to Division method
 * @param value2 This is the first parameter to Division method
 * @return This returns division of value1 & value2
 */

public int Division(int value1, int value2)
{
	return value1/value2;
}


}
