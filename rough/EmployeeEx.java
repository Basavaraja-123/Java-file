class Employee{
    int id;
    String name;
    double salary;
 void empDetails(int i,String n,double s){
    id=i;
    name=n;
    salary=s;
 }
 void displyEmpDetails(){ System.out.println(id+" "+name+" "+salary);
 }

}


class EmployeeEx{
    public static void main(String args[]){
        Employee e1= new Employee();
        Employee e2= new Employee();
        
        e1.empDetails(1001,"Basavaraj",70500.00);
        e2.empDetails(2002,"chali",75000.00);
        e1.displyEmpDetails();
        e2.displyEmpDetails();

    }
}
