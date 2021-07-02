package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.User;
import java.util.List;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirsName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean isActive();
    List<Integer> getWarehousesId();

}
