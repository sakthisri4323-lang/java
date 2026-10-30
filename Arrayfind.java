import java.util.*;
public class Arrayfind{
public static void main(String[]args){
int arr[]={ 10, 20, 10, 20, 10};
int b=0;
int n=arr.length;
for(int i=0;i<n;i++)
if(arr[i]==10){
b++;
}
System.out.println(b);
}
}
