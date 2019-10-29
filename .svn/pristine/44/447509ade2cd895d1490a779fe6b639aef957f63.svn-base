package jpp.addressbook.gui;


import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Helper {
    static Pattern mailPattern = Pattern.compile("[\\w\\d\\.]+\\@[\\w\\d\\-]+\\.[\\w\\d]+");

    static boolean check_zipCode(String temp) {
        if (temp.isEmpty()) {
            return false;
        }
        try {
            int res = Integer.parseInt(temp);
            if (res < 1) {
                throw new IllegalArgumentException();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean check_salutation(String temp) {
        return temp != null;
    }

    static boolean check_empty(String temp) {
        return !temp.isEmpty();
    }

    static boolean check_birthday(LocalDate temp, String text) {
        if (temp == null || temp.isAfter(LocalDate.now())) {
            return false;
        }
        try {
            LocalDate localDate = LocalDate.parse(text, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean check_phoneNumber(String temp) {
        if (temp.isEmpty()) {
            return true;
        } else {
            try {
                long res = Long.parseLong(temp);
                if (res < 1) {
                    throw new IllegalArgumentException();
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    static boolean check_email(String temp) {
        if (temp.isEmpty()) {
            return true;
        }
        Matcher matcher = mailPattern.matcher(temp);
        return matcher.find();
    }

    static boolean check_year(String temp){
        try {
            Year.parse(temp);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}