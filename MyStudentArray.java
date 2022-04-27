import java.util.*;
class MyStudentArray
{
     //Implement a method which accepts the Student array as an argument and returns
      // all the students who are Part Time STudents and having % less than 50.

     public PartTimeStudent[] findStudent(Student [] abc)
      {
	PartTimeStudent [] pst = new PartTimeStudent[abc.length];
	int i=0;    //index of array pst
	for(Student s : abc)
	{
		if(s instanceof PartTimeStudent  && s.percentage < 50)
		   {
			PartTimeStudent ps = (PartTimeStudent) s;
			pst[i] = ps;       i++;
		   }
	}
	//pst contains all the parttimestudents with % less than 50
	return pst;
      }
     public static void main(String [] rk)
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Students: \t");
	int num = sc.nextInt();

//Use 1 array to store both Student and PartTimeStudent

	Student [] std = new Student [num];
	int i=0;
       for(int x=0; x<num; x++)
            {
	System.out.println("\n* * * Student "+ (x+1) + " * * *\n");
	System.out.println("1. Full Time Student");
	System.out.println("2. Part Time Student");
	System.out.print("Enter Your Choice: \t");
	int input = sc.nextInt();

	System.out.print("\nEnter the name: \t");
	sc.nextLine();
	String name = sc.nextLine();

	System.out.print("\nEnter the percentage: \t");
	double per = sc.nextDouble();

                  if(input == 1)  
	{
		//Create Student Object
		Student s = new Student(name , per);
		std[i] = s;
   	}
	else if(input == 2)
	{
	     System.out.print("\nEnter the duration:\t");
	     int dur = sc.nextInt();

	    PartTimeStudent pst = new PartTimeStudent(name, per, dur);
	    std[i] = pst;	
	}
	else System.out.println("\n* * * Wrong Input !!! ");
	i++;

          }//End of For Loop

	//Traverse the Student array
	
	for(Student st : std)
	{
		System.out.println(st.name + "\t"+ st.percentage);
	}

	MyStudentArray obj = new MyStudentArray();
	PartTimeStudent [] result = obj.findStudent(std);   //non-static method to be called from static context

	System.out.println("\n\t * * * Final Result * * *\n");
	for(PartTimeStudent  p: result)
                    {
	    if(p != null)
     	   System.out.println(p.name + "\t"+ p.percentage + "\t"+ p.duration);
	   }
      }
}

class Student
{
    String name;
    double percentage;

    Student(){}

    Student(String n, double p)
       {
	name = n;    percentage = p;
       }
}
class PartTimeStudent extends Student
{
      int duration;    
      PartTimeStudent(String n, double p, int d)
      {
	name = n; percentage = p; duration = d;
       }
} 