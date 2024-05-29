public class TempClass {

    int[] getallen = {1, 2, 3, 4, 5};

    public void tempClass() {

    }

    public void somGetallen()
    {
        int som = 0;
        for (int i = 0; i < getallen.length; i++) {
            som += getallen[i];
        }

        System.out.println("Som: " + som);
    }

    public void vindGrootsteWaarde()
    {
        int grootsteWaarde = getallen[0];
        int j = 1;
        while ( j < getallen.length) {
            if (getallen[j] > grootsteWaarde) {
                grootsteWaarde = getallen[j];
            }
            j++;
        }

        System.out.println("Grootste waarde: " + grootsteWaarde);
    }

    public void evenGetallen() {
        int evenCount = 0;
        int k = 0;
        do {
            if (getallen[k] % 2 == 0) {
                evenCount++;
            }
            k++;
        } while (k < getallen.length);

        System.out.println("Aantal even getallen: " + evenCount);
    }

    public void printAllForEn() {
        for (int getal : getallen) {
            System.out.println(getal);
        }
    }
}
