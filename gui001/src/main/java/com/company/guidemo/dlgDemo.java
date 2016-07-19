package com.company.guidemo;

import javax.swing.*;
import java.awt.event.*;

public class dlgDemo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton demoButton;

    public dlgDemo() {
        this.setLocationRelativeTo(null);
        setContentPane(contentPane);
        setModal(true);
//        this.setSize(400,800);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        demoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDemo();
            }
        });
    }
    private void onDemo(){
        JOptionPane.showMessageDialog(this,"demo OK!","",JOptionPane.INFORMATION_MESSAGE);
    }
    private void onOK() {
// add your code here
        String inputValue="";
        String contentValue="";
        contentValue = textArea1.getText();
        inputValue = textField1.getText();
        JOptionPane.showMessageDialog(this, contentValue, "标题:"+inputValue, JOptionPane.INFORMATION_MESSAGE);
//        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        dlgDemo dialog = new dlgDemo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
