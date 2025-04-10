 public class zZz_confusingNAME999{
public static void main(String[] ARGZ){
int[] aaAaaAAaaA = {5, 2, 9, 1, 5, 6};
new zZz_confusingNAME999().sorterish(aaAaaAAaaA);
for(int i=0;i<aaAaaAAaaA.length;i++)
System.out.print(aaAaaAAaaA[i]+" ");
}

void sorterish(int[] X){
for(int x=0;x<X.length;x++){
for(int y=0;y<X.length-1;y++){
if(X[y]<X[y+1]){ // BUG: should be > for ascending sort
int tmp=X[y];
X[y]=X[y+1];
X[y+1]=tmp;
}
}
}
}
