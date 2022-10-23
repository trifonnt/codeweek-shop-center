package codeweek.shopcenter.service.mapper;


import codeweek.shopcenter.domain.*;
import codeweek.shopcenter.service.dto.ProductDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

    @Mapping(source = "owner.id", target = "ownerId")
    @Mapping(source = "owner.login", target = "ownerLogin")
    @Mapping(source = "replaced.id", target = "replacedId")
    @Mapping(source = "replaced.name", target = "replacedName")
    ProductDTO toDto(Product product);

    @Mapping(target = "replacements", ignore = true)
    @Mapping(target = "removeReplacement", ignore = true)
    @Mapping(source = "ownerId", target = "owner")
    @Mapping(source = "replacedId", target = "replaced")
    Product toEntity(ProductDTO productDTO);

    default Product fromId(Long id) {
        if (id == null) {
            return null;
        }
        Product product = new Product();
        product.setId(id);
        return product;
    }
}
