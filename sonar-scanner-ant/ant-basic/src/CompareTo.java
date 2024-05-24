import java.math.BigDecimal;

public class CompareTo {

   private String used_amt = "1000000";
   private String budget_amt = "700000";

   public void Test()
   {
      try {
        BigDecimal bd_used_amt = new BigDecimal(used_amt);
        BigDecimal bd_budget_amt = new BigDecimal(budget_amt);
        
       if (bd_budget_amt.compareTo(bd_used_amt) == -1)
        {
        // 사용액과 추가할 예산액 비교 예산액이 큰 경우
        throw new Exception("예산액이 사용액보다 작습니다.");
        }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
