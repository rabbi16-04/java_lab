import java.util.Scanner;
public class Bisection {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    double intervalBegin;
    double intervalEnd;
    double middle;
    double precision;
    
    System.out.print("Enter begining of interval: ");  
    intervalBegin = reader.nextDouble();
    
    System.out.print("Enter end of interval: ");  
    intervalEnd = reader.nextDouble();
    
    System.out.print("Enter precision of method: ");  
    precision = reader.nextDouble();
    
    if(Function(intervalBegin) * Function(intervalEnd) > 0.0D) { 
      System.out.println("Function has same signs at ends of interval");
      return;
    }
    
    while(Math.abs(intervalBegin - intervalEnd) > precision) {
      middle = (intervalBegin + intervalEnd) / 2.0D;
      
      System.out.println("X: " + middle);
      
      if(Function(intervalBegin) * Function(middle) < 0.0D) {
        intervalEnd = middle;
      } else {
        intervalBegin = middle;
      }
    }  
  }
  
  static double Function(double x) { //x^2 + 2x -1
    return x * (x + 2) - 1;
  }
}
