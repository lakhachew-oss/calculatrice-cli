package dz.univ.calculatrice;

import java.util.Scanner;

/** Interface en ligne de commande de la calculatrice. */
public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n=== CALCULATRICE ===");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("0. Quitter");
                System.out.print("Votre choix : ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Choix invalide.");
                    scanner.nextLine();
                    continue;
                }
                int choice = scanner.nextInt();
                if (choice == 0) {
                    running = false;
                } else if (choice == 1 || choice == 2) {
                    System.out.print("Premier nombre : ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Nombre invalide.");
                        scanner.nextLine();
                        continue;
                    }
                    double first = scanner.nextDouble();
                    System.out.print("Deuxième nombre : ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Nombre invalide.");
                        scanner.nextLine();
                        continue;
                    }
                    double second = scanner.nextDouble();
                    Operation operation = choice == 1
                            ? new AddOperation() : new SubtractOperation();
                    System.out.println("Résultat : " + operation.execute(first, second));
                } else {
                    System.out.println("Choix invalide.");
                }
            }
        }
    }
}