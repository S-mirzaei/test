public class Subtract implements Operate {

    public double getResult(double... number) {
        double result = number[0];
        for (int i = 1; i < number.length; i++ ) {
            result -= number[i];
        }
        return result;

    }

}
