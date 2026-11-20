
public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            CalculatorApp app = new CalculatorApp();
            app.createAndShowGUI();
        });

    }
}
