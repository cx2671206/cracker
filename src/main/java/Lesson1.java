public class Lesson1 {
  /**
   * return the sum of two parameters
   * @param a
   * @param b
   * @return
   */
  public static int add(int a, int b) {

  }

  public static void test() throws Exception {
    if (Lesson1.add(1, 2) != 3) {
      throw new Exception("1 + 2 != 3");
    }
  }

  public static void main(String[] args) throws Exception{
    Lesson1.test();
    System.out.println("Pass all tests!");
  }
}
