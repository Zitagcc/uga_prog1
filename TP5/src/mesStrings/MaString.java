package mesStrings;

public class MaString {


	private char[] lesCaracteres;

	public MaString() {
		lesCaracteres = new char[0];
	}
	public void setString(String str) {
        if (str.length() > lesCaracteres.length) {
            System.out.println("La chaîne est trop longue pour être stockée.");
        } else {
            for (int i = 0; i < str.length(); i++) {
                lesCaracteres[i] = str.charAt(i);
            }
        }
    }
	
	public MaString(char[] tab, int d, int f) {
        if (d < 0 || f > tab.length || d > f) {
            throw new IllegalArgumentException("Indices invalides");
        }

        lesCaracteres = new char[f - d];
        for (int i = d; i < f; i++) {
            lesCaracteres[i - d] = tab[i];
        }
    }
	
	public MaString(MaString ms) {
		char[] lesCaracteres = new char[ms.length()];
		for (int i=0; i<ms.length();i++) {
			//System.out.println(ms.lesCaracteres[i]);
			lesCaracteres[i]= ms.lesCaracteres[i];
		}
    }
	
	public String toString() {
        return new String(lesCaracteres);
    }
	
	public int length() {
        return lesCaracteres.length;
    }

    public boolean isEmpty() {
        return lesCaracteres.length == 0;
    }

    public char charAt(int i) {
        if (i < 0 || i >= lesCaracteres.length) {
            throw new IndexOutOfBoundsException("Indice invalide");
        }
        return lesCaracteres[i];
    }

    // Obtenir une sous-chaîne 
    public MaString substring(int d, int f) {
        if (d < 0 || f > lesCaracteres.length || d > f) {
            throw new IllegalArgumentException("Indices invalides");
        }
        char[] subChars = new char[f - d];
        for (int i = d; i < f; i++) {
            subChars[i - d] = lesCaracteres[i];
        }
        return new MaString(subChars, 0, subChars.length);
    }

    // Obtenir une sous-chaîne 
    public MaString substring(int d) {
        if (d < 0 || d >= lesCaracteres.length) {
            throw new IllegalArgumentException("Indice invalide");
        }
        char[] subChars = new char[lesCaracteres.length - d];
        for (int i = d; i < lesCaracteres.length; i++) {
            subChars[i - d] = lesCaracteres[i];
        }
        return new MaString(subChars, 0, subChars.length);
    }

    // Comparer deux MaString et retourner une valeur basée sur l'ordre lexicographique
    public int compareTo(MaString ms) {
        int len1 = lesCaracteres.length;
        int len2 = ms.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (lesCaracteres[i] < ms.charAt(i)) {
                return -1;
            } else if (lesCaracteres[i] > ms.charAt(i)) {
                return 1;
            }
        }

        if (len1 < len2) {
            return -1;
        } else if (len1 > len2) {
            return 1;
        }

        return 0;
    }

    // Méthode pour vérifier si deux MaString sont équivalentes
    public boolean equals(MaString ms) {
        if (ms == null || lesCaracteres.length != ms.length()) {
            return false;
        }
        for (int i = 0; i < lesCaracteres.length; i++) {
            if (lesCaracteres[i] != ms.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour vérifier si la chaîne commence par le préfixe spécifié
    public boolean startsWith(MaString prefixe) {
        if (prefixe == null || prefixe.length() > lesCaracteres.length) {
            return false;
        }
        for (int i = 0; i < prefixe.length(); i++) {
            if (lesCaracteres[i] != prefixe.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
 // Méthode pour trouver l'indice de la première occurrence de c à partir de l'indice spécifié
    public int indexOf(char c, int i) {
        if (i < 0 || i >= lesCaracteres.length) {
            return -1;
        }
        for (int j = i; j < lesCaracteres.length; j++) {
            if (lesCaracteres[j] == c) {
                return j;
            }
        }
        return -1;
    }

    // Méthode pour trouver l'indice de la première occurrence de c dans la chaîne
    public int indexOf(char c) {
        return indexOf(c, 0);
    }

    // Méthode pour concaténer deux MaString
    public MaString concat(MaString ms) {
        char[] concatChars = new char[lesCaracteres.length + ms.length()];
        for (int i = 0; i < lesCaracteres.length; i++) {
            concatChars[i] = lesCaracteres[i];
        }
        for (int i = 0; i < ms.length(); i++) {
            concatChars[lesCaracteres.length + i] = ms.charAt(i);
        }
        return new MaString(concatChars, 0, concatChars.length);
    }
    
 // Méthode de classe pour convertir un boolean en MaString
    public static MaString valueOf(boolean b) {
        return b ? new MaString("true".toCharArray(), 0, 4) : new MaString("false".toCharArray(), 0, 5);
    }

    // Méthode de classe pour convertir un char en MaString
    public static MaString valueOf(char c) {
        return new MaString(new char[]{c}, 0, 1);
    }

    // Méthode de classe pour convertir un int en MaString
    public static MaString valueOf(int i) {
        return new MaString(Integer.toString(i).toCharArray(), 0, Integer.toString(i).length());
    }
	
	public void afficher() {
		System.out.println(lesCaracteres);
	}

	
	
	public static void main(String[] args) {
		char [] tab = {'h','e','l','l','o'};
		MaString c = new MaString(tab,0,5);
		MaString val = new MaString(c);
		
		c.afficher();
		
		MaString boolStr = MaString.valueOf(true);
		MaString charStr = MaString.valueOf('A');
		MaString intStr = MaString.valueOf(42);

		System.out.println("Boolean: " + boolStr.toString());
		System.out.println("Char: " + charStr.toString());
		System.out.println("Int: " + intStr.toString());
		
	}
}
