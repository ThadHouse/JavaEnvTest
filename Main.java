public class Main {
  public static void main(String[] args) {
    System.out.println(System.getenv("LD_LIBRARY_PATH"));
    System.out.println(System.getenv("DYLD_LIBRARY_PATH"));
    System.out.println(System.getenv("TestVar"));
  }
}
