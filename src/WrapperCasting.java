import java.util.Scanner;

public class WrapperCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int num = scanner.nextInt();

        Integer num2 = Integer.valueOf(num);
        System.out.println("Valor convertido para wrapper: " + num2);
    }
}
