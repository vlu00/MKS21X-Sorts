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
        int index = i+1;
        for (int n = i+1; n != 0 && data[n-1] > x; n--) {
          data [n] = data[n-1];
          index --;
        }
        data[index] = x;
        /*for (int n = i+1; n > 0; n--) {
          if (n -1 == 0 && data[n-1] > x) { //if there is only one element left in "sorted" section and it is greater than x
            data[n] = data[n-1]; //element in index 1 shifts to right
            data[n-1] = x; //x becomes element at index 1
            n=0; //exits loop
           }
          else if (data[n-1] < x) { //x is greater than next element in "sorted" side
            data[n] = x; //place x in index after smaller number
            n=0; //exits loop
          }
          else {
            data[n] = data[n-1]; //element shifts to right
          }
        }*/
      }
    }
  }
}
