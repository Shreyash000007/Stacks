import java.util.*;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop

  Stack<Persons> s=new Stack<>();
  Persons obj1=new Persons("Shreyash",22 ,2345);
  Persons obj2=new Persons("Shrey",22 ,234);
  s.push(obj1);
  s.push(obj2);
  s.push(new Persons("Ratan",22,3445));

  Enumeration <Persons> e=s.elements();
  while (e.hasMoreElements()) 
  {
     System.out.println("Enumeration => "+e.nextElement());  
  }
  System.out.println("Peek => "+ s.peek());

  }}
