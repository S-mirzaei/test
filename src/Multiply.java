public class Multiply implements Operate {

    public double getResult(double... number) {
        double result = 1;
        for (double num : number) {
            result *= num;
        }
        return result;

    }

}
