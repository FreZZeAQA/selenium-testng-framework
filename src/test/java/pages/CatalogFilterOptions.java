package pages;

public enum CatalogFilterOptions {
    NAME_A_Z("az"),
    NAME_Z_A("za"),
    PRICE_LOW_HIGH("lohi"),
    PRICE_HIGH_LOW("hilo");

    private String optionValue;

    CatalogFilterOptions(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return optionValue;
    }
}
