package interfazUX;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class TableProduct extends JFrame {


    private JPanel contentPane;
    private JTextField product_name;
    private JTextField product_lastname;
    private JTextField product_phone;
    private JTextField product_company;
    private JTextField product_raeson;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TableProduct frame = new TableProduct();
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
    public TableProduct() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 760);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 784, 721);
        contentPane.add(panel);
        panel.setLayout(null);

        URL url_product = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=253&OriginRecordName=DocumentLink&OriginId=Voucher&ts=c24cd76e1ce41366a4bbe8a49b02a028");
        Image image_product = ImageIO.read(url_product);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(534, 97, 202, 204);
        lblNewLabel.setIcon(new ImageIcon(image_product));
        panel.add(lblNewLabel);

        URL url_product1 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=252&OriginRecordName=DocumentLink&OriginId=Voucher&ts=03c6b06952c750899bb03d998e631860");
        Image image_product1 = ImageIO.read(url_product1);

        JLabel lblNewLabel_1 = new JLabel("People to Call");
        lblNewLabel_1.setIcon(new ImageIcon(image_product1));
        lblNewLabel_1.setFont(new Font("Calisto MT", Font.BOLD, 30));
        lblNewLabel_1.setBounds(269, 29, 202, 51);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Name: ");
        lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD, 16));
        lblNewLabel_2.setBounds(46, 110, 91, 32);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Last Name: ");
        lblNewLabel_2_1.setFont(new Font("Calisto MT", Font.BOLD, 16));
        lblNewLabel_2_1.setBounds(46, 153, 91, 32);
        panel.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_1_1 = new JLabel("Phone: ");
        lblNewLabel_2_1_1.setFont(new Font("Calisto MT", Font.BOLD, 16));
        lblNewLabel_2_1_1.setBounds(46, 196, 91, 32);
        panel.add(lblNewLabel_2_1_1);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("Company: ");
        lblNewLabel_2_1_1_1.setFont(new Font("Calisto MT", Font.BOLD, 16));
        lblNewLabel_2_1_1_1.setBounds(46, 239, 91, 32);
        panel.add(lblNewLabel_2_1_1_1);

        JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Reason:");
        lblNewLabel_2_1_1_1_1.setFont(new Font("Calisto MT", Font.BOLD, 16));
        lblNewLabel_2_1_1_1_1.setBounds(46, 282, 91, 32);
        panel.add(lblNewLabel_2_1_1_1_1);

        product_name = new JTextField();
        product_name.setText("");
        product_name.setToolTipText("Enter your name");
        product_name.setBounds(202, 110, 186, 32);
        panel.add(product_name);
        product_name.setColumns(10);

        product_lastname = new JTextField();
        product_lastname.setText("");
        product_lastname.setToolTipText("Enter your lastname");
        product_lastname.setColumns(10);
        product_lastname.setBounds(202, 153, 186, 32);
        panel.add(product_lastname);

        product_phone = new JTextField();
        product_phone.setText("");
        product_phone.setToolTipText("Enter your Phone");
        product_phone.setColumns(10);
        product_phone.setBounds(202, 196, 186, 32);
        panel.add(product_phone);

        product_company = new JTextField();
        product_company.setText("");
        product_company.setToolTipText("Enter your company");
        product_company.setColumns(10);
        product_company.setBounds(202, 239, 186, 32);
        panel.add(product_company);

        product_raeson = new JTextField();
        product_raeson.setText("");
        product_raeson.setToolTipText("Enter your raeson");
        product_raeson.setColumns(10);
        product_raeson.setBounds(202, 282, 269, 32);
        panel.add(product_raeson);

        URL url_product2 = new URL("https://datobox.oppen.io/oo/api/get_attached_file?id=251&OriginRecordName=DocumentLink&OriginId=Voucher&ts=19f3cd308f1455b3fa09a282e0d496f4");
        Image image_product2 = ImageIO.read(url_product2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(image_product2));
        lblNewLabel_3.setBounds(161, 0, 100, 99);
        panel.add(lblNewLabel_3);

        JButton btnSaveSession = new JButton("Save Session");
        btnSaveSession.setBounds(46, 338, 127, 23);
        panel.add(btnSaveSession);

        JButton btnRemove = new JButton("Remove");
        btnRemove.setBackground(Color.RED);
        btnRemove.setBounds(647, 338, 89, 23);
        panel.add(btnRemove);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(548, 338, 89, 23);
        panel.add(btnAdd);

        JButton btnLoadSession = new JButton("Load Session");
        btnLoadSession.setBounds(183, 338, 127, 23);
        panel.add(btnLoadSession);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(46, 382, 690, 306);
        panel.add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "Name", "Last Name", "Phone", "Company", "Raeson"
                }
        ));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setColumnHeaderView(table); // --> Añadi esto
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setFocusable(false);
        table.setRowMargin(4);
        table.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(3050);
        }

    }
}
