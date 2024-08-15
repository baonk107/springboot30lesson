package app.springboot30lesson.after;


/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Customer {
    public CustomerType Type;

    public MonthlyStatement GenerateStatement(MonthlyUsage usage) throws Exception {
        var statement = new MonthlyStatement();
        switch (Type) {
            case PayAsYouGo -> {
                statement.CallCost = 0.12f * usage.CallMinutes;
                statement.SmsCost = 0.12f * usage.SmsCount;
                statement.TotalCost = statement.CallCost + statement.SmsCost;
            }
            case Unlimited -> statement.TotalCost = 54.90f;
            default -> throw new Exception("The current customer type is not supported");
        }

        return statement;
    }
}
