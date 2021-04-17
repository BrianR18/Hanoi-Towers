package ui;

public class Main {
	
	public static void main(String[] args){
		int n = 3;
		System.out.println(n+" "+0+" "+0);
		hanoiTowers(n,0,0,0);
	}//End main
	
	public static void hanoiTowers(int n,int A, int B, int C){
		A = n;
		if(n == 1){
			System.out.println((A-1)+" "+B+" "+(C+1));
		}else if(n == 2){
			hanoiTowers(n-1,A-1,B+1,C);
		}else
			hanoiTowers(n-1,A,B,C);
		/*
		 * }else if(n==0){
			System.out.println(A+" "+(B-1)+" "+(C+1));*/
	}//End hanoiTowers
}//End Main
