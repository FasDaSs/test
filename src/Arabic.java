public class Arabic implements INum {
    private int value;

    Arabic(String number) {
        value = Integer.parseInt(number);
        if (value < 1 || value > 10) {
            throw new IllegalArgumentException(number + " is not in range (0, 10]");
        }
    }

    @Override
    public int GetValue() {
        return value;
    }

    @Override
    public String Add(INum operand) {
        return Integer.toString(value + operand.GetValue());
    }

    @Override
    public String Sub(INum operand) {
        return Integer.toString(value - operand.GetValue());
    }

    @Override
    public String Mul(INum operand) {
        return Integer.toString(value * operand.GetValue());
    }

    @Override
    public String Div(INum operand) {
        return Integer.toString(value / operand.GetValue());
    }
}
