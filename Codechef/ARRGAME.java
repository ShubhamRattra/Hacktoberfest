package Codechef;

import java.util.*;
import java.io.*;
import java.lang.*;

public class ARRGAME {
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
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Integer[] space = new Integer[n];
			for(int i=0; i<n; i++) {
				space[i] = 0;
			}
			int p=0;
			for(int i=0; i<n; i++) {
				if(arr[i] == 0) {
					space[p]++;
				}
				else {
					p++;
				}
			}
			Arrays.sort(space, Collections.reverseOrder());
			if(space[0] == 0) {
				System.out.println("No");
			}
			else if(space[1] == 0) {
				if(space[0]%2 == 0) {
					System.out.println("No");
				}
				else { 
					if(space[1]<(space[0]+1)/2)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
			}
			else {
				System.out.println("No");
			}
		}

	}
}
