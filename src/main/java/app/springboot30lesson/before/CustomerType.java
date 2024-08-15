package app.springboot30lesson.before;

/**
 * @author it.Baonk.
 * @mail: bao.nguyenkhac@ivnd.com.vn
 * @Date: 15/08/2024
 */
public enum  CustomerType {
    PayAsYouGo(1),
    Unlimited(0);

    private int typeCode;

    CustomerType(int typeCode) {
        this.typeCode = typeCode;
    }
}
