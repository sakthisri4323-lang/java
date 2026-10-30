import java.util.*;
public class Search{
public static void main(String[]args){
int[] a= {5, 3, -1, 2, 1, 8};
int n=1;
while(true){
Boolean found = false;
for(int x:a){
if(x==n){
found=true;
System.out.println("True "+n);
break;
}
}
if(!found){
System.out.println("FALSE "+n);
break;
}
n++;
}
}
}
