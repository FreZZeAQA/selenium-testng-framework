package data;

public enum AddToCartButtons {
    BACKPACK("add-to-cart-sauce-labs-backpack"),
    BIKE_LIGHT("add-to-cart-sauce-labs-bike-light"),
    T_SHIRT_BOLT("add-to-cart-sauce-labs-bolt-t-shirt"),
    T_SHIRT_RED("add-to-cart-test.allthethings()-t-shirt-(red)"),
    FLEECE_JACKET("add-to-cart-sauce-labs-fleece-jacket"),
    ONESIE("add-to-cart-sauce-labs-onesie");

    private String idValue;

    AddToCartButtons(String idValue) {
        this.idValue = idValue;
    }

    public String getIdValue() {
        return idValue;
    }
}
