public class Sum {
//initializes n1, n2, result is assigned Multiples function, prints result
    public static void main(String args[]) {
        int n1 = 1;
        int n2 = 100;
        int result = Multiples(n1, n2);
        System.out.println(result);
    }
    static int Multiples(int n1, int n2) {
        //base case 1
        if (n1 <= n2) {
            //base case 2
            if (n1 % 7 == 0) {
                //if both true prints n1 and recursively adds 7 to n1;
                System.out.println(n1);
                return n1 + Multiples(n1 + 7, n2);
            } else {
                // recursively adds 1 to n1 until true for if statement
                return Multiples(n1 + 1, n2);
            }
        }
        return 0;
    }
}