
import javax.swing.*;
import java.awt.*;

public class CalculatorApp {

    public void createAndShowGUI() {

        JFrame frame = new JFrame("My Calculator");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel label1 = new JLabel("First Number:");
        JTextField num1 = new JTextField();

        JLabel label2 = new JLabel("Second Number:");
        JTextField num2 = new JTextField();

        JLabel operationLabel = new JLabel("Operation:");

        
        String[] operations = {"+", "-", "*", "/"};

        JComboBox<String> operation =
                new JComboBox<>(operations);

        JButton calculate = new JButton("Calculate");

        JLabel result = new JLabel("Result: ");

        frame.add(label1);
        frame.add(num1);

        frame.add(label2);
        frame.add(num2);

        frame.add(operationLabel);
        frame.add(operation);

        frame.add(calculate);
        frame.add(result);

        calculate.addActionListener(e -> {

            try {

                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());

                String op = (String) operation.getSelectedItem();

                double answer = Calculator.calculate(a, b, op);

                result.setText("Result: " + answer);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter valid numbers!"
                );

            } catch (ArithmeticException | IllegalArgumentException ex) {

                JOptionPane.showMessageDialog(
                        frame,
                        ex.getMessage()
                );
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
