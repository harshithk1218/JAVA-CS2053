package Lab007;

public class wrapper_demo {
	public static void main(String[] args) {
        // 1. Wrapper Class Example
        int num = 10;
        Integer obj1 = Integer.valueOf(num); // manual boxing
        System.out.println("Wrapper Class (Manual Boxing): " + obj1);

        // 2. Autoboxing: primitive → object
        Integer obj2 = num;  // automatic conversion
        System.out.println("Autoboxing Example: " + obj2);

        // 3. Auto-unboxing: object → primitive
        int newNum = obj2;   // automatic conversion back
        System.out.println("Auto-unboxing Example: " + newNum);

        // 4. More examples
        Double d = 12.34;    // autoboxing
        double val = d;      // auto-unboxing
        System.out.println("Double Wrapper Autoboxing: " + d);
        System.out.println("Double Wrapper Auto-unboxing: " + val);
    }

}
 