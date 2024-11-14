import java.util.Scanner;

public class status {
    public static String getStatuses(String s) {
        // Split the input string by the delimiter ";"
        String[] statuses = s.split(";");
        
        // The final status is the last element in the array
        return statuses[statuses.length - 1];
    }

    public static void main(String[] args) {
        // String input = "in-transit;delivered;on-hold;returned";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the package statuses separated by ';':");
        String input = sc.nextLine();
        String finalStatus = getStatuses(input);
        System.out.println("The final status is: " + finalStatus);
        sc.close();
    }
}
