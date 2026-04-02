public class Main {
    public static void main(String[] args) {
        // 1. Initialize our mock database
        LabDatabase database = new LabDatabase();

        // 2. Initialize the Views
        LoginView userLoginView = new LoginView(false);
        LoginView backendLoginView = new LoginView(true);

        // 3. Connect them with the Controllers
        new LoginController(userLoginView, database);
        new LoginController(backendLoginView, database);

        // 4. Position and show both GUIs
        userLoginView.setLocation(200, 200);
        backendLoginView.setLocation(700, 200);
        userLoginView.setVisible(true);
        backendLoginView.setVisible(true);
    }
}
