package HW20;

public class CreditCard {
   /* Create a class CreditCard and define variable balance and interest.
   Create an instance method that will calculate interest based on the given balance.
    *//*Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
    }

    double Result(double balance, double interest){
        double num=balance/interest;
        if(num<balance){
        }
        return num;
    }

}

class tester{
    public static void main(String[] args) {
        CreditCard c=new CreditCard(5000.6,3.7);
       double e=c.Result(5000.6,3.7);
        System.out.println(e);
    }
}