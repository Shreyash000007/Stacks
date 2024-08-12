import java.util.Enumeration;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop

  Stack <Persons> s=new Stack<>();
  Persons obj1=new Persons("Shreyash",22,234);
  Persons obj2=new Persons("Ratan",22,23454);
  s.push(obj1);
  s.push(obj2);
  s.push(new Persons("Shre",22,238));

  Enumeration <Persons> e=s.elements();
  while (e.hasMoreElements()) 
  {
    System.out.println("Enumeration => "+e.nextElement());  
  }
  System.out.println("Peek => "+s.peek());
  


}
}
