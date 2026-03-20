public class Main {
    public static void main(String[] args) {
        // 1. Initialize our mock database
        LabDatabase database = new LabDatabase();

        // 2. Initialize the View
        LoginView loginView = new LoginView();

        // 3. Connect them with the Controller
        LoginController controller = new LoginController(loginView, database);

        // 4. Show the GUI!
        loginView.setVisible(true);
    }
}