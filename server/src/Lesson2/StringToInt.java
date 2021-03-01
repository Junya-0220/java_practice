public class StringToInt {
  public static void main(String[] args) {
    //変数ageには文字列が代入されているが、parseIntを使うことで、int型に変換して変数nに代入してる。
    String age = "31";
    int n = Integer.parseInt(age);
    System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
  }
}
