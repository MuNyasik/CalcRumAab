import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class RomanCalcul {

    private static final Map<String, Integer> romanToArabicMap = new HashMap<>() {{
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);
    }};
    private static final NavigableMap<Integer, String> initMap = new TreeMap<>();

    static {

        initMap.put(1000, "M");
        initMap.put(900, "CM");
        initMap.put(500, "D");
        initMap.put(400, "CD");
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40, "XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");

    }


    public static void calc(String exspre) {
        String []parts = exspre.split(" ");
        if (!romanToArabicMap.containsKey(parts[0]) || !romanToArabicMap.containsKey(parts[2])){
            System.out.println("Некорретный ввод");
        }
        int a = romanToArabicMap.get(parts[0]);
        int b = romanToArabicMap.get(parts[2]);
        String oper = parts[1];

        int sum;
        switch (oper) {
            case "+":
                sum = a + b;
                System.out.println(parts[0] + " + " + parts[2] + " = " + toRoman(sum));
                break;
            case "-":
                sum = a - b;
                System.out.println(parts[0] + " - " + parts[2] + " = " + toRoman(sum));
                break;
            case "*":
                sum = a * b;
                System.out.println(parts[0] + " * " + parts[2] + " = " + toRoman(sum));
                break;
            case "/":
                if (b != 0) {
                    sum = a / b;
                    System.out.println(parts[0] + " / " + parts[2] + " = " + toRoman(sum));
                } else {
                    break;
                }
            default:
                break;
        }
    }
    private static String toRoman (int x){
        StringBuilder sb = new StringBuilder();
        while (x > 0){
            int highest = initMap.floorKey(x);
            sb.append(initMap.get(highest));
            x -= highest;
        }
        return sb.toString();

    }
}
