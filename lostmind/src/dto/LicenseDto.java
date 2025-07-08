package dto;

public class LicenseDto {
    private String type;
    private String holderName;
    private String issueDate;
    private String expiryDate;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) { this.issueDate = issueDate; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "type='" + type + '\'' +
                ", holderName='" + holderName + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
