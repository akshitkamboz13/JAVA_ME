// Description: This file contains the code for the bitwise operators in Java.

public class bitwiseOpe {
    public static void main(String[] args) {
        int a=11;

        //XOR
        int b=5;
        int c=6;
        System.out.println(b^c);
        //XOR is used to check if the numbers are different

        //AND
        System.out.println(b&c);

        //OR
        System.out.println(b|c);

        //NOT
        System.out.println(a!=b);

        //left shift
        System.out.println(b<<1);

        //a<<b == a*2^b
        System.out.println(b<<c);
        //c<<b == c*2^b

        //right shift
        System.out.println(b>>1);

        //complement
        System.out.println(~b);
    }

}

//table of xor
// 0 1 = 1
// 1 0 = 1
// 0 0 = 0
// 1 1 = 0

//table of and
// 0 1 = 0
// 1 0 = 0
// 0 0 = 0
// 1 1 = 1

//table of or
// 0 1 = 1
// 1 0 = 1
// 0 0 = 0
// 1 1 = 1

//table of not
// 0 = 1
// 1 = 0

//table of left shift
// 1<<1 = 2
// 1<<2 = 4
// 1<<3 = 8
// 1<<4 = 16

//table of right shift
// 1>>1 = 0
// 1>>2 = 0
// 1>>3 = 0
// 1>>4 = 0

//table of complement
// ~1 = -2
// ~2 = -3
// ~3 = -4
// ~4 = -5

//2^0 2^1 2^2 2^3 2^4 2^5 2^6 2^7 2^8 2^9 2^10 2^11 2^12 2^13 2^14 2^15 2^16 2^17 2^18 2^19 2^20 2^21 2^22 2^23 2^24 2^25 2^26 2^27 2^28 2^29 2^30 2^31

//2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536 131072 262144 524288 1048576 2097152 4194304 8388608 16777216 33554432 67108864 134217728 268435456 536870912 1073741824 

//int uses 4 bytes of memory
//4 bytes = 32 bits

//even or odd using bitwise operator
class evenOrOdd{
    public static void main(String[] args) {
        int a = 5;
        if((a&1) == 0){
            System.out.println("Even");
         }
         else{
            System.out.println("Odd");
         }
    }
}


class allPro{
    public static void leftShift(){
        int a = 4;
        int b = 4;
        System.out.println(a<<1);

        //a<<b == a*2^b
        System.out.println(a<<b);
    }

    public static void righyShift(){
        int a = 4;
        int b = 4;

        System.out.println(a>>1);

        //a>>b == a/2^b
        System.out.println(a>>b);
    }
    public static void main(String[] args) {
        leftShift();
        righyShift();
    }
}


class Qustions{
    public static void uniqueElement(){
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8};
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println(res);
        //1^2 = 3
        //3^3 = 0
        //0^4 = 4
        //4^5 = 1
        //1^6 = 7
        //7^7 = 0
        //0^8 = 8
        //8^9 = 1
        //1^1 = 0
        //0^2 = 2
        //2^3 = 1
        //1^4 = 5
        //5^5 = 0
        //0^6 = 6
        //6^7 = 1
        //1^8 = 9
    }
    public static void main(String[] args) {
        //find unique number in an array where all numbers are repeated twice except one
        uniqueElement();
        
    }
}

//advantaces of bitwise operator
//1. Fast - bitwise operators are faster than arithmetic operators
//2. Space optimization - bitwise operators are used multiple values in a single variable, which can be work with limited memory
//3. Bit manipulation - bitwise operators allow for precise control over individual bits of a number, which can be useful in certain applications such as cryptography, error detection or data compression.
//4. Code simplification - bitwise operators can simplify the code by reducing the number of conditional statements or loops required to perform certain operations.



