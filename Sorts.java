import java.util.Arrays;

public class Sorts{
  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length-1; i++) {
      int old = ary[i];
      int small = ary[i];
      //int index = i;
      for (int n = i+1; n < ary.length; n++) { //Ignoring already sorted values, find next smallest
        if (ary[n] < small) {
          small = ary[n];
        }
        
      }
      ary[indexOf(small,ary)] = old;
      ary[i] = small;

    }
  }

  //Find the index of the smallest value
  public static int indexOf(int x, int [] ary) {
    int index = 0;
    for (int i = 0; ary[i] != x; i++) {
      index++;
    }
    return index;
  }

public static void main(String[]args) {
  int [] A = new int [] {5, 3, 6, 2, 7, 1 ,4};
  selectionSort(A);
  System.out.println(Arrays.toString(A));
}
}
