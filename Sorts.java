import java.util.Arrays;

public class Sorts{
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
      //int index = i;
      for (int n = i+1; n < ary.length; n++) {
        if (ary[n] < small) {
          small = ary[n];
          //index++;
        }
      }
      int index = indexOf(small, ary);
      for (int k = index; k > i; k--) {
        ary[k] = ary[k-1];
      }
      ary[i] = small;
    }
  }

  public static void main (String [] args) {
    int [] A = new int [] {5, 3, 7, 1, 6, 2, 4};
    selectionsort(A);
    System.out.println(Arrays.toString(A));
  }

}
