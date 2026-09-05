package MultilevelInheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        SeniorDeveloper sd = new SeniorDeveloper();
        sd.setName("Deepika");
        sd.setEmployeeId(5001);
        sd.setProgrammingLanguage("Java");
        sd.setExperience(8);

        sd.displayEmployeeDetails();
        sd.displayDeveloperDetails();
        sd.displaySeniorDetails();
    }
}