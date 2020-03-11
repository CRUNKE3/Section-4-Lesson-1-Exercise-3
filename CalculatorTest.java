
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
       
       Calculator calc = new Calculator();
       double extra = (calc.findExtra("Person 6", 15) + calc.findExtra("Person 8", 30))/6;
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       System.out.println( + calc.findTotal("Person 1",10,extra) +
               calc.findTotal("Person 2",12,extra) +
               calc.findTotal("Person 3",9,extra) +
               calc.findTotal("Person 4",8,extra) +
               calc.findTotal("Person 5",7,extra) +
               calc.findTotal("Person 7",11,extra));
      
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
