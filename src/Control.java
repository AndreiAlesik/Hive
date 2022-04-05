import java.util.Scanner;

public class Control extends Hive {
    void setoption() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.print("1.Location of the hive\n2.Set the average annual rate of the amount of honey produced\n3.Set the name of the apiary\n4. Make the mother present in the hive\n5.Change the number of bees\n6. Show the location of the hive\n7.Show the average annual rate of the amount of honey produced\n8. Show the number of bees\n9.Set the annual amount of honey produced by the hive:\n10.Show the name of the apiary \n 0.Exit\n");
            System.out.print("Choose options: ");
            boolean menuE = false;

            while (!menuE) {
                try {
                    option = scanner.nextInt();
                    if (0 <= option && option <= 10) {
                        menuE = true;
                    } else {
                        System.out.print("Enter the correct option!\n");
                    }
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
            switch (option){
                case 1:
                    this.set_the_location_of_the_hive();
                    break;
                case 2:
                    this.set_avg_amount_of_honey_produced();
                    break;
                case 3:
                    this.set_apiary_name();
                    break;
                case 4:{
                    this.set_mother_presence();
                    scanner.nextLine();
                    break;
                }
                case 5:{
                    this.change_bees_number();
                    scanner.nextLine();
                    break;
                }
                case 6:
                    super.show_hive_location();
                    break;
                case 7:
                    System.out.println(this.get_avg() + "\n");
                    break;
                case 8:
                    this.show_the_number_of_bees();
                    break;
                case 9:
                    this.set_avg_amount_of_honey_produced();
                    break;
                case 10:
                    System.out.println(this.get_name() + "\n");
                    break;
                case 0: {
                    this.result();
                    System.out.print("\nEnd of program.");
                    break;
                }

            }

            }
        }
}


