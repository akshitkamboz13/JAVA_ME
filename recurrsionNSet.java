public class recurrsionNSet {
    public static void RemA(String unstr, String proStr, char word) {
        if (unstr.length() == 0) {
            System.out.println(proStr);
            return;
        }
        if (unstr.charAt(0) == word){
RemA(unstr.substring(1), proStr, word);
        }
        else{
            String nmn = proStr + unstr.charAt(0);
            RemA(unstr.substring(1), nmn, word);
        
        }
    }
    public static void main(String[] args) {
        String unstr = "abajsajanabaha";
        String proStr = "";
        char word = 'a';
        RemA(unstr, proStr, word);
    }
}

//Another approach
class anptherApprochRecurrsion{
    public static String RemveA(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'a') {
            return RemveA(str.substring(1));
        }
        else{
            return str.charAt(0) + RemveA(str.substring(1));
        }
    }
    public static void RemA(String unstr, String proStr, char word) {
        String str = "abhaubabuaa";
        String rtn = RemveA(str);
        System.out.println(rtn);
    }
}


//Remove substring from a string using recurrsion






//SubSet -> means all possible combination of a string
//abc -> {}, {a}, {b}, {c}, {a,b}, {a,c}, {b,c}, {a,b,c}
//Defination: A subset is a set that is made by taking some or all elements of another set.
//Important: The number of subsets of a set is 2^n, where n is the number of elements in the set.
//This is pattern of taking some elements and leaving some elements.
//Approach:
//1. Take the first element and leave the first element.
//2. Take the first element and take the first element.
//3. Leave the first element and take the first element.
//4. Leave the first element and leave the first element.
//5. Repeat the process for the rest of the elements.
//6. Base case: If the string is empty, then print the string.

class SubSet{
    public static void subSet(String unstr, String proStr) {
        if (unstr.length() == 0) {
            System.out.print(proStr +" ");
            return;
        }
        char ch = unstr.charAt(0);
        subSet(unstr.substring(1), proStr + ch);
        subSet(unstr.substring(1), proStr);
    }
    public static void main(String[] args) {
        String unstr = "abc";
        String proStr = "";
        subSet(unstr, proStr);
    }
}

//subsquencing -> It define as a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
//Properties:
//1. A sequence is a subsequence of itself.
//2. The empty sequence is a subsequence of any sequence.
//3. The no of subsequences of a sequence of length n is 2^n.
//4. The subsequences of a subsequence is also a subsequence of the original sequence.
//5. The relative order is unchanged.

//Backtracking -> It is a problem-solving algorithmic technique that involves finding all possible solutions incrementally by trying all the possible options and undoing them if they lead a dead end. It is commonly used in situations where you need to explore multiple posibliities to solve a problem.

//ABC
//ABC,ACB,BAC,BCA,CAB,CBA
//Approach:
class Sequence{
    public static void subSequence(String unstr, String proStr) {
        if (unstr.length() == 0) {
            System.out.print(proStr +" ");
            return;
        }
        else{
            for(int i=0; i<unstr.length(); i++){
                char ch = unstr.charAt(i);
                String roStr = unstr.substring(0,i) + unstr.substring(i+1);
                subSequence(roStr, proStr + ch);
            }
        }
    }
    public static void main(String[] args) {
        String unstr = "abc";
        String proStr = "";
        subSequence(unstr, proStr);
    }
}

//N-Queen Problem
//The N-Queens problem is a classic problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. For example, following is a solution for 4 Queen problem.