class product{
    public static void main(String[]args) {
        int num = 10, product = 1;

        for (int i = 1; i<= num; ++i){
            product *=i;
        }
        System.out.println("The product of the first ten positive integers is " + product);
    }
}
    