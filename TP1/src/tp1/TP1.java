package tp1;
import java.util.Scanner;

public class TP1 {
	public static void main(String[] args) {
        //System.out.println("Hello, World!");
        exercice7();
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
	
	public static void exercice2() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir la somme en euros
        System.out.print("Entrez la somme en euros : ");
        double sommeEnEuros = scanner.nextDouble();

        // Demandez à l'utilisateur de saisir le taux de change
        System.out.print("Entrez le taux de change : ");
        double tauxDeChange = scanner.nextDouble();

        // Calculez la somme en devise étrangère en multipliant par le taux de change
        double sommeEnDevise = sommeEnEuros * tauxDeChange;

        // Affichez la somme en devise étrangère
        System.out.println("La somme en devise étrangère est : " + sommeEnDevise);

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
	
	public static void exercice3() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir les trois valeurs réelles
        System.out.print("Entrez la première valeur réelle : ");
        double valeur1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième valeur réelle : ");
        double valeur2 = scanner.nextDouble();

        System.out.print("Entrez la troisième valeur réelle : ");
        double valeur3 = scanner.nextDouble();

        // Calculez la moyenne des deux plus grandes valeurs
        double moyenne;

        if (valeur1 >= valeur2 && valeur1 >= valeur3) {
            moyenne = (valeur1 + Math.max(valeur2, valeur3)) / 2;
        } else if (valeur2 >= valeur1 && valeur2 >= valeur3) {
            moyenne = (valeur2 + Math.max(valeur1, valeur3)) / 2;
        } else {
            moyenne = (valeur3 + Math.max(valeur1, valeur2)) / 2;
        }

        // Affichez la moyenne des deux plus grandes valeurs
        System.out.println("La moyenne des deux plus grandes valeurs est : " + moyenne);

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
	
	public static void exercice4() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir les heures, les minutes et les secondes
        System.out.print("Entrez les heures : ");
        int heures = scanner.nextInt();

        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();

        System.out.print("Entrez les secondes : ");
        int secondes = scanner.nextInt();

        // Vérifiez si les secondes sont à leur maximum (59) et ajustez les minutes et les heures en conséquence
        if (secondes == 59) {
            secondes = 0;
            if (minutes == 59) {
                minutes = 0;
                heures = (heures + 1) % 24; // Incrémente les heures et assure qu'elles restent dans la plage [0, 23]
            } else {
                minutes++; // Incrémente les minutes
            }
        } else {
            secondes++; // Incrémente les secondes
        }

        // Affichez le triplet représentant l'heure à la seconde suivante
        System.out.println("L'heure à la seconde suivante est : " + heures + " heures, " + minutes + " minutes, " + secondes + " secondes");

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
	
	
    public static void exercice5() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir la première durée
        System.out.println("Saisissez la première durée :");
        System.out.print("Heures : ");
        int heures1 = scanner.nextInt();
        System.out.print("Minutes : ");
        int minutes1 = scanner.nextInt();
        System.out.print("Secondes : ");
        int secondes1 = scanner.nextInt();

        // Demandez à l'utilisateur de saisir la deuxième durée
        System.out.println("Saisissez la deuxième durée :");
        System.out.print("Heures : ");
        int heures2 = scanner.nextInt();
        System.out.print("Minutes : ");
        int minutes2 = scanner.nextInt();
        System.out.print("Secondes : ");
        int secondes2 = scanner.nextInt();

        // Calculez la somme des deux durées
        int sommeHeures = heures1 + heures2;
        int sommeMinutes = minutes1 + minutes2;
        int sommeSecondes = secondes1 + secondes2;

        // Gérez les dépassements (retenez les minutes et les secondes qui dépassent 59)
        if (sommeSecondes >= 60) {
            sommeMinutes += sommeSecondes / 60;
            sommeSecondes %= 60;
        }
        if (sommeMinutes >= 60) {
            sommeHeures += sommeMinutes / 60;
            sommeMinutes %= 60;
        }

        // Affichez le triplet représentant la somme des durées
        System.out.println("La somme des durées est : " + sommeHeures + " heures, " + sommeMinutes + " minutes, " + sommeSecondes + " secondes");

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
    
    public static void exercice6() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Initialiser les variables pour la somme et la moyenne
        int somme = 0;
        double moyenne = 0.0;

        // Demandez à l'utilisateur de saisir 10 entiers
        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez l'entier #" + i + " : ");
            int entier = scanner.nextInt();

            // Ajoutez l'entier à la somme
            somme += entier;
        }

        // Calculez la moyenne en divisant la somme par 10.0 (pour obtenir une moyenne décimale)
        moyenne = (double) somme / 10.0;

        // Affichez la somme et la moyenne
        System.out.println("La somme des 10 entiers est : " + somme);
        System.out.println("La moyenne des 10 entiers est : " + moyenne);

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }
    
    
    public static void exercice7() {
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Initialisez les variables pour le nombre d'entiers, la somme et la valeur de l'entier lu
        int nombreEntiers = 0;
        int somme = 0;
        int entier;

        // Demandez à l'utilisateur de saisir une suite d'entiers terminée par 0
        System.out.println("Saisissez une suite d'entiers terminée par 0 :");
        
        do {
            System.out.print("Entrez un entier (0 pour terminer) : ");
            entier = scanner.nextInt();

            // Ajoutez l'entier à la somme
            somme += entier;
            
            // Incrémente le nombre d'entiers lus, sauf si 0 est entré
            if (entier != 0) {
                nombreEntiers++;
            }

        } while (entier != 0);

        // Calculez la moyenne en divisant la somme par le nombre d'entiers lus
        double moyenne = (double) somme / nombreEntiers;

        // Affichez le nombre d'entiers lus, la somme et la moyenne
        System.out.println("Nombre d'entiers lus : " + nombreEntiers);
        System.out.println("Somme des entiers lus : " + somme);
        System.out.println("Moyenne des entiers lus : " + moyenne);

        // Fermez le scanner pour libérer les ressources
        scanner.close();
    }

	
	

}
