public class Main {
    public static void main(String[]args) {
        String stringVar = "I study Basic Java!";
        System.out.println(stringVar.charAt(18));

        System.out.println(stringVar.contains("Java"));

        System.out.println(stringVar.replace('a', 'o'));

        System.out.println(stringVar.toUpperCase());
        System.out.println(stringVar.toLowerCase());

        System.out.println(stringVar.substring(14));

        byte byteVar = 10;
        int intVar = 3;
        double doubleVar = 15.0;
        float floatVar = 717.1F;

        byte byteVar2 = (byte) intVar;
        int intVar2 = byteVar + (int) doubleVar;
        double doubleVar2 = floatVar;
        float floatVar2 = (float) doubleVar2 + intVar;
        System.out.println(byteVar2 + "\n" + intVar2 + "\n" + doubleVar2 + "\n" + floatVar2);







    }
}


//Выведите результаты преобразований на экран с помощь метода System.out.println().