//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @SerializedName("product_name")
    private String productName;

    private String supplier;

    private int quantity;

    @SerializedName("unit_cost")
    private double unitCost;
}
