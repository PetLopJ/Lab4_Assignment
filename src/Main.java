//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //initialized n, calls HelloWorld function
    public static void main(String[] args) {
        int n = 5;
        HelloWorld(n);

    }
    //creates HelloWorld function, base case n>0, recursively decrements n in HelloWorld(n-1)
    static void HelloWorld(int n){
        if(n>0){
            System.out.println("Hello World");
            HelloWorld(n-1);
        }
    }
}
