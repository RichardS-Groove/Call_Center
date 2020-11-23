package interfazUX;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CreateAccount extends JFrame {


    private JPanel contentPane;
    private JTextField txt_create_Username;
    private JTextField txtPass;
    private JTextField txt_create_name;
    private JTextField txt_create_lastname;
    private JTextField textField_3;
    private JTextField txt_create_password;
    private JTextField txtRepeatpassword;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreateAccount frame = new CreateAccount();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public CreateAccount() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 520, 570);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 504, 531);
        contentPane.add(panel);
        panel.setLayout(null);

        URL url_create = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=247&OriginRecordName=DocumentLink&OriginId=Voucher&ts=3cec07e9ba5f5bb252d13f5f431e4bbb");
        Image image_create = ImageIO.read(url_create);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(image_create));
        lblNewLabel.setBounds(175, 0, 173, 100);
        panel.add(lblNewLabel);

        txt_create_Username = new JTextField();
        txt_create_Username.setToolTipText("");
        txt_create_Username.setText("    Username");
        txt_create_Username.setBounds(145, 140, 259, 47);
        panel.add(txt_create_Username);
        txt_create_Username.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("CREATE ACCOUNT");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(128, 128, 128));
        lblNewLabel_1.setFont(new Font("Calisto MT", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(160, 98, 202, 47);
        panel.add(lblNewLabel_1);

        URL url_create1 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=243&OriginRecordName=DocumentLink&OriginId=Voucher&ts=cb70ab375662576bd1ac5aaf16b3fca4");
        Image image_create1 = ImageIO.read(url_create1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBackground(Color.WHITE);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setIcon(new ImageIcon(image_create1));
        lblNewLabel_2.setBounds(103, 141, 43, 46);
        panel.add(lblNewLabel_2);

        txtPass = new JTextField();
        txtPass.setBackground(Color.WHITE);
        txtPass.setEnabled(false);
        txtPass.setToolTipText("");
        txtPass.setBounds(103, 140, 43, 47);
        panel.add(txtPass);
        txtPass.setColumns(10);

        URL url_create2 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=244&OriginRecordName=DocumentLink&OriginId=Voucher&ts=9188905e74c28e489b44e954ec0b9bca");
        Image image_create2 = ImageIO.read(url_create2);


        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setIcon(new ImageIcon(image_create2));
        lblNewLabel_3.setBounds(103, 311, 43, 47);
        panel.add(lblNewLabel_3);

        txt_create_name = new JTextField();
        txt_create_name.setText("    Name");
        txt_create_name.setColumns(10);
        txt_create_name.setBounds(145, 195, 259, 47);
        panel.add(txt_create_name);

        Button button_createuser = new Button("CREATE USER");
        button_createuser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        button_createuser.setFont(new Font("Calisto MT", Font.BOLD, 14));
        button_createuser.setBackground(new Color(102, 204, 204));
        button_createuser.setBounds(103, 429, 146, 60);
        panel.add(button_createuser);

        Button button_cancel = new Button("CANCEL");
        button_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        button_cancel.setFont(new Font("Calisto MT", Font.BOLD, 14));
        button_cancel.setBackground(new Color(102, 204, 204));
        button_cancel.setBounds(263, 429, 141, 60);
        panel.add(button_cancel);

        txt_create_lastname = new JTextField();
        txt_create_lastname.setToolTipText("");
        txt_create_lastname.setText("    Lastname");
        txt_create_lastname.setColumns(10);
        txt_create_lastname.setBounds(145, 253, 259, 47);
        panel.add(txt_create_lastname);

        textField_3 = new JTextField();
        textField_3.setBackground(Color.WHITE);
        textField_3.setEnabled(false);
        textField_3.setColumns(10);
        textField_3.setBounds(103, 311, 43, 47);
        panel.add(textField_3);

        txt_create_password = new JTextField();
        txt_create_password.setText("    Password");
        txt_create_password.setColumns(10);
        txt_create_password.setBounds(145, 311, 259, 47);
        panel.add(txt_create_password);

        txtRepeatpassword = new JTextField();
        txtRepeatpassword.setText("    Repeatpassword");
        txtRepeatpassword.setColumns(10);
        txtRepeatpassword.setBounds(145, 366, 259, 47);
        panel.add(txtRepeatpassword);

        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setBackground(Color.WHITE);
        lblNewLabel_4.setBounds(103, 198, 43, 46);
        panel.add(lblNewLabel_4);

        URL url_create3 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=248&OriginRecordName=DocumentLink&OriginId=Voucher&ts=621bf66ddb7c962aa0d22ac97d69b793");
        Image image_create3 = ImageIO.read(url_create3);

        lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(image_create3));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setBackground(Color.WHITE);
        lblNewLabel_5.setBounds(103, 196, 43, 46);
        panel.add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(image_create2));
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setBounds(103, 366, 43, 47);
        panel.add(lblNewLabel_6);

        lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon(image_create3));
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setBackground(Color.WHITE);
        lblNewLabel_7.setBounds(103, 253, 43, 46);
        panel.add(lblNewLabel_7);

        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setEditable(false);
        textField.setBounds(103, 195, 43, 47);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBackground(Color.WHITE);
        textField_1.setEditable(false);
        textField_1.setColumns(10);
        textField_1.setBounds(103, 253, 43, 47);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setBackground(Color.WHITE);
        textField_2.setEditable(false);
        textField_2.setColumns(10);
        textField_2.setBounds(103, 366, 43, 47);
        panel.add(textField_2);
    }
}
