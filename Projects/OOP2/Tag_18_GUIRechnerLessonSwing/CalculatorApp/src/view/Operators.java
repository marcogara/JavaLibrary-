package view;


public enum Operators {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    SEPERATOR("."),
    EQUALS("="),
    DELETE("Del"),
    CLEAR("Clr");

    // Enumattribut:
    private final String btnText;

    Operators(String btnText) {
        this.btnText = btnText;
    }

    public String getBtnText() {
        return this.btnText;
    }
}