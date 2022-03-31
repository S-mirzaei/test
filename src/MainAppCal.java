import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainAppCal {
    public static void main(String[] args) {
        //4+5*2/2
        final String inputExp = ReadInput.read();
        String[] numArray = inputExp.split("[-+*/]");
        String[] operArray = inputExp.split("[0-9]");

        Queue<String> numbers = new LinkedList<String>(Arrays.asList(numArray));
        Queue<String> operations = new LinkedList<String>(Arrays.asList(operArray));
        double res = Double.parseDouble(numbers.poll());
        while(!numbers.isEmpty()){
            String opr = operations.poll();
            Operate operator;
            switch (opr){
                case("+"):
                    operator = new Add();
                    break;

                case("-"):
                    operator = new Subtract();
                    break;

                case("*"):
                    operator = new Multiply();
                    break;

                case("/"):
                    operator = new Divide();
                    break;
                default:
                    continue;
            }
            double num = Double.parseDouble(numbers.poll());
            res = operator.getResult(res,num);

        }
        System.out.println(res);
    }
}
