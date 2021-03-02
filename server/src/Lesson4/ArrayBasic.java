public class ArrayBasic {
  public static void main(String[] args) {
    int[] arrayA = {1, 2, 3};
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    for (int value : arrayA) {
      System.out.println("A" + value);
    }
    for (int value : arrayB) {
      System.out.println("B" + value);
    }
  }
}
