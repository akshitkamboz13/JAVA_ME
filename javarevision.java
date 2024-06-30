import java.util.Scanner;

//write a program to swap two numbers without using a third variable
public class javarevision {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("a: "+a+" b: "+b);
    }
}

//with temp variable
class swapWithTemp {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+a+" b: "+b);
    }
}

//with bitwise XOR
class swapWithBitwiseXOR {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a+" b: "+b);
    }
}

//write a program to get input any 3 numbers and find the largest number
class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is the largest number");
        }else if(b>a && b>c){
            System.out.println("b is the largest number");
        }
        else if(c>a && c>b){
            System.out.println("c is the largest number");
        }
        else if(a==b && a>c){
            System.out.println("a and b are the largest numbers");
        }
        else if(b==c && b>a){
            System.out.println("b and c are the largest numbers");
        }
        else if(a==c && a>b){
            System.out.println("a and c are the largest numbers");
        }
        else{
            System.out.println("All numbers are equal");
        }
        sc.close();
    }
}
//using Math.max
class largestNumberUsingMathMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: "+largest);
        sc.close();
    }
}

//write a program get input any single alphabet and find out this alphabet vowal or consonant
class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}

//reverse a number
class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(n!=0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }
        System.out.println("Reverse number is: "+reverse);
        sc.close();
    }
}

// n/10 is use for removing the last digit of the number
//exapmle: 1234/10 = 123
class removelastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n/10;
        System.out.println("Number after removing last digit is: "+n);
        sc.close();
    }
}

//A
//BC
//DEF
//GHIJ
//KLMNO
class pattern1 {
    public static void main(String[] args) {
        int k = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(k+64));
                k++;
            }
            System.out.println();
        }
    }
}

//1
//01
//101   
//0101
//10101
class pattern2 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

//    ****
//   ****
//  ****
// ****
//****
class pattern3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


