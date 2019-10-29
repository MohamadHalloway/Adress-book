package jpp.addressbook;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

public class ContactImpl implements Contact{

    private final int id;
    private Salutation salutation;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String streetAddress;
    private int zipCode;
    private String city;
    private Optional<Long> phone;
    private Optional<String> email;

    public ContactImpl(int id, Salutation salutation, String firstName, String lastName, LocalDate birthday, String streetAddress, int zipCode, String city, Optional<Long> phone, Optional<String> email) {
        this.id = id;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Salutation getSalutation() {
        return salutation;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getStreetAddress() {
        return streetAddress;
    }

    @Override
    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public Optional<Long> getPhone() {
        return phone;
    }

    @Override
    public Optional<String> getEMail() {
        return email;
    }

    @Override
    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Override
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setPhone(Long phone) {
        this.phone = Optional.ofNullable(phone);
    }

    @Override
    public void setEMail(String mail) {
        this.email = Optional.ofNullable(mail);
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactImpl)) return false;
        ContactImpl contact = (ContactImpl) o;
        return id == contact.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
