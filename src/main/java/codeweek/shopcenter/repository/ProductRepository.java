package codeweek.shopcenter.repository;

import codeweek.shopcenter.domain.Product;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    @Query("select product from Product product where product.owner.login = ?#{principal.username}")
    List<Product> findByOwnerIsCurrentUser();
}
