import java.util.*;

public class Test1 {
    static ArrayList<String> arrayA = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Proton"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original car brands: " + arrayA);

        System.out.print("Enter a new car brand to add: ");
        String userBrand = scanner.nextLine();

        addCarBrandSmart(userBrand);

        System.out.println("Updated car brands: " + arrayA);

        ArrayList<String> arrayB = new ArrayList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        System.out.println("Animal list (arrayB): " + arrayB);

        arrayA.addAll(arrayB);

        System.out.println("Combined list (cars + animals): " + arrayA);


        scanner.close();
    }

    public static void addCarBrandSmart(String newBrand) {
        if (newBrand.equalsIgnoreCase("Mazda")) {
            arrayA.add(0, newBrand);
        } else {
            arrayA.add(newBrand);
        }
    }

}
