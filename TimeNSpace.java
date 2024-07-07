
public class TimeNSpace {

}
//Time Complexity:- If the loop is not in nested loop and both are different loops than we take only worst case time complexity O(n) and take always large exponential.
//Time and Space Complexity:- Generally there is more than only one way to solve a computer science with different algorithms. Therefore it is highly required to use a method to compare the solution in order to judge which one is more optimal. The method is:-- 
//*Independent of the machine and its configuration.
//*Show a direct correlation with number of input. Can distinguish two algorithms clearly without ambiguity.
// Time Complexity:- It is quantifies the amount of time taking by an algorithm to run as a function of the length of the input.
// #Note:-The time to run is a function is the length of the input is not the actual execution time of the machine on which the algorithm is running on.* The valid algorithm take a finite amount of time for execution. The time required by algorithm to solve given problem is called time complexity.
// execution time of the machine on which the algo is running on. 
//->The valid algo take finite amount of time for the execution. The time required by a algo to execute a program is time complexity.

//--------------------SPACE COMPLEXITY---------------------
//Problem solving using computer required memory to hold temperary data or final result while the program is in execution. The amount of memory required by an algo to solve a given problem is space complexity of an algo.
//->The space complexity of an algo is the amount of memory space required by the algo to solve a problem as a function of the size of the input data.
//To estimate the memory requirement we need to focus on two parts.
//1. Fixed part: Space required to store certain data and variables, that are not dependent of the size of the problem. It includes memory for instruction(code, constant, variables etc).
//2. Variable part: It is dependent on input size. It includes memory for instructions. It includes memory for recursion stack, reference variables.


//convert to romon number
//4-IV
//5-V
//9-IX
//10-X
//40-XL
//50-L
//90-XC
//100-C
//400-CD
//500-D
//900-CM
//1000-M
class Roman{
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("1985");
        String[] comp = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] compNum = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int num = Integer.parseInt(a.toString());
        StringBuilder res = new StringBuilder();
        for(int i=compNum.length-1; i>=0; i--){
            while(num>=compNum[i]){
                num = num - compNum[i];
                res.append(comp[i]);
            }
        }
        System.out.println("Roman number is: "+res);
    }
}

//to find longest common prifix in the string
class commonPrifix{
    public static void main(String[] args) {
        String[] str = {"Fly","Flower","Flow"};
        String prefix = str[0];
        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("Longest common prifix is: "+prefix);
    }
}

//decimal to binary
class decimalToBinary{
    public static void main(String[] args) {
        int num = 10;
        StringBuilder res = new StringBuilder();
        while(num>0){
            res.append(num%2);
            num = num/2;
        }
        System.out.println("Binary number is: "+res.reverse());
    }
}

//binay to decimal
class binaryToDecimal{
    public static void main(String[] args) {
        int bin = 1010;
        int dec = 0;
        while(bin > 0){

        }
    }
}


//grand design - web dev/design -> css html js webdesign programminglang ui ux
//app dev - android ios -> java kotlin swift objective-c react native flutter
//software dev - java python c c++ c# ruby php
//data science - python r scala sas 

class lastWordLength{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("How are you");
        int count = 0;
        for(int i=0;i<str.length();i++){
            count++;
            if(str.charAt(i) == ' ' ){
                count = 0;
            }
        }
        System.out.println(count);
    }
}

//Two sum
class twoSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 15;
        for(int i=0; i<arr.length; i++){
            int first = arr[i];
            if(first<key){
                for(int j= 0; j<arr.length; j++){
                    if(first + arr[j] == key){
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                }
            }
        }
    }
}

//reverse a String
class reverseString{
    public static void main(String[] args) {
        String str = "Last word length of string";
        String rev = "";
        String word = "";
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == ' ' || i == str.length()-1){
                rev = word + " "+ rev;
                word = "";
            }
            else{
                word = word + str.charAt(i);
                if( i == str.length()-2){
                    word = word + str.charAt(str.length()-1);
                }
            }
        }
        System.out.println(rev);
    }
}

