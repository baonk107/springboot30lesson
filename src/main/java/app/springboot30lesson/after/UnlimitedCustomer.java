package app.springboot30lesson.after;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public class UnlimitedCustomer extends Customer {
    public UnlimitedCustomer () {
        Type = CustomerType.Unlimited;
    }
}
