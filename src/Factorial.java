// Importing input output classes
// Java Program to Find Factorial of a Number
// where N>=0 is currently N>1


class GFG {


    // To calculate factorial
    static int factorial(int n)
    {


        // If value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;
        //main case
        return n * factorial(n - 1);
    }


    public static void main(String[] args)
    {

        int ans = factorial(4);
        System.out.println(ans);
    }
}


