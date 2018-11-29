
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {
    public static int W= 500;
    public static int H = 400;
    JFrame f;
    Container content;
    JTextField a,b;
    TextArea x;
    Label l1,l2;
    Panel p1,p2,p3,p4,p5,p6;
    Button b1,b2;
    //Menu MainC,Converted;
    //MenuItem USD,Baht,Dong,Rupee,Ring;
    
    public static void main(String[] args){
        double output,input,Usd,B,D,rupee,ring;
        String outputType,Type;
        Converter GUI = new Converter();
        GUI.ui();   
    }
     
    void ui(){
        String[] CurrencyType = {"Euro","USD","Baht","Dong","Rupee","Ringgit"};
        
        f = new JFrame("Currency Converter");
        JComboBox Clist = new JComboBox(CurrencyType);
        JComboBox Clist2 = new JComboBox(CurrencyType);
        Clist.setSelectedItem(null);
        Clist2.setSelectedItem(null);
        f.setSize(W,H);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = f.getContentPane();
        content.setLayout(new GridLayout(3,2));
        p1 = new Panel();
        //p1.setLayout(new GridLayout (1,3));
        p2 = new Panel();
        //p2.setLayout(new GridLayout(1,3));
        p3 = new Panel();
        //p3.setLayout(new GridLayout(1,2));
        b1 = new Button("Convert");
        b2 = new Button("reset");
        p4 = new Panel();
        //p4.setLayout(new BorderLayout());
        p5 = new Panel();
        //p5.setLayout(new GridLayout(3,1));
        p6 = new Panel();
       
        l1=new Label("              Input Currency Type");
        l2=new Label("              Output Currency Type");
        a =new JTextField(18);
        a.setText("0");
        b =new JTextField(18);
        b.setEditable(false);
        b.setText("0");
        p1.add(l1);
        p2.add(l2);
        p3.add(Clist);
        p3.add(a);
        p4.add(Clist2);
        p4.add(b);
        
        p5.add(b1);
        p6.add(b2);
        
        
        
        content.add(p1);
        content.add(p2);
        content.add(p3);
        content.add(p4);
        content.add(p5);
        content.add(p6);
        b1.addActionListener ((ActionEvent e) -> {
            String value=(String)Clist.getSelectedItem();
            String Type = value;
            String value2=(String)Clist2.getSelectedItem();
            String outputType = value2;
            double output=0;
            double input = Double.parseDouble(a.getText());
            
            if (Type == ("Euro")){
                if (outputType == "USD")
                    output=input*1.13;
                else if (outputType == "Baht")
                    output=input*37.52;
                else if (outputType == "Dong")
                    output=input*26512.02;
                else if (outputType == "Rupee")
                    output=input*80.16;
                else if (outputType == "Ringgit")
                    output=input*4.76;
            }
            else if  (Type == ("USD")){
                if (outputType == "Euro")
                    output=input*0.88;
                else if (outputType == "Baht")
                    output=input*33.08;
                else if (outputType == "Dong")
                    output=input*23374.05;
                else if (outputType == "Rupee")
                    output=input*70.68;
                else if (outputType == "Ringgit")
                    output=input*4.20;
            }
            else if  (Type == ("Baht")){
                if (outputType == "USD")
                    output=input*0.030;
                else if (outputType == "Euro")
                    output=input*0.027;
                else if (outputType == "Dong")
                    output=input*707.01;
                else if (outputType == "Rupee")
                    output=input*2.14;
                else if (outputType == "Ringgit")
                    output=input*0.13;
            }
            else if  (Type == ("Dong")){
                if (outputType == "USD")
                    output=input*0.000043;
                else if (outputType == "Baht")
                    output=input*0.0014;
                else if (outputType == "Euro")
                    output=input*0.000038;
                else if (outputType == "Rupee")
                    output=input*0.0030;
                else if (outputType == "Ringgit")
                    output=input*0.00018;
            }
            else if  (Type == ("Rupee")){
                if (outputType == "USD")
                    output=input*0.014;
                else if (outputType == "Baht")
                    output=input*0.47;
                else if (outputType == "Dong")
                    output=input*330.72;
                else if (outputType == "Euro")
                    output=input*0.012;
                else if (outputType == "Ringgit")
                    output=input*0.059;
            }
            else if  (Type == ("Ringgit")){
                if (outputType == "USD")
                    output=input*0.24;
                else if (outputType == "Baht")
                    output=input*7.88;
                else if (outputType == "Dong")
                    output=input*5568.63;
                else if (outputType == "Rupee")
                    output=input*16.84;
                else if (outputType == "Euro")
                    output=input*0.21;
            }
            else
                output = 0;
            
            
            
            System.out.println(output); 
            b.setText(String.valueOf(output));
        });
        b2.addActionListener((ActionEvent e) -> {
            a.setText("0");
            b.setText("0");
            Clist.setSelectedItem(null);
            Clist2.setSelectedItem(null);
        
    
    
    
        
     });
        content.setVisible(true);
        f.show();
    }
        

        
        
        
        
         
        
}

