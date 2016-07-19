package com.company;

import com.company.guidemo.dlgDemo;
import com.company.guidemo.fmMain;

import javax.swing.*;

import java.awt.*;

import static javax.print.attribute.standard.MediaSizeName.D;

public class Main {

    public static void main(String[] args) {
//        fmMain
        System.out.println("Hello Word!");
//        fm1 = new fmMain();
//        fm1.
        dlgDemo d1 = new dlgDemo();

//        d1.setModal(true);
        d1.setTitle("测试用例");
//        d1.setSize( );
        d1.pack();
        d1.setSize(new Dimension(450,500));
        d1.setLocationRelativeTo(null);
        d1.setVisible(true);
        System.exit(0);
//        return;
        /**
        JOptionPane.showConfirmDialog(null, "choose one", "choose one", JOptionPane.YES_NO_OPTION);
        Object[] options = {"确定","取消","帮助"};

        int response=JOptionPane.showOptionDialog(null, "这是个选项对话框，用户可以选择自己的按钮的个数", "选项对话框标题",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
//        if(response==0)
//        { this.setTitle("您按下了第OK按钮 ");
//        }
//        else if(response==1)
//        { this.setTitle("您按下了第Cancel按钮 ");
//        }
//        else if(response==2)
//        { this.setTitle("您按下了第Help按钮 ");
//        }
        String inputValue = JOptionPane.showInputDialog("Please input a value");
        Object[] possibleValues = { "First", "Second", "Third" }; //用户的选择项目
        Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
//        setTitle("您按下了"+(String)selectedValue+"项目");

        JOptionPane.showMessageDialog(null, "在对话框内显示的描述性的文字"+"您按下了"+(String)selectedValue+"项目", "标题条文字串"+inputValue, JOptionPane.ERROR_MESSAGE);
	// write your code here
         */
    }
}
