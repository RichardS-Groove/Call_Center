package interfazUX;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsername;
    private JTextField txtPass;
    private JTextField txtPassword;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() throws IOException {
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

        URL url = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=242&OriginRecordName=DocumentLink&OriginId=Voucher&ts=e4a6222cdb5b34375400904f03d8e6a5");
        Image image = ImageIO.read(url);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(image));
        lblNewLabel.setBounds(173, 23, 173, 162);
        panel.add(lblNewLabel);

        txtUsername = new JTextField();
        txtUsername.setToolTipText("");
        txtUsername.setText("    Username");
        txtUsername.setBounds(145, 254, 259, 47);
        panel.add(txtUsername);
        txtUsername.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("MEMBER LOGIN");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(128, 128, 128));
        lblNewLabel_1.setFont(new Font("Calisto MT", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(173, 196, 173, 47);
        panel.add(lblNewLabel_1);

        URL url1 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=243&OriginRecordName=DocumentLink&OriginId=Voucher&ts=cb70ab375662576bd1ac5aaf16b3fca4");
        Image image1 = ImageIO.read(url1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBackground(Color.WHITE);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setIcon(new ImageIcon(image1));
        lblNewLabel_2.setBounds(103, 254, 43, 46);
        panel.add(lblNewLabel_2);

        txtPass = new JTextField();
        txtPass.setEnabled(false);
        txtPass.setToolTipText("");
        txtPass.setBounds(103, 254, 43, 47);
        panel.add(txtPass);
        txtPass.setColumns(10);

        URL url2 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=244&OriginRecordName=DocumentLink&OriginId=Voucher&ts=9188905e74c28e489b44e954ec0b9bca");
        Image image2 = ImageIO.read(url2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setIcon(new ImageIcon(image2));
        lblNewLabel_3.setBounds(103, 311, 43, 47);
        panel.add(lblNewLabel_3);

        txtPassword = new JTextField();
        txtPassword.setText("    Password");
        txtPassword.setColumns(10);
        txtPassword.setBounds(145, 312, 259, 47);
        panel.add(txtPassword);

        textField_2 = new JTextField();
        textField_2.setEnabled(false);
        textField_2.setBounds(103, 312, 43, 47);
        panel.add(textField_2);
        textField_2.setColumns(10);

        URL url3 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=246&OriginRecordName=DocumentLink&OriginId=Voucher&ts=38db3aed920cf82ab059bfccbd02be6a");
        Image image3 = ImageIO.read(url3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(image3));
        lblNewLabel_4.setBounds(103, 369, 20, 20);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Remenmber me");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(new Color(128, 128, 128));
        lblNewLabel_5.setFont(new Font("Constantia", Font.PLAIN, 12));
        lblNewLabel_5.setBounds(126, 369, 91, 20);
        panel.add(lblNewLabel_5);

        Button button_login = new Button("LOGIN");
        button_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        button_login.setFont(new Font("Calisto MT", Font.BOLD, 14));
        button_login.setBackground(new Color(102, 204, 204));
        button_login.setBounds(103, 415, 146, 60);
        panel.add(button_login);

        Button button_create_account = new Button("CREATE ACCOUNT");
        button_create_account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        button_create_account.setFont(new Font("Calisto MT", Font.BOLD, 14));
        button_create_account.setBackground(new Color(102, 204, 204));
        button_create_account.setBounds(263, 415, 141, 60);
        panel.add(button_create_account);
    }
}
