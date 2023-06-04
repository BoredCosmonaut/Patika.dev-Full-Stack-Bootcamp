import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Initialize array  
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] frekans = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frekans[j] = visited;
                }
            }
            if (frekans[i] != visited)
                frekans[i] = count;
        }
        
        System.out.println("---------------------------------------");
        System.out.println(" Element | frekans");
        System.out.println("---------------------------------------");
        for (int i = 0; i < frekans.length; i++) {
            if (frekans[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frekans[i]);
        }
        System.out.println("----------------------------------------");
    }
}