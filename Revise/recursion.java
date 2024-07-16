package Revise;

public class recursion {
    public static void printHello(int n){
        if(n==0){
            return;
        }
        else{
            printHello(n-1);
            System.out.println("Hello World  " + n);
        }
    }

    public static void print1ToN(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            print1ToN(n-1);
        }
    }
    public static void main(String[] args) {
        //print hello world 5 times
        printHello(5);
        print1ToN(5);
    }
    
}

//Recursion: A function calling itself is called recursion.

//Recursion Question:
//1. Print 1 to N using recursion.
//2. Print Hello World N times using recursion.
//3. Factorial of a number using recursion.
//4. Fibonacci series using recursion.

class Factorial{
    public static int factorial(int n){
       if(n==0){
        return 1;
       }
       else{
        return n*factorial(n-1);
       }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}

class Fibonacci{
    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void nomo(int n, int a) {
        if(a<=n){
            System.out.println(fib(a));
            a++;
            nomo(n, a);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        nomo(n,0);
    }
} 

//Sub Set of a string using recursion
class SubSet{
    public static void subSet(String str, String curr, int index){
        if(index == str.length()){
            System.out.println(curr);
            return;
        }
        subSet(str, curr, index+1);
        subSet(str, curr+str.charAt(index), index+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSet(str, "", 0);
    }
}

//array of characters empty 
class Empty{
    public static void main(String[] args) {
        char[] arr = new char[5];
        long count = 0;
        for(int i=0; i<arr.length; i++){
            count = count+1;
            System.out.print(count);
        }
    }
}