package Codechef;

import java.util.*;
import java.io.*;
import java.lang.*;

public class CVDRUN {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean sol = false;
			if(k == 0){
	            if(x == y)
	                sol = true;   
			}
			else if(n%k == 0) {
				if((y-x)%k == 0) {
					sol = true;
				}
			}
			else {
				int arr = 
			}
			if(sol)
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}
	}
}
