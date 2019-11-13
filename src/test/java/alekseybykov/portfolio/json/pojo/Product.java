package alekseybykov.portfolio.json.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
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
