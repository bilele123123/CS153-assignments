import javax.swing.JOptionPane;
class DialogViewers{
    public static void main(String[] args)
{
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }   
}