package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Input;
import java.sql.Date;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
    Date getDate();
    Integer getWarehouseId();
    Integer getSupplierId();
    Integer getCurrencyId();
    String getCode();

}
