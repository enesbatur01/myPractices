package practice05;

public class FiboMethod {
    public static void fibonacci(int num){
        int sum1 =0;
        int sum2=1;
        int sum3;

        if (num <48){


        for (int i = 0; i < num; i++) {
            System.out.print(sum1+" ");

            sum3=sum1+sum2;

            sum1 = sum2;
            sum2=sum3;


        }
    }
        else
        {System.out.println("Please enter valid number");}
    }
}
