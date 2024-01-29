public class Main {

    //EXERCICE 1 : FACILE : SOMME DES ÉLÉMENTS D'UN TABLEAU
    public static void sommeTableau(String[] args) {
        int [] monTableau = {12, 87, 65,18,25, 642};
        int somme = 0;
        for (int i = 0; i<monTableau.length; i++){
        somme += monTableau[i];

    }
        System.out.println("La somme des éléments est égale à :" + somme);
    }

    //EXERCICE 2 : INTERMÉDIAIRE : TROUVER L'ÉLÉMENT MAXIMUM

    public static void findMax(String[] args) {

        int[] monTableau2 = {54, 877, 35, 941, 51, 654, 213};
        int max = monTableau2[0];

        for (int i = 0; i < monTableau2.length; i++) {

            for (int j = i + 1; j < monTableau2.length; j++) {
                if (monTableau2[j] > max) {
                    max = monTableau2[j];
                }
                ;
            }

        }
        System.out.println("L'élément maximum est :" + max);
    }



    // EXERCICE 3 : INTERMÉDIAIRE : INVERSION DE CHAÎNE

    public static String reverseString(String[] args) {
        String str = "This string is not reversed yet.";
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        System.out.println(reversedString);
        return reversedString;
    }

    // EXERCICE 4 : DIFFICILE : VÉRIFICATION DE PALINDROME

    public static void checkPalindrome(String[] args) {



    }

    // EXERCICE 5 : DIFFICILE : DEUX SOMME
    public static void twoSum(String[] args) {



    }

    }
