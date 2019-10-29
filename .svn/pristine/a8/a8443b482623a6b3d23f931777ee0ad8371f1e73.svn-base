package jpp.addressbook;
import java.time.LocalDate;
import java.util.Optional;

public class AddressBookFactory {

    public static Contact createContact(int id, Salutation salutation, String firstName, String lastName, LocalDate birthday, String streetAddress, int
            zipCode, String city, Long phone, String eMail) {
        //TODO: Instanz eines Kontakts zurückgeben
        return new ContactImpl(id,salutation,firstName,lastName,birthday,streetAddress,zipCode,city, Optional.of(phone),Optional.of(eMail));
    }

    public static AddressBook createAddressBook() {
        //TODO: Instanz eines Adressbuchs zurückgeben
        return new AddressBookImpl();
    }

    public static AddressBookUtil createAddressBookUtil(AddressBook addressBook) {
        //TODO: Instanz eines Adressbuch Util zurückgeben
        return new AddressBookUtilImpl(addressBook);
    }
}
