package app.springboot30lesson.before;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class Main {
    public static void main(String[] args) throws Exception {
        var monthlyUsage = new MonthlyUsage(new Customer(), 100, 500);
        monthlyUsage.Customer.Type = CustomerType.Unlimited;
        var monthlyStatement = new MonthlyStatement();

        monthlyStatement.CallCost = 1;
        monthlyStatement.Generate(monthlyUsage);

        System.out.println(monthlyStatement.TotalCost);
    }
}
