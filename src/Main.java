public class Main {
    public static void main(String[] args) {
        //persoonArray();

//        TempClass temp = new TempClass();
//        temp.vindGrootsteWaarde();
    }

    private static void persoonArray() {
        Persoon[] personenArray = {
                new Persoon("Alice", 25),
                new Persoon("Bob", 30),
                new Persoon("Charlie", 35),
        };

//        for (Persoon persoon : personen) {
//            //System.out.println(persoon.getName(), persoon.getAge());
//        }

        //for-loop
        for (int i = 0; i < personenArray.length; i++) {
            System.out.println(personenArray[i]);
        }

        //while-loop
        int i = 0;
        while (i < personenArray.length) {
            System.out.println(personenArray[i]);
            i++;
        }
    }
}
