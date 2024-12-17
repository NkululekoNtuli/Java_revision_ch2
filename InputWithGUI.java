import javax.swing.JOptionPane;

public class InputWithGUI {

    public static void main(String[] args){

        String name;
        name = JOptionPane.showInputDialog(null, "What is your name>> ");
        JOptionPane.showMessageDialog(null, "Hello " + name +
                " may you have a pleasant day.");
    }
}
