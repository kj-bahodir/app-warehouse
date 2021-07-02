package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Output;
import java.sql.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Integer getWarehouseId();
    Integer getClientId();
    Integer getCurrencyId();
    String getFactureNumber();
    String getCode();

}
