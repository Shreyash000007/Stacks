public class Persons
{
   String Name;
   String Age;
   String Sal;
   
   public Persons(String Name,int age,int sal)
   {
    this.Name=Name;
    this.Age=Age;
    this.Sal=Sal;

   }

   @Override
   public String toString() {
      return "Persons [Name=" + Name + ", Age=" + Age + ", Sal=" + Sal + "]";
   }
   

}
