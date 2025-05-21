package ServiceImpl;

import Dto.ProductDto;
import Service.ProductService;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
        System.out.println("Productservice implementation constructor");
    }

    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("productDto saved in productserviceimpl");

        if (productDto != null) {
            System.out.println("productDto is not null");
        } else {
            System.out.println("productDto is null");
            return false;
        }

        String name = productDto.getName();
        if (name != null && name.length() >= 3 && name.length() <= 20) {
            System.out.println("name is valid");
        } else {
            System.out.println("name is invalid");
            return false;
        }

        String type = productDto.getType();
        if (type != null && !type.equals("select")) {
            System.out.println("type is valid");
        } else {
            System.out.println("type is invalid");
            return false;
        }

        String incomingprice = productDto.getIncomingprice();
        if (incomingprice != null && incomingprice.length() >= 1 && incomingprice.length() <= 100) {
            System.out.println("incomingprice is valid");
        } else {
            System.out.println("incomingprice is invalid");
            return false;
        }

        String sellingprice = productDto.getSellingprice();
        if (sellingprice != null && sellingprice.length() >= 1 && sellingprice.length() <= 100) {
            System.out.println("sellingprice is valid");
        } else {
            System.out.println("sellingprice is invalid");
            return false;
        }

        String MRP = productDto.getMRP();
        if (MRP != null && MRP.length() >= 1 && MRP.length() <= 100) {
            System.out.println("MRP is valid");
        } else {
            System.out.println("MRP is invalid");
            return false;
        }

        String description = productDto.getDescription();
        if (description != null && description.length() >= 3 && description.length() <= 30) {
            System.out.println("description is valid");
        } else {
            System.out.println("description is invalid");
            return false;
        }

        String brand = productDto.getBrand();
        if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
            System.out.println("brand is valid");
        } else {
            System.out.println("brand is invalid");
            return false;
        }

        String quality = productDto.getQuality();
        if (quality != null && quality.length() >= 3 && quality.length() <= 20) {
            System.out.println("quality is valid");
        } else {
            System.out.println("quality is invalid");
            return false;
        }

        String color = productDto.getColor();
        if (color != null && !color.equals("select")) {
            System.out.println("color is valid");
        } else {
            System.out.println("color is invalid");
            return false;
        }

        String weight = productDto.getWeight();
        if (weight != null && weight.length() >= 1 && weight.length() <= 100) {
            System.out.println("weight is valid");
        } else {
            System.out.println("weight is invalid");
            return false;
        }

        String manufdate = productDto.getManufdate();
        if (manufdate != null && manufdate.length() >= 1 && manufdate.length() <= 100) {
            System.out.println("manufdate is valid");
        } else {
            System.out.println("manufdate is invalid");
            return false;
        }

        String warranty = productDto.getWarranty();
        if (warranty != null && warranty.length() >= 3 && warranty.length() <= 20) {
            System.out.println("warranty is valid");
        } else {
            System.out.println("warranty is invalid");
            return false;
        }

        String returnpolicy = productDto.getReturnpolicy();
        if (returnpolicy != null) {
            System.out.println("returnpolicy is valid");
        } else {
            System.out.println("returnpolicy is invalid");
            return false;
        }

        return true;
    }
}

