import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a и b:");
        int a = in.nextInt();
        int b = in.nextInt();
        int result = 0;
        System.out.println("Введите способ умножения:\n 1)Сложение\n 2)Математическое свойство умножения\n 3)Рекурсия");
        int method = in.nextInt();
        switch (method){
            case 1:{
                for (int i = 0; i < Math.abs(b); i++) {
                    result += a;
                }
                if(b < 0) result = -result;
                break;
            }
            case 2:{
                result = (int) ((Math.pow(a + b, 2) - Math.pow(a,2) - Math.pow(b,2)) / 2);
            }
            case 3:{
                result = multiplyRecursion(a,b);
                break;
            }
            default: System.out.println("Неправильный номер способа");
        }
        System.out.println("Ответ: " + result);
    }
    public static int multiplyRecursion(int a, int b){
        if (a == 0)
            return 0;
        if (b == 0)
            return  0;
        if (b > 0)
            return (a + multiplyRecursion(a, b - 1));
        return -multiplyRecursion(a, -b);
    }
}