public class PasswordChk {
    public static void main(String[] args) {
        String password = "Abc@1234"; // test with different values

        boolean isLong = password.length() >= 8;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if ("!@#$%^&*".indexOf(ch) >= 0) hasSpecial = true;
        }

        if (isLong && hasUpper && hasDigit && hasSpecial) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }
    }
}
