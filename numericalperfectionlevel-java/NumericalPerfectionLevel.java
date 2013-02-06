public class NumericalPerfectionLevel {

	public int getLevel(long N) {
        // The following lines count N's prime factors,
        // and save the count in the c variable.
        long q=2;
        int c=0;
        while(q*q<=N)
        {
            while(N%q==0) {N/=q; c++;}
            q++;
        }
        if(N>1) c++;

        // Pick the result: (basically a base 4 logarithm)
        if (c >= 20) return 3;
        if( c>=16) return 2;
        if(c>=4) return 1;
        return 0;
	}
}
