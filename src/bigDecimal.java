import java.math.BigDecimal;
import java.time.LocalDateTime;

public class bigDecimal {


    public void addMoney(){

        //original balance
        BigDecimal balance = new BigDecimal("12567.98");

        //deposit
        BigDecimal deposit = new BigDecimal("500");

        //new balance
        BigDecimal newBalance = balance.add(deposit);

        System.out.println(newBalance + " Deposit completed at " + LocalDateTime.now());

    }


}
