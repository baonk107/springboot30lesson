package app.springboot30lesson.after;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class MonthlyUsage {
    public Customer Customer;
    public int CallMinutes;
    public int SmsCount;

    public MonthlyUsage(Customer customer, int callMinutes, int smsCount) {
        Customer = customer;
        CallMinutes = callMinutes;
        SmsCount = smsCount;
    }
}
