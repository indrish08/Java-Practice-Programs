package Extra_Mail;

import java.util.*;

public class prgm1 {
  private static Scanner s;  
  public static void main(String[] args) { 
	s = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int n = s.nextInt();
    int j = 0;int temp = 0;
    int[] arr = new int[n];
    int[] sdarr = new int[n * n];
    System.out.println("\nEnter the Array Elements : ");
    for (int k = 0; k < n; k++)
    {
      arr[k] = s.nextInt();
    }
    for (int i = 0; i < n; i++) {
      while (arr[i] != 0) {
        temp = arr[i] % 10;
        sdarr[j] = temp;
        arr[i] /= 10;
        j++;
      }
    }
    System.out.println("\n\n" + Arrays.toString(sdarr));
    int min = sdarr[0];int max = sdarr[0];
    for (int i = 0; i < j; i++) {
      if (sdarr[i] > max) {
        max = sdarr[i];
      }
      if (sdarr[i] < min) {
        min = sdarr[i];
      }
    }
    System.out.println("\n\nGreatest number : " + max + "\nSmallest number : " + min);
  }
}