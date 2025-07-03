import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        // Original list
        List<Integer> inputList = Arrays.asList(1, 1, 2, 2, 3, 4);
        
        // Final result list
        List<Integer> finalList = new ArrayList<>();

        // Check if list is not empty
        if (!inputList.isEmpty()) {
            // Add the first element to final list
            finalList.add(inputList.get(0));

            // Start comparing from the second element
            for (int i = 1; i < inputList.size(); i++) {
                // If current element is not equal to previous one, add it to final list
                if (!inputList.get(i).equals(inputList.get(i - 1))) {
                    finalList.add(inputList.get(i));
                }
            }
        }

        // Print the final list
        System.out.println("Final list: " + finalList);
    }
}
