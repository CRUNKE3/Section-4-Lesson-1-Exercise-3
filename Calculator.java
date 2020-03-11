
package tip03;

public class Calculator {
    public double tax = .05;
    public double tip = .15;
    
    public double findExtra(String person, double price) {
        double total = price*(1+tax+tip);
        return total;
    }
    
    public double findTotal(String person, double price, double extra){
        double total = (price*(1+tax+tip)) + extra;
        System.out.println(person + " $" + total);
        return total;
    }
}
