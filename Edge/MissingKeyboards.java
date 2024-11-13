import java.util.*;

public class MissingKeyboards {
    public static int missingKeyboards(int[] arr) {
        Set<Integer> serialNumbers = new HashSet<>();
        for (int num : arr) {
            serialNumbers.add(num);
        }
        
        int minSerial = Collections.min(serialNumbers);
        int maxSerial = Collections.max(serialNumbers);
        
        // Calculate the total number of keyboards in the expected series
        int expectedCount = maxSerial - minSerial + 1;
        
        // Calculate the number of missing keyboards
        int missingCount = expectedCount - serialNumbers.size();
        
        return missingCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of keyboards
        System.out.print("Enter the number of keyboards: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Read the serial numbers of the keyboards
        System.out.println("Enter the serial numbers of the keyboards:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate and print the number of missing keyboards
        int missingCount = missingKeyboards(arr);
        System.out.println("Number of missing keyboards: " + missingCount);
        
        scanner.close();
    }
}
