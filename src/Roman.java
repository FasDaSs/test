public class Roman implements INum{
    private int value;

    Roman(String number) {
        value = RomanNumeral.romanToArabic(number);
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
        return RomanNumeral.arabicToRoman(value + operand.GetValue());
    }

    @Override
    public String Sub(INum operand) {
        return RomanNumeral.arabicToRoman(value - operand.GetValue());
    }

    @Override
    public String Mul(INum operand) {
        return RomanNumeral.arabicToRoman(value * operand.GetValue());
    }

    @Override
    public String Div(INum operand) {
        return RomanNumeral.arabicToRoman(value / operand.GetValue());
    }
}
