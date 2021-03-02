public class Random {
  public static void main(String[] args) {
    //new演算子を使って乱数を発生させる。nextIntの引数は乱数の上限値が入っている。
    int r = new java.util.Random().nextInt(90);
    System.out.println("あなたはたぶん、" + r + "歳ですね？");
  }
}


