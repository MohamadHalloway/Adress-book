package jpp.addressbook;

public enum Salutation {
    HERR,FRAU;

    @Override
    public String toString() {
        if (this == HERR){
            return "Herr";
        }
        return "Frau";
    }
}
