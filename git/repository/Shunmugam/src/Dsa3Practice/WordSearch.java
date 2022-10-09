package Dsa3Practice;

public class WordSearch {
	public static boolean doFindWord(char[][] alpha,int nRow,int nCol,int i,int j,String word,int level) {
		if(level==word.length()) return true;
		if(i>=nRow || j>=nCol || i<0 || j<0) return false;
		if(alpha[i][j]==word.charAt(level)) {
//			char temp=alpha[i][j];
//			alpha[i][j]='#';
			boolean res=doFindWord(alpha,nRow,nCol,i+1,j,word,level+1)||
					doFindWord(alpha,nRow,nCol,i-1,j,word,level+1)||
					doFindWord(alpha,nRow,nCol,i,j+1,word,level+1)||
					doFindWord(alpha,nRow,nCol,i,j-1,word,level+1);
//			alpha[i][j]=temp;
			return res;
		}
		else
		return false;
	}
	public static boolean doCheck(char alpha[][],String word,int nRow,int nCol) {
		int l=alpha.length;
		if(l>nRow*nCol) return false;
		for(int i=0;i<nRow;i++) {
			for(int j=0;j<nCol;j++) {
				if(alpha[i][j]==word.charAt(0)) {
					if(doFindWord(alpha,nRow,nCol,i,j,word,0)) {
						return true;
					}
				}
			}
		}
		return false;
	}
public static void main(String []args) {
	char alpha[][]= {{'A','B','C','A'},
					{'H','B','A','J'},
					{'D','Q','T','Q'}};
	 int nRow = 3;
     int nCol = 4;
     if(doCheck(alpha, "CAT", nRow, nCol)){
         System.out.println("I have found the word");
     }else{
         System.out.println("Word is not present");
     }
}
}
