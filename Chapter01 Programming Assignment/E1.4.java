class Balance{
    public static void main(String[]args){

        double principal = 1000.0;
        double interestRate = 0.05;
        double total;

        for (int year = 0; year < 4; year++){
            total = Math.round(principal * Math.pow(1.0+0.05, year));
            System.out.println("Your balance is " + total + " after " + year + " years...");
    }
    
    }
}