import java.util.Enumeration;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack s=new Stack<>();
  s.push("Shreyash");
  s.push("Avinash");
  s.push("Arghode");
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(null);
  s.push(true);
  s.push(false);
  s.push(1.2);
  Enumeration e=s.elements();
  while (e.hasMoreElements()) 
  {
    System.out.println(e.nextElement());  
  }
  System.out.println( "Peek  => "+ s.peek());///shows the last elements
}
}
