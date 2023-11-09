package tp3;
import java.util.Scanner;

public class TP3 {
	public static void main(String[] args) {
		
		char chr = 'A';
		System.out.println(chr);
		System.out.println((int)(chr));
		int cv = (int)(chr);
		cv = cv +32 ;
		System.out.print((char)(cv));
		//exercice1();
		//exercice2();
		//exercice3();    
	}
	
	private static char[] StringInt(char c) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] Int(char c) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void exercice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une chaîne de caractères : ");
		String input = sc.next();
		String reversed = reverseString(input);
		System.out.println("Chaîne à l'envers : " + reversed);   
		sc.close();
	}
	public static void exercice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une chaîne de caractères en notation binaire : ");
		String binaryString = sc.next();
		int decimalValue = binaryToDecimal(binaryString);
		System.out.println("Valeur en notation décimale : " + decimalValue);  
		sc.close();
	}
	public static void exercice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez une chaîne de caractères : ");
		String input = sc.next();
		String uppercaseString = input.toUpperCase();   
		System.out.println("Chaîne en majuscules : " + uppercaseString);
		sc.close();
	    
	}
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	    
	}

	public static int binaryToDecimal(String binaryString) {
		int decimalValue = Integer.parseInt(binaryString, 2); 
		return decimalValue;
	    
	}
	
	public static void exercice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String input = sc.next();
        String alternatedCaseString = alternateCase(input);
        System.out.println("Chaîne avec alternance minuscules/majuscules : " + alternatedCaseString);
        sc.close();
    }

    public static void exercice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un caractère : ");
        char character = sc.next().charAt(0);
        System.out.print("Entrez une chaîne de caractères : ");
        String input = sc.next();
        int occurrenceCount = countOccurrences(input, character);
        System.out.println("Nombre d'occurrences du caractère : " + occurrenceCount);
        sc.close();
    }

    public static void exercice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un caractère : ");
        char character = sc.next().charAt(0);
        System.out.print("Entrez une chaîne de caractères : ");
        String input = sc.next();
        String resultString = removeCharacterOccurrences(input, character);
        System.out.println("Chaîne après suppression des occurrences du caractère : " + resultString);
        sc.close();
    }

    public static String alternateCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = true;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (toUpperCase)
                    result.append(Character.toUpperCase(c));
                else
                    result.append(Character.toLowerCase(c));
                toUpperCase = !toUpperCase;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static int countOccurrences(String str, char character) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }

    public static String removeCharacterOccurrences(String str, char character) {
        return str.replace(String.valueOf(character), "");
    }

}



