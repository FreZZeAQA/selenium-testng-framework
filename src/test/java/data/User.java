package data;

public enum User {
    DEFAULT_USER("standard_user","secret_sauce"),
    INCORRECT_USER("standr","secruce");

    private String USERNAME;
    private String PASSWORD;

    User(String LOGIN, String PASSWORD) {
        this.USERNAME = LOGIN;
        this.PASSWORD = PASSWORD;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}

