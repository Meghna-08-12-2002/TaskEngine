package Repository;

import Dto.ProductDto;

public class ProductRepositoryImpl implements ProductRepository{
    public ProductRepositoryImpl()
    {
        System.out.println("Product Repository Implementation constructor");
    }
    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("persist method in Product Repository Implementation");
        return false;
    }
}
