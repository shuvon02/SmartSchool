package SSS;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        Teacher shisir = new Teacher(1, "shisir", 500);
        Teacher sultan = new Teacher(2, "sultan", 700);
        Teacher mehedi = new Teacher(3, "mehedi", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(shisir);
        teacherList.add(sultan);
        teacherList.add(mehedi);


        Student shuvon = new Student(1, "shuvon", 4);
        Student sagor = new Student(2, "sagor", 12);
        Student ruhan = new Student(3, "ruhan", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(shuvon);
        studentList.add(sagor);
        studentList.add(ruhan);


        School AGHS = new School(teacherList, studentList);

        Teacher mahfuz = new Teacher(6, "mahfuz", 900);


        AGHS.addTeacher(mahfuz);


        shuvon.payFees(5000);
        sagor.payFees(6000);
        System.out.println("AGHS has earned $" + AGHS.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        shisir.receivSalary(shisir.getSalary());
        System.out.println("AGHS has spent for salary to " + shisir.getName()
                + " and now has $" + AGHS.getTotalMoneyEarned());

        mehedi.receivSalary(mehedi.getSalary());
        System.out.println("AGHS has spent for salary to " + mehedi.getName()
                + " and now has $" + AGHS.getTotalMoneyEarned());


        System.out.println(shuvon);

        mahfuz.receivSalary(mahfuz.getSalary());

        System.out.println(mahfuz);
    }
}
