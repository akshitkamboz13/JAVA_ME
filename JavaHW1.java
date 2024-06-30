import java.util.Scanner;

public class JavaHW1 {
    public static void main(String[] args) {
        System.out.println("HW 1");
    }
}

//natural number 1 to n
class NaturalNum{
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        sc.close();
    }    
}

//reverse n natural numbers
class ReverseNaturalNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int p=n;
        for(int i=1; i<n; i++){
            p=p-1;
            System.out.println(p);
        }
        sc.close();
    }
}

//print A to Z
class AtoZ{
    public static void main(String[] args){
        for(char c='A'; c<='Z'; c++){
            System.out.println(c);
        }
    }
}

//even number 1 to 100
class EvenNum{
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}

//odd number 1 to 100
class OddNum{
    public static void main(String[] args){
        for(int i=1; i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}

//sum of n natural numbers
class SumNaturalNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1 ; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}

//sum of n even numbers
class SumEvenNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
       int sum=0;
       for(int i = 1; i<=n; i++){
           if(i%2==0){
               sum = sum+i;
           }
           else{
               continue;
           }
       }
       System.out.println(sum);
       sc.close();
    }
}

//sum of n odd numbers
class SumOddNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                sum = sum+i;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

//multipication table of n
class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n +" * "+ i +" = "+ n*i );
        }
        sc.close();
    }
}

//count number of digit in a number
class CountDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 0;
       for(int i=n ; i>0; i=i/10){
              count++;
       }
       System.out.println(count);
       sc.close();
    }
}

//find first and last digit of  number
class FirstLastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int last = n%10;
        int first=0;
        for(int i = n; i >0; i=i/10){
            first = i;
        }
        System.out.println("First: " + first + "\t" + "Last: "+last);
        sc.close();
    }
}

//find sum of first and last digit on number
class SumFirstLastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int last = n%10;
        int first=0;
        for(int i = n; i >0; i=i/10){
            first = i;
        }
        int sum=first +last;
        System.out.println("Sum of first and last: " +  sum);
        sc.close();
    }
}

//swap first and last digit of a number
class swapFLDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // int last = n%10;
        // int first=0 , p=0,m=0;
        // for(int i = n; i >0; i=i/10){
        //     first = i;
        // }
        // for(int i = n; i >0; i=i/10){
        //     if(i!=n && i>10){
        //         p= (i%10)+(p*10);
        //     }
        // }
        // for(int i =p;i>0;i=i/10){
        //     m=(m*10)+(i%10);
        // }
        // System.out.println(last+""+m+""+first);


        int last = n%10;
        int first=0;
        int pov =1;
        for(int i = n; i >0; i=i/10){
            first = i;
            pov *= 10;
        }
        pov=pov/100;
        int num = n/10;
        int middle = num%pov;

        System.out.println(last+""+middle+""+first);
        sc.close();
    }
}

//calculate sum of digits of a number
class SumDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = n; i>0; i=i/10){
            sum = sum + i%10;
        }
        System.out.println(sum);
        sc.close();
    }
}

//product of digits of numbers
class ProductDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int product=1;
        for(int i = n; i>0; i=i/10){
            product = product * (i%10);
        }
        System.out.println(product);
        sc.close();
    }
}

//reverse a number
class ReverseNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int rev=0;
        for(int i = n; i>0; i=i/10){
            rev = (rev*10) + (i%10);
        }
        System.out.println(rev);
        sc.close();
    }
}

//check palindrome number
class PalindromeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int rev=0;
        int p=n;
        for(int i = n; i>0; i=i/10){
            rev = (rev*10) + (i%10);
        }
        if(rev==p){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}

//find frequency of digit in a number
class FrequencyDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] freq = new int[10];
        for(int i = n; i>0; i=i/10){
            freq[i%10]++;
        }
        for(int i=0; i<10; i++){
            if(freq[i]>0){
                System.out.println("Frequency of "+i+" is "+freq[i]);
            }
        }
        sc.close();
    }
}

//enter a number and print in words
class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Number in words: " + convertToWords(number));
    }

    public static String convertToWords(int number) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number == 0) {
            return "Zero";
        }

        // Handling numbers from 1 to 19 directly
        if (number < 20) {
            return units[number];
        }

        // Handling numbers from 20 onwards
        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }

        // Handling numbers greater than or equal to 100
        if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWords(number % 100);
        }

        return "Number is too large to convert"; // Handling numbers greater than 1000
    }
}

//print all ASSCI characters with their values
class AsciiValue{
    public static void main(String[] args) {
        for(int i=0; i<=255; i++){
            System.out.println(i + " : " + (char)i);
        }
    }
}

//find power of a number using for loop
class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of power : ");
        int p = sc.nextInt();
        int pow=1;
        for(int i=1; i<=p; i++){
            pow = pow*n;
        }
        System.out.println(pow);
        sc.close();
    }
}

//all factors of a number
class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

//find factorial of a number
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}

//find HCF of two numbers
class HCF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of number2: ");
        int n2 = sc.nextInt();
        int hcf=1;
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                System.out.println(hcf);
            }
        }
        sc.close();
    }
}