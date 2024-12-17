import javax.swing.JOptionPane;

public class SalaryDialog {

    public static  void main(String[] args){

        String wageString, dependentsString;
        double wage, weeklyPay, monthlyWage;
        int dependents;
        final int numWeeks = 4;
        final double HOURS_IN_WEEK = 37.5;
        wageString = JOptionPane.showInputDialog(null,
                "Enter employee's hourly wage", "SalaryDialog 1",
                JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
        dependentsString = JOptionPane.showInputDialog(null,
                "How many dependents?", "SalaryDialog 2",
                JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        JOptionPane.showMessageDialog(null, "Weekly salary is R" +
                weeklyPay + "\nDeductions will be made for " + dependents +
                " dependents");
        monthlyWage =  weeklyPay * numWeeks;
        JOptionPane.showMessageDialog(null, "" +
                "Your monthly salary is " + monthlyWage +
                " lucky!!");

    }
}
