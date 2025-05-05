import javax.swing.*;
public class PeterAlert {
    public static void main(String[] args) throws Exception {
        ImageIcon peter = new ImageIcon("peterAlert/peterGriffin.png");
        JOptionPane.showMessageDialog(null, peter, "Peter Alert", JOptionPane.PLAIN_MESSAGE);
    }
}