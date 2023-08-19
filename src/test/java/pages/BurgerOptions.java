package pages;

public enum BurgerOptions {

    ALL_ITEMS("inventory_sidebar_link"),
    ABOUT("about_sidebar_link"),
    LOGOUT("logout_sidebar_link"),
    RESET_APP_STATE("reset_sidebar_link");

    private String optionId;

    BurgerOptions(String optionId) {
        this.optionId = optionId;
    }

    public String getOptionId() {
        return optionId;
    }
}
