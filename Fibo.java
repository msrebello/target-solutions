/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele 
calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
*/


public class Fibo {

    private static long[] fib;

    static {
        fib = new long[50];
        fib[0] = 0;
        fib[1] = 1;
    }

    public static void main(String[] args) {

        int test1 = 20;
        int test2 = 144;

        calculateFibo();

        System.out.println("O numero " + test1 + " está contido na sequência? " + containsInFibo(20));
        System.out.println("O numero " + test2 + " está contido na sequência? " + containsInFibo(144));
    }

    private static void calculateFibo() {
        
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i - 2] + fib[i - 1];
    }

    private static boolean containsInFibo(int test) {

        for (int i = 0; i < fib.length; i++)
            if (fib[i] == test)
                return true;

        return false;    
    }
}