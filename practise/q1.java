/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class CCC {
    long m  =  1000000007 ;
    public long pow(long x, long n) {
        long ans = 1 ;
        while ( n > 0 ) {
            if ( n % 2 == 1 ) {
                ans = (ans * x) % m  ;
                n -= 1 ;
            } else {
                x = (x * x) % m ;
                n /= 2 ;
            }
        }
        return ans ;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t  = sc.nextInt() ;

        while (t-- > 0) {
            int n = sc.nextInt();
            // int[] a = new int[n];

            // for (int i = 0; i < n; i++) {
            //     a[i] = sc.nextInt();
            // }

            String s = sc.next() ;
            int c1 = 0 , c0 = 0 , ind = 0 , len = 0  ;
            while ( ind < n ) {
                if ( s.charAt(ind) == '1' ) {
                    c1 += 1 ;
                    ind += 1 ;
                } else {
                    while (ind < n && s.charAt(ind) == '0' ) {
                        c0 += 1 ;
                        ind  += 1 ;
                    }
                    len = Math.max(len, c0) ;
                    c0 = 0 ;
                }
            }

            System.out.println(c1 + len) ;
        }

        sc.close();
    }
}

