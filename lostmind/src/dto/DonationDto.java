package dto;

public class DonationDto {
    private String name;
    private String email;
    private int amount;
    private String message;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override
    public String toString() {
        return "DonationDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", message='" + message + '\'' +
                '}';
    }
}
