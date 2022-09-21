import javax.swing.JOptionPane;
class DialogViewering{
    public static void main(String[] args)
{
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        String hal = JOptionPane.showInputDialog("Hello " + name + "!" + " My name is Hal! What would you like me to do?");
        System.out.println(hal);
        JOptionPane.showMessageDialog(null,"I am sorry " + name + "," + " I am afraid I can't do that...");
    }  
}
