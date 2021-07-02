package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();
    String getName();
    boolean isActive();
    Integer getCategoryId();
    Integer getPhotoId();
    String getCode();
    Integer getMeasurementId();
}
