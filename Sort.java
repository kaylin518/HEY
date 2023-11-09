public class Sort {
  public static void main(String[] args) { }

  public static int indexSmallest(int[] arr, int start) {
      for (int i = start + 1; i < arr.length; i++) {
          if (arr[i] < arr[start]) {
              start = i;
          }
      }
        
      return start;
  }
    
  public static void selectionSort(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
          int j = indexSmallest(arr, i);
          swap(arr, i, j);
      }
  }
