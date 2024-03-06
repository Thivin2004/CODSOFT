import java.util.Scanner;

class grade{
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number of subjects ");
        int subs=o.nextInt();
        System.out.println("Enter the subject marks");
        int m1=o.nextInt();
        int m2=o.nextInt();
        int m3=o.nextInt();
        int m4=o.nextInt();
        int m5=o.nextInt();
        int tot=0,avg=0;
        if( m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100 || m4<0 || m4>100 || m5<0 || m5>100 ){
            System.out.println("Enter valid marks");
        }
        else{
            tot=m1+m2+m3+m4+m5;
            avg=tot/subs;
            System.out.println("Total marks of the student is "+ tot);
            System.out.println("Average of the student is "+ avg);
            System.out.print("Grade = " );
            if(avg>90){
                    System.out.print("A");
            }
            else if(avg>80){
                    System.out.print("B");
            }
            else if(avg>70){
                    System.out.print("C");
            }
            else if(avg>60){
                    System.out.print("D");
            }
            else if(avg>50){
                    System.out.print("E");
            }
            else{
                    System.out.print("F");
            }
            
        }
        o.close();
    }
}