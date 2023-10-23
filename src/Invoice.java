import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Invoice extends JFrame
{
    JPanel mainPnl;
    JPanel controlPnl;
    JPanel invoiceDisplayPnl;
    JPanel dataEntryPnl;
    JButton quitBtn;
    JButton submitBtn;
    JButton clearBtn;
    JButton addBtn;
    JScrollPane scroller;
    //Textfield Areas to enter data
    JTextArea itemTA;
    JTextArea qtyTA;
    JTextArea priceTA;
    JTextArea customerNameTA;
    JTextArea streetAddressTA;
    JTextArea stateTA;
    JTextArea zipCodeTA;

    JTextField itemTF;
    JTextField qtyTF;
    JTextField priceTF;
    JTextField customerNameTF;
    JTextField streetAddressTF;
    JTextField stateTF;
    JTextField zipCodeTF;

    public Invoice()
    {
//        mainPnl = new JPanel();
//        mainPnl.setLayout(new GridLayout(1, 2));
//        mainPnl.setLayout(new BorderLayout());
//
//        createInvoiceDisplayPnl();
//        mainPnl.add(invoiceDisplayPnl, BorderLayout.WEST);
//        setVisible(true);
//
//        createDataEntryPnl();
//        mainPnl.add(dataEntryPnl, BorderLayout.EAST);
//        setVisible(true);
//
//        createControlPanel();
//        mainPnl.add(controlPnl, BorderLayout.SOUTH);
//
//        add(mainPnl);
//        setSize(800, 600);
//        setTitle("Product Invoice");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createDataEntryPnl();
        mainPnl.add(dataEntryPnl, BorderLayout.WEST);

        createInvoiceDisplayPnl();
        mainPnl.add(invoiceDisplayPnl, BorderLayout.CENTER);

        createControlPanel();
        mainPnl.add(controlPnl, BorderLayout.SOUTH);

        add(mainPnl);
        setSize(800, 600);
        setTitle("Product Invoice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createControlPanel()
    {
        controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1,3));
        quitBtn = new JButton("Quit");
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear Form");

        controlPnl.add(quitBtn);
        controlPnl.add(submitBtn);
        controlPnl.add(clearBtn);

        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        clearBtn.addActionListener((ActionEvent ae) ->
        {
            itemTF.setText("");
            qtyTF.setText("");
            priceTF.setText("");
            customerNameTF.setText("");
            streetAddressTF.setText("");
            stateTF.setText("");
            zipCodeTF.setText("");
            //receiptTA.setText("");
        });

        submitBtn.addActionListener((ActionEvent ae) -> //write everything to console or text area
        {
            String item = itemTF.getText();
            String qty = qtyTF.getText();
            String price = priceTF.getText();
            String customerName = customerNameTF.getText();
            String streetAddress = streetAddressTF.getText();
            String state = stateTF.getText();
            String zipCode = zipCodeTF.getText();
        });
    }

    private void createDataEntryPnl()
    {
//        dataEntryPnl = new JPanel();
//        dataEntryPnl.setLayout((new GridLayout()));
//        itemTA = new JTextArea(1,30);
//            dataEntryPnl.add(itemTA);
//        priceTA = new JTextArea(1, 30 );
//            dataEntryPnl.add(priceTA);
//        customerNameTA = new JTextArea(1, 30 );
//            dataEntryPnl.add(customerNameTA);
//        streetAddressTA = new JTextArea(1, 30 );
//            dataEntryPnl.add(streetAddressTA);
//        stateTA = new JTextArea(1, 30 );
//            dataEntryPnl.add(stateTA);
//        zipCodeTA = new JTextArea(1, 30 );
//            dataEntryPnl.add(zipCodeTA);
        dataEntryPnl = new JPanel();
        dataEntryPnl.setLayout(new GridLayout(7, 2));

        itemTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Item"));
        dataEntryPnl.add(itemTF);

        qtyTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Quantity"));
        dataEntryPnl.add(qtyTF);

        priceTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Price"));
        dataEntryPnl.add(priceTF);

        customerNameTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Customer Name"));
        dataEntryPnl.add(customerNameTF);

        streetAddressTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Street Address"));
        dataEntryPnl.add(streetAddressTF);

        stateTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("State"));
        dataEntryPnl.add(stateTF);

        zipCodeTF = new JTextField(10);
        dataEntryPnl.add(new JLabel("Zip Code"));
        dataEntryPnl.add(zipCodeTF);
    }

    private void createInvoiceDisplayPnl()
    {
        invoiceDisplayPnl = new JPanel();
        invoiceDisplayPnl.setLayout(new BorderLayout());


    }



}
