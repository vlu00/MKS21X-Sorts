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
          boolean swapped = false;
          if (data[n] > data[n+1]) { //if first element is greater than second
            int x = data[n];
            data[n] = data[n+1]; //swap them
            data[n+1] = x;
            swapped = true;
          }
          if (!swapped) {
            i = data.length;
          }
        }
      }
    }
  }

  public static void insertionSort(int [] data) {
    if (data.length > 1) { //if length is 0 or 1, data remains the same
      for (int i = 0; i < data.length-1; i++) { //for the length of data
        int x = data[i+1]; //x is the number that needs to be sorted. Starts with one sorted already
        int index = i+1; //keeps index of place element x should be placed in
        for (int n = i+1; n != 0 && data[n-1] > x; n--) { //as long as sorted elemenets are greater than desired element
          data [n] = data[n-1]; //shift elements to the right
          index --;
        }
        data[index] = x; //put desired element in correct index
      }
    }
  }
}
