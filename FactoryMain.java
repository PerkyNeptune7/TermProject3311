public class FactoryMain {

    public static void main(String[] args) {
System.out.println("--- Testing Factory Methods Isolated ---");

        UserFactory userFactory = new UserFactory();

        
         UserAccounts student = userFactory.createUser("Jack", "jack1234", "abced$21");
         System.out.println("Expected Type: Student");
         System.out.println("Actual Type: " + student.getAccountType());
         
        UserAccounts faculty = userFactory.createUser("Carla", "carla<3", "2gh2jk$5");
        System.out.println("Expected Type: Faculty");
        System.out.println("Actual Type: " + faculty.getAccountType());

        UserAccounts researcher = userFactory.createUser("Bobby", "bobster08", "tunjrm2(*");
        System.out.println("Expected Type: Researcher");
        System.out.println("Actual Type: " + researcher.getAccountType());

         UserAccounts guest = userFactory.createUser("Gillian", "gillian918&", "ngfvwje@4");
         System.out.println("Expected Type: Guest");
         System.out.println("Actual Type: " + guest.getAccountType());


         EquipmentFactory equipmentFactory = new EquipmentFactory();
         
        Equipment microscope = equipmentFactory.createEquipment("Microscope", "Optical Microscope", "Used for viewing small objects", "Lab A");
        System.out.println("Expected Type: Microscope");
        System.out.println("Actual Type: " + microscope.getEquipmentId());

        Equipment arduino = equipmentFactory.createEquipment("Arduino", "Arduino Uno", "Microcontroller board for prototyping", "Lab B");
        System.out.println("Expected Type: Arduino");
        System.out.println("Actual Type: " + arduino.getEquipmentId());
    }
        