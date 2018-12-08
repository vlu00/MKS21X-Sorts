import java.util.Arrays;

public class Sorts{
  public static void selectionSort(int [] ary) {
    if (ary.length > 1) { //if length is 0 or 1, the ary remains the same
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
  }

  public static void bubbleSort(int[] data) {
    if (data.length > 1) {//if length is 0 or 1, data remains same
      for (int i = 0; i < data.length-1; i++) { //for the length of data
        for (int n = 0; n < data.length-i-1; n++) { //makes one pass through data checking elements next to one another
          if (data[n] > data[n+1]) { //if first element is greater than second
            int x = data[n];
            data[n] = data[n+1]; //swap them
            data[n+1] = x;
          }
        }
      }
    }
  }
}
