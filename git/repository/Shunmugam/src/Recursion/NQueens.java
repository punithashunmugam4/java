package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
	public static List<List<String>> dosolveNQueens(int n){
		char board[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='.';
			}
		}
		List<List<String>> res=new ArrayList<>();
		searchPossibility(0,board,res);
		return res;
	}
	static void searchPossibility(int col,char[][] board,List<List<String>> res ){
		if(col==board.length) {
			res.add(construct(board));
			return;
		}
		for(int row=0;row<board.length;row++) {
			if(validate(row,col,board)) {
				board[row][col]='Q';
				searchPossibility(col+1,board,res);
				board[row][col]='.';
			}
		}
			
	}
	private static List<String> construct(char[][] board){
		List<String> list=new LinkedList<>();
		for(int i=0;i<board.length;i++) {
			String s=new String(board[i]);
			list.add(s);
		}
		return list;
	}
	private static boolean validate(int row,int col,char[][] board) {
		int duprow=row;
		int dupcol=col;
		while(row>=0 && col>=0) {
			if(board[row][col]=='Q') return false;
			row--;
			col--;
		}
		row=duprow;
		col=dupcol;
		while(col>=0) {
			if(board[row][col]=='Q') return false;
			col--;
		}
		row=duprow;
		col=dupcol;
		while(col>=0 && row<board.length) {
			if(board[row][col]=='Q') return false;
			col--;
			row++;
		}
		return true;
	}
public static void main(String []args) {
	int N=4;
	List<List<String>> queens=dosolveNQueens(N);
	int i=1;
	for(List<String> it:queens) {
		System.out.println("Arangements :: "+i);
		for(String s:it) {
			System.out.println(s);
		}
		System.out.println();
		i+=1;
	}
}
}
