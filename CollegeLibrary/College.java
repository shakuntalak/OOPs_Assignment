package CollegeLibrary;

import CollegeLibrary.dept.ArtsDept;
import CollegeLibrary.dept.EnggDept;
import CollegeLibrary.lib.Book;
import CollegeLibrary.lib.Furniture;
import CollegeLibrary.lib.Library;
import CollegeLibrary.lib.Staff;

public class College {

    public static void main(String[] args) {

        Book book1=new Book("16786",true,"John");
        Book book2=new Book("16786",true,"John");
        Book book3=new Book("16786",false,"John");
        Book book4=new Book("16786",false,"John");

        Furniture furniture=new Furniture("chair","Plastic");
        Furniture furniture1=new Furniture("sofa","Wooden");
        Furniture furniture2=new Furniture("chair","Iron");
        Furniture furniture3=new Furniture("chair","Metal");

        Staff staff=new Staff(45,"Sam","dev");
        Staff staff2=new Staff(38,"John","Fernand's");
        Staff staff3=new Staff(27,"dev","John");
        Staff staff4=new Staff(32,"Raj","Agarwal");

        Library library=new Library(book1,furniture,staff);
        Library library2=new Library(book2,furniture1,staff2);
        Library library3=new Library(book3,furniture2,staff3);
        Library library4=new Library(book4,furniture3,staff4);

        EnggDept engDept=new EnggDept(library);
        EnggDept engDept2=new EnggDept(library3);
        ArtsDept artsDept=new ArtsDept(library2);
        ArtsDept artsDept2=new ArtsDept(library4);

        System.out.println("Number of books available in college: ");
        book1.numberOfBooks();

        System.out.println("Number of books Rented : ");
        book1.rentedBooks();

        System.out.println("Total Number of chairs :");
        furniture.numberOfChair();

        System.out.println("Total Number of Staff: ");
        staff.staffCount();

        System.out.println("Eldest Staff Details: ");
        staff.getEldestStaff();

    }


}
