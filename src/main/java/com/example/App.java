package main.java.com.example;

public class App {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(App.class.getName());
        logger.info(String.valueOf(calc.calculate(10, 5, "add-again")));
        UserService service = new UserService();
        service.findUser("admin");
        service.deleteUser("admin"); // NEW dangerous call
    }
}
