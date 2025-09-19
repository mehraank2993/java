package assignment2;
class Patient {

    private final String id;
    private String name;
    private String disease;

    public Patient(String id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient [ID=" + id + ", Name=" + name + ", Disease=" + disease + "]";
    }
public class  Q10{
    public static void main(String[] args) {
        Patient patient1 = new Patient("1", "mk", "Fever");

        System.out.println("Initial Patient details: " + patient1);

        patient1.setName("km");
        patient1.setDisease("Common Cold");

        System.out.println("\nUpdated Patient details: " + patient1);
        System.out.println("New Name: " + patient1.getName());
        System.out.println("New Disease: " + patient1.getDisease());
    }
}
}