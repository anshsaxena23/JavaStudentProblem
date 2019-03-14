import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Students{
	String name=new String();
	double cgpa;
	int priority;
	Students(){
		name="";
		cgpa=0.0;
		priority=0;
	}
	Students(String name,int a,double b){
		this.name=name;
		cgpa=b;
		priority = a;
	}
	void ShowData() {
		System.out.println("Name : "+name+" CGPA : "+cgpa+"Pri : "+priority);
	}
	void ShowNames() {
		System.out.println(name);
	}
}
public class UpGradAssignment {
    
	/*
	 * ENTER John 3.75 50
    ENTER Mark 3.8 24
    ENTER Shafaet 3.7 35
    SERVED
    SERVED
    ENTER Samiha 3.85 36
    SERVED
    ENTER Ashley 3.9 42 
    ENTER Maria 3.6 46
    ENTER Anik 3.95 49
    ENTER Dan 3.95 50
    SERVED
	*/
	
	public static void main(String[] args) {
		int choice=0,i=0;
		String input = new String();
		Scanner Sc = new Scanner(System.in);
        Comparator<Students> idComparator = new Comparator<Students>(){
        	
        	@Override
			public int compare(Students c1, Students c2) {
				if(c1.priority==c2.priority) {
					
				}
				if(c1.cgpa==c2.cgpa) {
					if(c1.name.compareTo(c2.name)>0) {
						return 1;
					}
					else if(c1.name.compareTo(c2.name)<0) {
						return -1;
					}
					else {
						if(c1.priority>c2.priority) {
							return 1;}
						if(c1.priority<c2.priority) {
							return -1;}
					}
					//return 0;
				}
                else if(c1.cgpa>c2.cgpa) {
                	return -1;
				}
                else if(c1.cgpa<c2.cgpa) {
                	return 1;
				}
				return 0;
	        }
		};
		// FIXING IT TO MAXIMUM OF 50 STUDENTS
		PriorityQueue<Students> pQueue = new PriorityQueue<Students>(50,idComparator); 
		//pQueue.peek().ShowData();
		System.out.print("Enter the number of Iterations : ");
		choice = Sc.nextInt();
		do {
			input=Sc.nextLine(); 
			ParseAndDo(pQueue,input);			
			//System.out.println();
            i++;

	}while(i<=choice);
			while(!pQueue.isEmpty()) {
			pQueue.poll().ShowNames();
			}
	}
	    private static void ParseAndDo(PriorityQueue<Students> pQueue, String input) {
		// TODO Auto-generated method stub
		String S = "",Name="",cgpas="",prioritys = "";
		int n=0,PRI;
		double CGPA=0.0;
		if(input.contains("ENTER")||input.contains("Enter")||input.contains("enter")){
			//INPUT
		    S=input.substring(6);
		    n = S.indexOf(" ");
		    Name = S.substring(0,n);
		    S=S.substring(n+1);
		    n = S.indexOf(" ");
		    cgpas=S.substring(0,n);
		    prioritys=S.substring(n+1);
		    if(prioritys.charAt(prioritys.length()-1)==' ') {
			   prioritys.charAt(prioritys.length()-1);
			   prioritys=prioritys.substring(0,prioritys.length()-1);
			}
		    PRI = Integer.parseInt(prioritys);
		    CGPA = Double.parseDouble(cgpas);
		    // NEW OBJECT
		    Students S1 = new Students(Name,PRI,CGPA);
		    pQueue.add(S1);
		 }
		else if(input.contains("SERVED")||input.contains("Served")||input.contains("served")){
				if(pQueue.isEmpty()) {
					System.out.println("EMPTY QUEUE");
				}
				else {
					//pQueue.poll().ShowNames();
					pQueue.poll();
				}
		}
	}
}
