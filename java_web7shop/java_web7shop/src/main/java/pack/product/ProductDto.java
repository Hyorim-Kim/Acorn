package pack.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
	private int no;
	private String name,price,detail,sdate,stock,image;
}
