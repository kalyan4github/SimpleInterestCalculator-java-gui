import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel1;
    private JLabel lblPrincipal;
    private JLabel lblRateOfInterest;
    private JLabel lblTime;
    private JTextField txtPrincipal;
    private JTextField txtRateOfInterest;
    private JTextField txtTime;
    private JButton btnCalculate;

//    private JLabel lblSimpleInterest = new JLabel();

    JFrame frame = new JFrame("Simple Calculator");


    Calculator(){
        this.lblPrincipal= new JLabel("Principal Amount");
        this.lblPrincipal.setBounds(20,50,100,20);
        this.txtPrincipal= new JTextField();
        this.txtPrincipal.setBounds(150,50,150,20);

        this.lblRateOfInterest= new JLabel("Rate of Interest");
        this.lblRateOfInterest.setBounds(20,80,100,20);
        this.txtRateOfInterest= new JTextField();
        this.txtRateOfInterest.setBounds(150,80,150,20);

        this.lblTime= new JLabel("Rate of Interest");
        this.lblTime.setBounds(20,110,100,20);
        this.txtTime= new JTextField();
        this.txtTime.setBounds(150,110,150,20);

        this.btnCalculate = new JButton("CALCULATE Simple Interest");
        this.btnCalculate.setBounds(50,180,250,50);
        this.btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int principle;
                double rateOfInterest, time,si;
                principle=Integer.parseInt(txtPrincipal.getText());
                rateOfInterest = Double.parseDouble(txtRateOfInterest.getText());
                time= Double.parseDouble(txtTime.getText());
                si=(principle*rateOfInterest*time)/100;
                JLabel lblSimpleInterest = new JLabel("Simple Interest - "+si);
                lblSimpleInterest.setBounds(10,10,150,20);
                JFrame newFrame= new JFrame("Result");
                newFrame.setBounds(200,200,200,100);
                newFrame.add(lblSimpleInterest);
                newFrame.setLayout(null);
                newFrame.setVisible(true);
            }
        });

        this.frame.add(lblPrincipal);
        this.frame.add(txtPrincipal);
        this.frame.add(lblRateOfInterest);
        this.frame.add(txtRateOfInterest);
        this.frame.add(lblTime);
        this.frame.add(txtTime);
        this.frame.add(btnCalculate);

        this.frame.setBounds(100,100,400,500);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
