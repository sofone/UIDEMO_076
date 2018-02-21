package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class studentData {
    private final StringProperty ID;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty email;
    private final StringProperty DOB;

    //constructor


    public studentData(String ID,
                       String firstName,
                       String lastName,
                       String email,
                       String DOB) {
        this.ID = new SimpleStringProperty(ID);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
        this.DOB = new SimpleStringProperty(DOB);
    }
    //getter and setter methods
}//class
