package src;

import javax.swing.*;
import java.awt.*;

public class funeralDetails extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField addDeceasedID;
    private JTextField addDeceasedInfo;
    private JTextField addPesel;
    private JTextField textField7;
    private JComboBox service1;
    private JComboBox service2;
    private JComboBox service3;
    private JComboBox service4;
    private JComboBox service5;
    private JComboBox service6;
    private JComboBox service7;
    private JLabel serviceList;
    private JLabel funeralID;
    private JLabel funeralDate;
    private JLabel transportID;
    private JLabel deceasedID;
    private JLabel deceasedInfo;
    private JLabel nameAndSurname;
    private JLabel pesel;
    private JTextField addGraveyardName;
    private JTextField addTown;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField8;
    private JTextField textField9;
    private JButton saveOrder;
    private JTextField aServicePrice;
    private JTextField SummPrice;
    private JLabel plecaOfBurial;
    private JLabel graveyardName;
    private JLabel town;
    private JLabel alley;
    private JLabel sector;
    private JLabel number;
    private JLabel communal;
    private JLabel summaryPrice;
    private JLabel startPrice;
    private JLabel startPrice1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;


    public funeralDetails() throws HeadlessException {
        this.setTitle("Dodawanie pogrzebu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
