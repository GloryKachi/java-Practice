package chapter5Practice;
/*5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.*/
public class CompoundInterest {
    public static void incrementInterestRate(int percent) {
        for (percent = 5; percent <= 10; percent++) {
            System.out.println(percent+"%");
        }
    }

    public static void main(String[] args) {
        incrementInterestRate(5);
    }
}