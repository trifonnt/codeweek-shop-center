package codeweek.shopcenter.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.BigDecimalFilter;

/**
 * Criteria class for the {@link codeweek.shopcenter.domain.Product} entity. This class is used
 * in {@link codeweek.shopcenter.web.rest.ProductResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /products?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class ProductCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private BigDecimalFilter price;

    private StringFilter description;

    private IntegerFilter quantity;

    private LongFilter replacementId;

    private LongFilter ownerId;

    private LongFilter replacedId;

    public ProductCriteria() {
    }

    public ProductCriteria(ProductCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.description = other.description == null ? null : other.description.copy();
        this.quantity = other.quantity == null ? null : other.quantity.copy();
        this.replacementId = other.replacementId == null ? null : other.replacementId.copy();
        this.ownerId = other.ownerId == null ? null : other.ownerId.copy();
        this.replacedId = other.replacedId == null ? null : other.replacedId.copy();
    }

    @Override
    public ProductCriteria copy() {
        return new ProductCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public BigDecimalFilter getPrice() {
        return price;
    }

    public void setPrice(BigDecimalFilter price) {
        this.price = price;
    }

    public StringFilter getDescription() {
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public IntegerFilter getQuantity() {
        return quantity;
    }

    public void setQuantity(IntegerFilter quantity) {
        this.quantity = quantity;
    }

    public LongFilter getReplacementId() {
        return replacementId;
    }

    public void setReplacementId(LongFilter replacementId) {
        this.replacementId = replacementId;
    }

    public LongFilter getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(LongFilter ownerId) {
        this.ownerId = ownerId;
    }

    public LongFilter getReplacedId() {
        return replacedId;
    }

    public void setReplacedId(LongFilter replacedId) {
        this.replacedId = replacedId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProductCriteria that = (ProductCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(price, that.price) &&
            Objects.equals(description, that.description) &&
            Objects.equals(quantity, that.quantity) &&
            Objects.equals(replacementId, that.replacementId) &&
            Objects.equals(ownerId, that.ownerId) &&
            Objects.equals(replacedId, that.replacedId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        name,
        price,
        description,
        quantity,
        replacementId,
        ownerId,
        replacedId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (price != null ? "price=" + price + ", " : "") +
                (description != null ? "description=" + description + ", " : "") +
                (quantity != null ? "quantity=" + quantity + ", " : "") +
                (replacementId != null ? "replacementId=" + replacementId + ", " : "") +
                (ownerId != null ? "ownerId=" + ownerId + ", " : "") +
                (replacedId != null ? "replacedId=" + replacedId + ", " : "") +
            "}";
    }

}
