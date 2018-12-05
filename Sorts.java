import java.util.Arrays;

public class Sorts{
  //Find the index of the smallest value
  public static int indexOf(int x, int [] ary) {
    int index = 0;
    for (int i = 0; ary[i] != x; i++) {
      index++;
    }
    return index;
  }

  public static void selectionsort(int [] ary) {
    for (int i = 0; i < ary.length -1; i++) {
      int small = ary[i];
      for (int n = i+1; n < ary.length; n++) { //Ignoring already sorted values, find next smallest
        if (ary[n] < small) {
          small = ary[n];
        }
      }
      int index = indexOf(small, ary);
      for (int k = index; k > i; k--) { //Moving from the index of the smallest value, move elements to the right until
        ary[k] = ary[k-1];//you reach the already sorted elements
      }
      ary[i] = small; 
    }
  }

}
