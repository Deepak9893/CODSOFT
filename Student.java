import java.util.Scanner;
class Student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of 1st subject: ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of 2nd subject: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of 3rd subject: ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of 4th subject: ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of 5th subject: ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float avg = sum/5f;
        System.out.println("Total marks is: "+sum);
        System.out.println("Average marks is: "+avg);
        if(avg>=0&&avg<=33)
        {
            System.out.println("D grade");
        }
        else if(avg>=34&&avg<=40)
        {
            System.out.println("C grade");
        }
        else if(avg>=41&&avg<=59)
        {
            System.out.println("B grade");
        }
        else if(avg>=60&&avg<=90)
        {
            System.out.println("A grade");
        }
        else if(avg>=91&&avg<=100)
        {
            System.out.println("A+ grade");
        }
        else 
        {
            System.out.println("Wrong  statement");
        }
    }
}