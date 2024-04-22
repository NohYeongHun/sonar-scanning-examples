public class InefficientCalc {
   public void Test()
   {
      String result = "";
      for (int i = 0; i < 1000; i++) {
          result += i;  // 매 반복마다 새로운 문자열 객체가 생성됨
      }
   }
}
