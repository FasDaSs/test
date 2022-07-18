public interface INum {
    int GetValue();
    String Add(INum operand);
    String Sub(INum operand);
    String Mul(INum operand);
    String Div(INum operand);
}
