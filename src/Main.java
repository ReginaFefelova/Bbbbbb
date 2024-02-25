import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int schet, popolnenye;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите состояние баланса в рублях: ");
        schet = scanner.nextInt();
        System.out.println("Введите сумму пополнения баланса: ");
        popolnenye = scanner.nextInt();

        if (popolnenye > 1000) {
            schet = schet + popolnenye + popolnenye / 100;
        } else {
            schet = schet + popolnenye;
        }

        System.out.println("Итоговая сумма на Вашем счету: " + schet);

    }
}