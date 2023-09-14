package tp1;
import java.util.Scanner;

public class TP1 {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
	
	public static void exercice1() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir le premier entier
        System.out.print("Entrez le premier entier : ");
        int premierEntier = scanner.nextInt();

        // Demandez à l'utilisateur de saisir le deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();

        // Calculez la somme des deux entiers
        int somme = premierEntier + deuxiemeEntier;

        // Affichez la somme
        System.out.println("La somme des deux entiers est : " + somme);

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }


}
