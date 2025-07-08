package dto;

public class GlassDto {
    private String brand;
    private String material;
    private String color;
    private String capacity;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "GlassDto{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
