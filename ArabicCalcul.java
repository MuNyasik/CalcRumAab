public final class ArabicCalcul {
    public static void calc(String exspre) {
        String[] parts = exspre.split(" ");
        if (parts.length == 3) {
            try {
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[2]);
                String oper = parts[1];

                if (a <= 10 && b <= 10) {

                    int sum;
                    switch (oper) {
                        case "+":
                            sum = a + b;
                            System.out.println(a + " + " + b + " = " + sum);
                            break;
                        case "-":
                            sum = a - b;
                            System.out.println(a + " - " + b + " = " + sum);
                            break;
                        case "*":
                            sum = a * b;
                            System.out.println(a + " * " + b + " = " + sum);
                            break;
                        case "/":
                            if (b != 0) {
                                sum = a / b;
                                System.out.println(a + " / " + b + " = " + sum);
                            } else {
                                break;
                            }
                        default:
                            break;
                    }

                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа");
            }

        }
    }
}
