package Udemy;

public class Printer {
    private int toner;
    private int numberOfPages;
    //private int duplexPrinter;

    public Printer(){

    }

    public Printer(int toner, int numberOfPages){
        if (toner <= 0 || toner >= 100) throw new IllegalArgumentException("To use toner it must be greater than 0% or equal to 100%");{
            this.toner = toner;
        }
        this.numberOfPages = numberOfPages;
        //this.duplexPrinter = duplexPrinter;
    }

    public int fillUpToner(String color,int tonerLevel){
        if (tonerLevel >= 100){
            System.out.println("The "+ color+" color can't be toned more than 100%");
        }else if (tonerLevel <= 0){
            System.out.println("Sorry you can't use the toner. You have to go above 0% to use toner");
        }
        return tonerLevel;
    }

    public void printPages(int numberOfPages){
        if (numberOfPages > 5) {
            throw new IllegalArgumentException("You can't print more than 5 pages at a go");
        }
        switch (numberOfPages) {
            case 0 -> throw new IllegalArgumentException("Invalid input. Try again!");
            case 1 -> System.out.println(numberOfPages + " page printed successfully");
            case 2, 3, 4, 5 -> System.out.println(numberOfPages + " pages printed successfully");
        }
    }
}




