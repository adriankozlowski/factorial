package pl.sda;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int N = 1000000;
        BigInteger product = BigInteger.ONE;
        BigInteger tmp = product;
        long l = System.currentTimeMillis();
        for ( int j=1; j<=N; j++ ) {
            product = product.multiply(tmp);
            tmp = tmp.add(BigInteger.ONE);
        }

        long l1 = System.currentTimeMillis() - l;
        System.out.println("policzone w "+ l1);
    }
}
