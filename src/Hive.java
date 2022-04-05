import java.util.Scanner;

public class Hive{
    private int BeesNumber;
    private double[] HiveLocation = new double[2];
    private int AvgHoneyCount = 0;
    private String ApiaryName;
    private boolean MotherPresence;

    void set_the_number_of_bees() {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the number of bees: ");
        int temp;
        for(temp = c.nextInt(); temp < 0; temp = c.nextInt()) {
            System.out.print("Enter a number not less than 0!\n");
            System.out.print("Enter again the number of bees: ");
        }

        this.BeesNumber = temp;
    }

    void change_bees_number() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to increase (1) the number of bees or decrease (2)?");
        //int menux = false;
        int option = scanner.nextInt();
        int number;
        if (option == 1) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number >= 0 && number <= 100) {
                this.BeesNumber += number;
            } else {
                System.out.print("Enter a number in the range [0;100]");
            }
        } else if (option == 2) {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();
            if (number <= 100 && number >= 0 && this.BeesNumber - number >= 0) {
                this.BeesNumber -= number;
            } else if (number < 0 | number >= 100) {
                System.out.print("Enter a number in the range[0;100]\n");
            } else if (this.BeesNumber - number <= 0) {
                System.out.print("The number of bees cannot be less than 0!\n");
            }
        }

    }

    void show_the_number_of_bees() {
        System.out.printf("The number of bees: %d \n", this.BeesNumber);
    }

    void set_the_location_of_the_hive() {
        Scanner c1 = new Scanner(System.in);
        System.out.print("Enter the location of the hive (in geographic coordinates): ");
        double temp1 = c1.nextDouble();
        double temp2 = c1.nextDouble();
        if (temp1 > 0.0D && temp2 > 0.0D) {
            this.HiveLocation[0] = temp1;
            this.HiveLocation[1] = temp2;
        }

    }

    void show_hive_location() {
        System.out.printf("\nLocation of the hive (in geographic coordinates): %f\t%f\n", this.HiveLocation[0], this.HiveLocation[1]);
    }

    void set_avg_amount_of_honey_produced() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the average annual rate of the amount of honey produced: ");
        int temp = scanner.nextInt();
        if (temp > this.AvgHoneyCount) {
            this.AvgHoneyCount = temp;
        }

    }

    public int get_avg() {
        return this.AvgHoneyCount;
    }

    void set_apiary_name() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {
            System.out.print("Enter the name of the apiary: ");
            this.ApiaryName = scanner.nextLine();
            String[] check = this.ApiaryName.split("");
            if (Character.isUpperCase(check[0].trim().charAt(0))) {
                System.out.print(this.ApiaryName);
                System.out.print("\n");
                flag = true;
            } else {
                System.out.print("The name should start with a capital letter!\n");
            }
        }

    }

    public String get_name() {
        return this.ApiaryName;
    }

    void set_mother_presence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mother present? (Yes or No)");
        String temp = scanner.nextLine();
        if (temp.equals("Yes")) {
            this.MotherPresence = true;
            System.out.print("\n");
        } else if (temp.equals("No")) {
            this.MotherPresence = false;
            System.out.print("\n");
        } else {
            System.out.print("Please enter Yes or No!");
        }

    }

    void result() {
        if (this.MotherPresence) {
            System.out.print("Everything will be fine:)");
        } else {
            System.out.print("All the bees died:(");
        }

    }

    void get_bees_number() {
        this.BeesNumber = this.BeesNumber;
    }



}

