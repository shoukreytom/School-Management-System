package sample;

public class Validator {

    public boolean validatePhone(String phone) {
        if (phone.length() != 10)
            return false;
        return phone.matches("[0-9]{10}");
    }

}
