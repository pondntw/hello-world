public class xXxSorter420xXx{
public static void main(String argz[]){    
int[] potato={9,3,7,1,4,8,2};
sortttt(potato);
for(int p=0;p<potato.length;p++)
System.out.print(potato[p]+" ");
}

public static void sortttt(int[] lol){
for(int i=0;i<=lol.length;i++){
for(int j=0;j<lol.length-1;j++){
if(lol[j+1]<lol[j]){
int tmp=lol[j+1];
lol[j+1]=lol[j];
lol[j]=tmp;
}
}
}
}
}
