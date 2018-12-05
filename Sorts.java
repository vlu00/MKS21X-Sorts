import java.util.Arrays;

public class Sorts{
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
}
