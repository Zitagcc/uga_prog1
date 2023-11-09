package tp2;
import java.util.Scanner;

public class TP2 {
	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); // Saisie du premier entier
		 * System.out.print("Entrez le premier entier : "); int a = scanner.nextInt();
		 * 
		 * // Saisie du deuxième entier
		 * System.out.print("Entrez le deuxième entier : "); int b = scanner.nextInt();
		 */
        
		//System.out.println(3/2);
        exercice3a();
	     // Fermez le scanner pour libérer les ressources
        //scanner.close();
    }
	public static int exercice1a(int a, int b) {
		
		int maxValue = 0;
        // Calcul de la valeur maximale
        if (a<b) {
        	maxValue = b;
        }
        else {
        	maxValue = a;
        }
        
        // Affichage du résultat
        //System.out.println("La valeur maximale est : " + maxValue);
        return maxValue;

	}
	
	public static void exercice1b() {
		Scanner scanner = new Scanner(System.in);

        // Saisie du premier entier
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();

        // Saisie du deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        // Saisie du troisième entier
        System.out.print("Entrez le troisième entier : ");
        int c = scanner.nextInt();

        // Calcul de la valeur maximale
        int maxValue = exercice1a(a, exercice1a(b, c));

        // Affichage du résultat
        System.out.println("La valeur maximale est : " + maxValue);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
	}
	
	public static void exercice1c() {
        Scanner scanner = new Scanner(System.in);

        // Saisie des quatre entiers
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        System.out.print("Entrez le troisième entier : ");
        int c = scanner.nextInt();

        System.out.print("Entrez le quatrième entier : ");
        int d = scanner.nextInt();

        // Calcul de la valeur maximale
        int maxValue = exercice1a(a, exercice1a(b, exercice1a(c, d)));

        // Affichage du résultat
        System.out.println("La valeur maximale est : " + maxValue);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
	
	public static void exercice1d() {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        // Affichage dans l'ordre croissant
        if (a <= b) {
            System.out.println("Les entiers dans l'ordre croissant sont : " + a + ", " + b);
        } else {
            System.out.println("Les entiers dans l'ordre croissant sont : " + b + ", " + a);
        }
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
	
	public static void exercice1e() {
        Scanner scanner = new Scanner(System.in);

        // Saisie des trois entiers
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        System.out.print("Entrez le troisième entier : ");
        int c = scanner.nextInt();

        // Variables temporaires pour stocker les valeurs dans l'ordre croissant
        int temp1, temp2;

        // Tri des entiers dans l'ordre croissant
        if (a > b) {
            temp1 = a;
            a = b;
            b = temp1;
        }
        if (a > c) {
            temp1 = a;
            a = c;
            c = temp1;
        }
        if (b > c) {
            temp2 = b;
            b = c;
            c = temp2;
        }

        // Affichage dans l'ordre croissant
        System.out.println("Les entiers dans l'ordre croissant sont : " + a + ", " + b + ", " + c);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
        
    }
	
	public static void exercice2a() {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux entiers
        System.out.print("Entrez le premier entier (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier (b) : ");
        int b = scanner.nextInt();
        
        int result = multiply(a,b);

        // Affichage du résultat
        System.out.println("Le produit de " + a + " et " + b + " est : " + result);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer le produit de a et b sans utiliser l'opérateur *
    public static int multiply(int a, int b) {
        int rslt = 0;
        int cpt = 0;
        while (cpt <b) {
        	rslt = rslt + a;
        	cpt++;
        }

        return rslt;
    }
    
	
	public static void exercice2b() {
        Scanner scanner = new Scanner(System.in);

        // Saisie de la base (a)
        System.out.print("Entrez la base (a) : ");
        int a = scanner.nextInt();

        // Saisie de l'exposant (b)
        System.out.print("Entrez l'exposant (b) : ");
        int b = scanner.nextInt();

        int result = power(a, b);

        // Affichage du résultat
        System.out.println(a + " élevé à la puissance " + b + " est : " + result);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer a élevé à la puissance b sans utiliser l'opérateur ^
    public static int power(int a, int b) {
        int rslt = 1;

        for (int i = 0; i < b; i++) {
            rslt = multiply(rslt,a) ;
        }

        return rslt;
    }

    
    public static void exercice2c() {
        Scanner scanner = new Scanner(System.in);

        // Saisie du dividende (a)
        System.out.print("Entrez le dividende (a) : ");
        int a = scanner.nextInt();

        // Saisie du diviseur (b)
        System.out.print("Entrez le diviseur (b) : ");
        int b = scanner.nextInt();

        int moduloResult = modulo(a, b);

        // Affichage du résultat
        System.out.println("Le résultat de " + a + " modulo " + b + " est : " + moduloResult);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer a % b sans utiliser l'opérateur %
    public static int modulo(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }
    
    public static void exercice2d() {
        Scanner scanner = new Scanner(System.in);

        // Saisie du dividende (a)
        System.out.print("Entrez le dividende (a) : ");
        int a = scanner.nextInt();

        // Saisie du diviseur (b)
        System.out.print("Entrez le diviseur (b) : ");
        int b = scanner.nextInt();

        int quotient = divide(a, b);
        
        int rst      = divide(multiply(a-multiply(quotient,b),10),b);
        

        // Affichage du résultat
        System.out.println("Le résultat de " + a + " divisé par " + b + " est : " + quotient +"."+ rst);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer a / b sans utiliser l'opérateur /
    public static int divide(int a, int b) {
        int quotient = 0;

        while (a >= b) {
            a -= b;
            quotient++;
        }

        return quotient;
    }
    
    public static void exercice3a() {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre entier positif
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        // Vérification de la positivité du nombre
        if (number < 0) {
            System.out.println("Le nombre saisi n'est pas positif.");
            
         // Fermez le scanner pour libérer les ressources
            scanner.close();
            
            return;
        }

        int numDigits = countDigits(number);

        // Affichage du nombre de chiffres
        System.out.println("Le nombre de chiffres dans " + number + " est : " + numDigits);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer le nombre de chiffres dans un nombre entier positif
    public static int countDigits(int nbr) {
        // Si le nombre est 0, il a un chiffre (0)
        if (nbr == 0) {
            return 1;
        }
            
        int cpt = 0;
           
        while (nbr >0) {
            	
        	nbr = divide(nbr,10);
            	
        	cpt++;	 
        }

        return cpt;
           
    }
    
    public static void exercice3b() {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre entier positif
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        // Vérification de la positivité du nombre
        if (number < 0) {
            System.out.println("Le nombre saisi n'est pas positif.");
            
         // Fermez le scanner pour libérer les ressources
            scanner.close();
            return;
        }

        int digitSum = calculateDigitSum(number);

        // Affichage de la somme des chiffres
        System.out.println("La somme des chiffres de " + number + " est : " + digitSum);
        
     // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

    // Méthode pour calculer la somme des chiffres dans un nombre entier positif
    public static int calculateDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            // Extraire le dernier chiffre du nombre
            int digit = number % 10;

            // Ajouter le chiffre à la somme
            sum += digit;

            // Diviser le nombre par 10 pour éliminer le dernier chiffre
            number = divide(number,10);
        }

        return sum;
    }
    
    public static void exercice3c() {
        System.out.println("Nombres d'Armstrong de 3 chiffres :");

        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i, 3)) {
                System.out.println(i);
            }
        }
    }

    // Méthode pour vérifier si un nombre est un nombre d'Armstrong pour un certain nombre de chiffres
    public static boolean isArmstrongNumber(int number, int numDigits) {
        int sumOfCubes = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = modulo(tempNumber,10);
            sumOfCubes += power(digit, numDigits);
            tempNumber = divide(tempNumber,10);
        }

        return sumOfCubes == number;
    }


}
