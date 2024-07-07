import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + convertNumberToWords(number));
        scanner.close();
    }
    
    public static String convertNumberToWords(int number) {
        // Array containing words for numbers 0 to 19
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                         "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        
        // Array containing words for multiples of ten
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        if (number < 20) {
            return ones[number];
        }
        
        if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10];
        }
        
        if (number < 1000) {
            return ones[number / 100] + " Hundred " + convertNumberToWords(number % 100);
        }
        
        if (number < 1000000) {
            return convertNumberToWords(number / 1000) + " Thousand " + convertNumberToWords(number % 1000);
        }
        
        if (number < 1000000000) {
            return convertNumberToWords(number / 1000000) + " Million " + convertNumberToWords(number % 1000000);
        }
        
        return "Number out of range";
    }
}
