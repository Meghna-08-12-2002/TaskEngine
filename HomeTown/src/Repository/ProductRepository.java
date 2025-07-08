package Repository;

import Dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
