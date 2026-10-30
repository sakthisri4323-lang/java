public class student {
String name;
String department;
int age;
public student(String name,String department,int age) {
this.name=name;
this.department=department;
this.age=age;
}
public void displayInfo(){
System.out.println("Student Name :" + this.name);
System.out.println("Department :"+ this.department);
System.out.println("Age :" +this.age);
}
public static void main(String[] args){
student s1=new student("vimal","cse",19);
s1.displayInfo();
}
}
