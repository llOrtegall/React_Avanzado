import model.Doctor;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", "Ortega", 26, "example@gmail.com");

        User doctor = new Doctor("Sebastian", "Paloma", 54, "exampl2@gmail.com",
                "Neurosurgeon", "Cruz Verde");

        User patient = new Patient("andres", "aviatrix", 23, "example3@gmail.com", "O+", 1.56, 65.4);

    }
}