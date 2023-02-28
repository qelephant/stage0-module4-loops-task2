package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long factorial = 1;
        int i=1;
        while (i <= printToInclusive)
        {
            factorial = factorial * i;
            i++;
            System.out.println(factorial);
            
        }
    }
}
