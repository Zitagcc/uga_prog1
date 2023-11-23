package mesStrings;

public class MaStringBuffer {
    private char[] lesCaracteres;
    private int n; // nombre de caractères effectifs

    // Constructeur pour créer un MaStringBuffer vide avec une capacité spécifiée
    public MaStringBuffer(int l) {
        lesCaracteres = new char[l];
        n = 0;
    }

    // Constructeur pour créer un MaStringBuffer vide avec une capacité par défaut de 16 caractères
    public MaStringBuffer() {
        lesCaracteres = new char[16];
    }

    public MaStringBuffer(MaString ms) {
        lesCaracteres = new char[ms.length() + 16];
        for (int i = 0; i < ms.length(); i++) {
            lesCaracteres[i] = ms.charAt(i);
        }
        n = ms.length();
    }

    public String toString() {
        return new String(lesCaracteres, 0, n);
    }

    // Méthode pour retourner le nombre de caractères effectifs
    public int length() {
        return n;
    }

    public int capacity() {
        return lesCaracteres.length;
    }

    public void ensureCapacity(int capMin) {
        if (capMin > lesCaracteres.length) {
            char[] newChars = new char[Math.max(capMin, lesCaracteres.length * 2)];
            for (int i = 0; i < n; i++) {
                newChars[i] = lesCaracteres[i];
            }
            lesCaracteres = newChars;
        }
    }

    public MaStringBuffer append(MaString ms) {
        ensureCapacity(n + ms.length());
        for (int i = 0; i < ms.length(); i++) {
            lesCaracteres[n++] = ms.charAt(i);
        }
        return this;
    }

    // Méthode pour remplacer les caractères d'indices d à f par les caractères de MaString ms
    public MaStringBuffer replace(int d, int f, MaString ms) {
        if (d < 0 || d > f) {
            throw new IllegalArgumentException("Indices invalides");
        }

        int replacementLength = ms.length();
        int shift = replacementLength - (f - d);

        ensureCapacity(n + shift); // adapter la taille du lescaractère selon la longeur de (n+shift)

        // Décaler les caractères après l'indice f
        for (int i = n - 1; i >= f; i--) {
        	System.out.println(lesCaracteres[i]);
            lesCaracteres[i + shift] = lesCaracteres[i];
        }

        // Insérer les caractères de MaString ms
        for (int i = 0; i < replacementLength; i++) {
            lesCaracteres[d + i] = ms.charAt(i);
        }

        n += shift; // update de la taille des elements effectifs

        return this;
    }

    // Méthode pour supprimer les caractères d'indices d à f
    public MaStringBuffer delete(int d, int f) {
        if (d < 0 || f > n || d > f) {
            throw new IllegalArgumentException("Indices invalides");
        }

        int shift = f - d;

        // Décaler les caractères après l'indice f
        for (int i = f; i < n; i++) {
            lesCaracteres[i - shift] = lesCaracteres[i];
        }

        n -= shift;

        return this;
    }

    // Méthode pour insérer les caractères de MaString ms à l'indice i
    public MaStringBuffer insert(int i, MaString ms) {
        if (i < 0 || i > n) {
            throw new IllegalArgumentException("Indice invalide");
        }

        ensureCapacity(n + ms.length());

        // Décaler les caractères après l'indice i
        for (int j = n - 1; j >= i; j--) {
            lesCaracteres[j + ms.length()] = lesCaracteres[j];
        }

        // Insérer les caractères de MaString ms
        for (int j = 0; j < ms.length(); j++) {
            lesCaracteres[i + j] = ms.charAt(j);
        }

        n += ms.length();

        return this;
    }
    
	public static void main(String[] args) {

		char [] tab = {'M','I','A','M','I'};
		MaString ms = new MaString(tab,0,tab.length);
		
		char [] tab2 = {'B','o','n','j','o','u','r'};
		MaString ms2 = new MaString(tab2,0,tab2.length);
		
		ms.afficher();
		
		MaStringBuffer mB = new MaStringBuffer(ms2);
		int d=1, f=2;
		
		System.out.println(mB.replace(d, f, ms));

	}
}
