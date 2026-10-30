import java.util.*;
public class Find{
public static void main(String[]args){
int arr[]={ 5, 3, -1, 2, 1, 8 };
int n=arr.length;
for(int i=1;i<=n;i++){
boolean found=false;
for(j=1;j<n;j++){
if(i==arr[j]){
found=true;
break;
}
}
if(found)
System.out.println(i);
break;
}
}
}