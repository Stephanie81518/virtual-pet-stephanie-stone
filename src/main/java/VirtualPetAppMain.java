import java.util.Scanner;

public class VirtualPetAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a pet name to create a pet: ");
        String name = scanner.nextLine();
        VirtualPet virtualPet = new VirtualPet(name, 20, 20, 0, 20, 20);

        System.out.println("Baby " + virtualPet.getName() + " has been created!");
        System.out.println(virtualPet.getName() + "'s age will increase as you play.");
        System.out.println(virtualPet.getName() + "'s waste level will also increase on occasion.");
        System.out.println("Don't let " + virtualPet.getName() + "'s other levels drop to 0. Good luck!");

        do {
            System.out.println("\n"+ virtualPet.getName() + "'s...");
            System.out.println("Age = " + virtualPet.getTickTimer());
            System.out.println("Full Tummy Level = " + virtualPet.getHunger());
            System.out.println("Hydration Level = " + virtualPet.getThirst());
            System.out.println("Waste Level = " + virtualPet.getWaste());
            System.out.println("Entertainment Level = " + virtualPet.getBoredom());
            System.out.println("Health Level = " + virtualPet.getSickness());

            System.out.println(" \nWhat would you like to do?");
            System.out.println("  Your options are: \n   1. Feed \n   2. Provide water \n   3. Take a bathroom break \n   4. Play \n   5. Medicate");
            System.out.println("Enter the number of your choice here:");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    virtualPet.feed();
                    break;
                case 2:
                    virtualPet.water();
                    break;
                case 3:
                    virtualPet.bathroom();
                    break;
                case 4:
                    virtualPet.play();
                    break;
                case 5:
                    virtualPet.illness();
                    break;
                default:
                    System.out.println("Bad choice! Due to your carelessness, your poor pet is not happy.");
            }
        } while (virtualPet.tick());

    }
}
