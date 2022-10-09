package Dsa3Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Nqueens {
	public static List<List<String>> doSolveNQueens(int col,char[][] board,List<List<String>> res){
		if(col==board.length) {
			res.add(construct(board));
			return res;
		}
		for(int row=0;row<board.length;row++) {
			if(validate(row,col,board)) {
				board[row][col]='Q';
				doSolveNQueens(col+1,board,res);
				board[row][col]='.';
			}
		}
		return res;
	}
	public static List<String> construct(char board[][]){
		List<String> list=new LinkedList<>();
		for(int i=0;i<board.length;i++) {
			String s=new String(board[i]);
			list.add(s);
		}
		return list;
	}
	public static boolean validate(int row,int col,char[][] board) {
		int refRow=row;
		int refCol=col;
		while(row>=0 && col>=0) {
			if(board[row][col]=='Q')
				return false;
			row--;
			col--;
		}
		row=refRow;
		col=refCol;
		while(col>=0) {
			if(board[row][col]=='Q')
				return false;
			col--;
		}
		row=refRow;
		col=refCol;
		while(col>=0 && row<board.length) {
			if(board[row][col]=='Q')
				return false;
			col--;
			row++;
		}
		return true;
	}
	public static List<List<String>> nQueens(int n){
		char board[][]=new char[n][n];
		for(char row[]:board)
			Arrays.fill(row,'.');
		List<List<String>> res=new ArrayList<>();
		return doSolveNQueens(0,board,res);
	}
public static void main(String []args) {
	int n=4;
	List<List<String>> res=nQueens(n);
	for(List<String> it:res) {
		for(String s:it) {
			System.out.println(s);
		}
		System.out.println();
	}
//	System.out.println(res);
}
}
