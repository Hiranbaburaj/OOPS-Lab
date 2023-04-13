public class person {
    String name,gender,address;
    int age;

    public person(String n, String g, String ad, int ag){
        name    = n;
        gender  = g;
        address = ad;
        age     = ag;
    }
}

class employee extends person{
    int id, salary;
    String company, qualification;

    public employee(String n, String g, String ad, int ag, int i, int s, String comp, String qual){
        super(n, g, ad, ag);
        id             =  i;
        salary         =  s;
        company        =  comp;
        qualification  =  qual;
    }
}

class teacher extends employee{
    String department, subject;

    public teacher(String n, String g, String ad, int ag, int i, int s, String comp, String qual, String dep, String sub){
        super(n, g, ad, ag, i, s, comp, qual);
        department = dep;
        subject    = sub;
    }

    public void display(){
        System.out.println("Name:         " + name);
        System.out.println("Gender:       " + gender);
        System.out.println("Age:          " + age);
        System.out.println("ID:           " + id);
        System.out.println("Qualification:" + qualification); 
        System.out.println("Salary:       " + salary + "Rs."); 
        System.out.println("Address:      " + address); 
        System.out.println("College:      " + company);        
        System.out.println("Department:   " + department);
        System.out.println("Subject:      " + subject);      
        System.out.println();
    }
}

class Main{
    public static void main(String[] args){
        teacher[] arr;
        arr = new teacher[5];
        arr[0] = new teacher("Nandan", "Male", "Kattakada", 31, 7634, 41000, "SCT College Of Engineering", "Civil", "", null)
    }
}
