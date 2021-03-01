public class Keyboad {
  public static void main(String[] args) {
    System.out.println("あなたの名前を入力してください");
    //キーボードから1行の文字列の入力を受け付ける
    // String s = new java.util.Scanner(System.in).nextLine();
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    //キーボードから1つの整数の入力を受け付ける
    // int input = new java.util.Scanner(System.in)nextInt();
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  }
}





