import java.util.Arrays;

public class Sorts{
  //make sure you have a check for when ary length is zero
  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length-1; i++) {
      int old = ary[i];
      int small = ary[i];
      int index = i;
      int oldindex = i;
      for (int n = i+1; n < ary.length; n++) { //Ignoring already sorted values, find next smallest
        index++; //index of element checked increases
        if (ary[n] < small) {
          small = ary[n];
          oldindex = index; //old index is the index of the smallest before it is move to the front
        }
      }
      ary[oldindex] = old;
      ary[i] = small;
    }
  }

  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length-1; i++) {
      for (int n = 0; n < data.length-i-1; n++) {
        if (data[n] > data[n+1]) {
          int x = data[n];
          data[n] = data[n+1];
          data[n+1] = x;
          System.out.println(Arrays.toString(data));
        }
      }
    }
  }

  public static void main(String[] args) {
    int [] A = new int [] {5, 1, 12, -5, 16};
    bubbleSort(A);
    System.out.println(Arrays.toString(A));
  }
}
