public enum ComputerBrand {
    DELL (1984, "USA"),
    HP (1939, "USA"),
    LENOVO (1984, "CHINA"),
    APPLE (1976, "USA"),
    ASUS (1989,"Taiwan");

    private final int found_year;
    private final String country;
    ComputerBrand (int found_year, String country) {
        this.found_year = found_year;
        this.country = country;
    }

    public int getFound_year() {
        return found_year;
    }

    public String getCountry() {
        return country;
    }
}