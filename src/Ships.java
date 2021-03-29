public enum Ships {
    FIRST_SHIP(1, "Пиратский"),
    SECOND_SHIP(2, "Торговый"),
    ;

    private final int num;
    private final String name;

    Ships(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
