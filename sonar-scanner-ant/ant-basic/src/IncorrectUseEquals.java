public class IncorrectUseEquals {
  
  String str1 = "hello";
  String str2 = "hello";
  public void test()
  {
    if (str1 == str2) {  // 객체 참조 비교, false
        // 잘못된 비교 방식, equals() 메서드 사용 권장
    }
  }
}
