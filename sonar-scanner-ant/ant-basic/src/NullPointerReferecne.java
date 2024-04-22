public class NullPointerReferecne {
  String str = null;

  public void Test()
  {
    // NullPointerException 발생
    int length = str.length();
  }
}
