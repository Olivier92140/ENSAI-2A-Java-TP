package fr;

import fr.ensai.library.Item;
import fr.ensai.library.Student;
import java.util.Date;

public class Loan {
    
//Attributes
public Student student;
public Item item;
public Date startDate;
public Date returnDate;

//contructor
public Loan(Student student, Item item, Date startDate, Date returnDate){
    this.student = student;
    this.item = item;
    this.startDate = startDate;
    this.returnDate = null;
    }

public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

 @Override
    public String toString() {
        if (returnDate != null) {
            return "Item '" + this.item.getTitle() + "' borrowed by " + this.student;
        } else {
            return "Item '" + this.item.getTitle() + "' borrowed by " + this.student;
        }
    }
}