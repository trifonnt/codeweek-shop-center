package codeweek.shopcenter.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Lob;

/**
 * A DTO for the {@link codeweek.shopcenter.domain.Product} entity.
 */
public class ProductDTO implements Serializable {
    
    private Long id;

    @NotNull
    @Size(min = 3)
    private String name;

    @NotNull
    private BigDecimal price;

    private String description;

    private Integer quantity;

    @Lob
    private byte[] image;

    private String imageContentType;

    private Long ownerId;

    private String ownerLogin;

    private Long replacedId;

    private String replacedName;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long userId) {
        this.ownerId = userId;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public void setOwnerLogin(String userLogin) {
        this.ownerLogin = userLogin;
    }

    public Long getReplacedId() {
        return replacedId;
    }

    public void setReplacedId(Long productId) {
        this.replacedId = productId;
    }

    public String getReplacedName() {
        return replacedName;
    }

    public void setReplacedName(String productName) {
        this.replacedName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductDTO)) {
            return false;
        }

        return id != null && id.equals(((ProductDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", price=" + getPrice() +
            ", description='" + getDescription() + "'" +
            ", quantity=" + getQuantity() +
            ", image='" + getImage() + "'" +
            ", ownerId=" + getOwnerId() +
            ", ownerLogin='" + getOwnerLogin() + "'" +
            ", replacedId=" + getReplacedId() +
            ", replacedName='" + getReplacedName() + "'" +
            "}";
    }
}
