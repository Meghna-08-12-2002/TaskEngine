package Dto;

public class ProductDto {
    public ProductDto(){
        System.out.println("ProductDto running in Dto");
    }
    private String name;
    private String type;
    private String incomingprice;
    private String sellingprice;
    private String MRP;
    private String description;
    private String brand;
    private  String quality;
    private String color;
    private String weight;
    private String manufdate;
    private  String warranty;
    private String returnpolicy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIncomingprice() {
        return incomingprice;
    }

    public void setIncomingprice(String incomingprice) {
        this.incomingprice = incomingprice;
    }

    public String getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(String sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getMRP() {
        return MRP;
    }

    public void setMRP(String MRP) {
        this.MRP = MRP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

      public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getManufdate() {
        return manufdate;
    }

    public void setManufdate(String manufdate) {
        this.manufdate = manufdate;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getReturnpolicy() {
        return returnpolicy;
    }

    public void setReturnpolicy(String returnpolicy) {
        this.returnpolicy = returnpolicy;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", incomingprice='" + incomingprice + '\'' +
                ", sellingprice='" + sellingprice + '\'' +
                ", MRP='" + MRP + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quality='" + quality + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manufdate='" + manufdate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnpolicy='" + returnpolicy + '\'' +
                '}';
    }
}
