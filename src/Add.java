public class Add implements Operate {

    public double getResult(double... number) {
        double sum = 0;
        for (double num : number) {
            sum += num;
        }
        return sum;

    }
}
