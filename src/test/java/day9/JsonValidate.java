package day9;

public class JsonValidate {
    private String value;
    private String expression;

    @Override
    public String toString() {
        return "JsonValidate{" +
                "value='" + value + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
