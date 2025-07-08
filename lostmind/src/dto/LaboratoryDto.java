package dto;

public class LaboratoryDto {
    private String name;
    private String location;
    private String technician;
    private String type;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getTechnician() { return technician; }
    public void setTechnician(String technician) { this.technician = technician; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "LaboratoryDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", technician='" + technician + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
