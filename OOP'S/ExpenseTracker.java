import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ExpenseTracker extends Frame {
    private List expenseList;
    private TextField amountField, descField;
    private Button addButton, saveButton, loadButton;
    private ArrayList<String> expenses = new ArrayList<>();

    public ExpenseTracker() {
        setTitle("Expense Tracker");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new Label("Amount:"));
        amountField = new TextField(10);
        add(amountField);

        add(new Label("Description:"));
        descField = new TextField(10);
        add(descField);

        addButton = new Button("Add Expense");
        add(addButton);
        saveButton = new Button("Save Expenses");
        add(saveButton);
        loadButton = new Button("Load Expenses");
        add(loadButton);

        expenseList = new List(10);
        add(expenseList);

        addButton.addActionListener(e -> addExpense());
        saveButton.addActionListener(e -> saveExpenses());
        loadButton.addActionListener(e -> loadExpenses());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    private void addExpense() {
        String expense = amountField.getText() + " - " + descField.getText();
        expenses.add(expense);
        expenseList.add(expense);
        amountField.setText("");
        descField.setText("");
    }

    private void saveExpenses() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("expenses.txt"))) {
            for (String expense : expenses) {
                writer.println(expense);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadExpenses() {
        expenses.clear();
        expenseList.removeAll();
        try (BufferedReader reader = new BufferedReader(new FileReader("expenses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                expenses.add(line);
                expenseList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExpenseTracker();
    }
}