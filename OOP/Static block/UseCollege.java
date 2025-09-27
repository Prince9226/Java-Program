class College {
    
    String name;
    int roll_no;
    static String clg_name;

    // static block

    static{
        clg_name="C.M.P Degree College";
        System.out.println(" Static Block executed :College Name initilized to " + clg_name);
    }

    // constructer
    College(String m, int n){
        name=m;
        roll_no=n;
    }


    void display(){
        System.out.println(" Name :" + name + "Roll Number :" + roll_no);
    }

    static void showCollege(){
        System.out.println("All college nmae : " + clg_name );
    }


}
public class UseCollege{
    public static void main(String[] args) {
        College c1= new College("Prince Yadav ", 1);
        College c2= new College("Ajay ", 101);

        c1.display();
        c2.display();

        College.showCollege();

    }
}