//String in java 
//Strings are the type of objects that can store the character of values and in java every character is stored as a 16bits i.e. utf-16 bit encoding. A string acts as same as an array of characters in java. 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class StrAndArrlist {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
    }
}

class strarr {
    public static void main(String[] args) {
        String[] str = {"BMW", "Audi", "Akshit", "Toyota", "Ford"};
        String word1 = "BMW";
        int indword1 = -1;
        int indword2 = -1;
        String word2 = "Ford";
        for(int i=0; i<str.length; i++){
            if(str[i].equals(word1)){
                indword1 = i;
            }
        }
        for(int i=0; i<str.length; i++){
            if(str[i].equals(word2)){
                indword2 = i;
            }
        }
        if(indword1 > -1 && indword2 > -1){
        System.out.println(indword2 - indword1);
        }
        else{
            System.out.println("Word not found");
        }
    }
}

//String builder in java
//StringBuilder represents alternative to string and string buffer class. As it create mutable sequence of characters and it is not thread safe.
class strbuild {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        System.out.println(str.charAt(2));

        str.setCharAt(2, 'p');
        System.out.println(str);

        str.insert(2, "y");
        System.out.println(str);

        str.append(" World!");
        System.out.println(str);

        str.delete(0, 1);
        System.out.println(str);

        str.deleteCharAt(2);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

    }
}

//REVERSE A STRINGBUILDER using for loop and swapping
class revstr {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        for(int i=0; i<str.length()/2; i++){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length()-1-i));
            str.setCharAt(str.length()-1-i, temp);
        }
        System.out.println(str);
    }
}

//Find out the maximum length of substring without repeating characters
//dont use that code in your project it is not efficient and it is not the best solution for this problem but it is the simplest solution for this problem because it has the time complexity of O(n^4)
class maxsub {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String sub = "";
        int max = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                boolean flag = false;
                sub = str.substring(i, j);
                for(int k=0; k<sub.length(); k++){
                    for(int l=k+1; l<sub.length(); l++){
                        if(sub.charAt(k) == sub.charAt(l)){
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        break;
                    }
                }
                if(!flag){
                    if(sub.length() > max){
                        max = sub.length();
                    }
                }

            }
        }
        System.out.println(max);
    }
}

//using arraylist
class maxsub2 {
    public static void main(String[] args) {
        String str = "abcadbcbb";
        ArrayList<Character> sub = new ArrayList<>();
        int max = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                if(!sub.contains(str.charAt(j))){
                    sub.add(str.charAt(j));
                    if(sub.size() > max){
                        max = sub.size();
                    }
                }
                else{
                    break;
                }
            }
            sub.clear();
        }
        System.out.println(max);
    }
}

//more efficient solution
class maxsub3 {
    public static void main(String[] args) {
        String str = "abcadbcbb";
        int max = 0;
        int i = 0;
        int j = 0;
        int start = 0;
        ArrayList<Character> sub = new ArrayList<>();
        while(j < str.length()){
            if(!sub.contains(str.charAt(j))){
                sub.add(str.charAt(j));
                j++;
                if(sub.size() > max){
                    max = sub.size();
                    start = i;
                }
            }
            else{
                sub.remove(0);
                i++;
            }
        }
        String subb = str.substring(start, start+max);
        System.out.println(max);
        System.out.println(subb);
    }
}
//Arraylist in java
//ArrayList is a part of Java collection framework and it is present in java.util package. It provides us dynamic arrays in java. througth it may be slower than standard arrays but it can be helpful in programs where lots of manipulation in the array is needed. 
class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        arr.add(2, 25);
        System.out.println(arr);
        arr.set(4, 55);
        System.out.println(arr);
        System.out.println(arr.get(5));
        System.out.println(arr.size());
        System.out.println(arr.contains(70));
        System.out.println(arr.indexOf(70));
        System.out.println(arr.isEmpty());
        arr.clear();
        System.out.println(arr);
    }
}

//declaring arraylist of different type
//add elements
//get elements
//add elements at specific index
//set elements at specific index
//delete elements at n index
//size of arraylist
//sort arraylist
//Collections.sort(arr);
class arrlist2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(40);
        arr.add(90);
        arr.add(80);
        arr.add(70);
        arr.add(60);
        arr.add(50);
        arr.add(100);
        System.out.println(arr);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("BMW");
        arr2.add("Audi");
        arr2.add("Akshit");
        arr2.add("Toyota");
        arr2.add("Ford");
        System.out.println(arr2);
        System.out.println(arr2.get(2));
        arr2.add(2, "Mercedes");
        System.out.println(arr2);
        arr2.set(4, "Chevrolet");
        System.out.println(arr2);
        arr2.remove(0);
        System.out.println(arr2);
        System.out.println(arr2.size());
        arr.sort(null);
        System.out.println(arr);
        Collections.sort(arr2);
        System.out.println(arr2);
    }
}

//anagram
//two strings are said to be anagram if they have same characters but in different order
class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean flag = false;
        if(str1.length() == str2.length()){
            for(int i=0; i<str1.length(); i++){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}

//with arraylist
class anagram2 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()]; 
        boolean flag = false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<str1.length(); i++){
            if(arr1[i] != arr2[i]){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Anagram");
        }
        else{
            System.out.println("Anagram");
        }
    }
}

//sring palendrome
class palendrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean flag = false;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Palendrome");
        }
        else{
            System.out.println("Palendrome");
        }
    }
}

//int palendrome
class palendrome2 {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev){
            System.out.println("Palendrome");
        }
        else{
            System.out.println("Not Palendrome");
        }
    }
}

