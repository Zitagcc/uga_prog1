package tp4;

import java.util.Arrays;

public class TP4 {
	
	public static void main(String[] args) {
		
		int[] tab = {2,3,1,2,3};//nouveauTab(5,2,10);
		
		changerValeurs(tab,11);
		
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
			
		}
		
		
    }

    public static int[] nouveauTab(int taille, int vMin, int vMax) {
        int[] tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            tab[i] = (int) (Math.random() * (vMax - vMin + 1)) + vMin;
        }
        return tab;
    }

    public static String tabEnChaine(int[] tab) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tab.length; i++) {
            sb.append(tab[i]);
            if (i < tab.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void changerValeurs(int[] tab, int val) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = val;
        }
    }

    public void incrValeurs(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    public int sommeValeurs(int[] tab) {
        int sum = 0;
        for (int value : tab) {
            sum += value;
        }
        return sum;
    }

    public double ratioPairs(int[] tab) {
        int countPairs = 0;
        for (int value : tab) {
            if (value % 2 == 0) {
                countPairs++;
            }
        }
        return ((double) countPairs / tab.length) * 100.0;
    }
}
