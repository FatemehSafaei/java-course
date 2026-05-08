package exception;

public class ExceptionSample {
    static void main() throws SomeException {
        try {
            try {
                int result = 1 / 0;
            }catch (SomeException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("finally");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally");
        }
    }
}
