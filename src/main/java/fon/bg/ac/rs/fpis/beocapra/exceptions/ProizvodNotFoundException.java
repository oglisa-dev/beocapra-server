package fon.bg.ac.rs.fpis.beocapra.exceptions;


public class ProizvodNotFoundException extends RuntimeException {

    public ProizvodNotFoundException() {
        super("Proizvod not found");
    }

}
