/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

/*<applet code="Restmenu" width=20000 height=500>
</applet>
*/ 
/**
 *
 * @author RJ
 */
public class Shopon  extends JApplet{
JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jlw1,jlw2,jlw3,jlw4,jlw5,jlw6,jli1,jli2,jli3,jli4,jli5,jli6,jli7,jli8,jdl1,jdl2;
ImageIcon ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii10;
JComboBox jcb,jcbm1,jcbm2,jcbm3,jcbm4,jcbm5,jcbm6,jcbw1,jcbw2,jcbw3,jcbw4;
JButton jb1,jb2,jb3,jb4,jb5;
JFrame frame1,frame2,frame3;
String cat[] = {"Men","Women"},size[]={"Size","S","M","L"},ms1,ms2,mp1,mp2,wd1,wd2,ws1,ws2,mss1,mss2,mps1,mps2,wds1,wds2,wss1,wss2,msq1,msq2,mpq1,mpq2,wdq1,wdq2,wsq1,wsq2;
int sel,tms1=0,tms2=0,tmp1=0,tmp2=0,twd1=0,twd2,tws1=0,tws2=0,total=0;
JTabbedPane jtp1,jtp2,jtp3;
JPanel jpm1,jpm2,jpm3;
JCheckBox jc1,jc2,jc3,jc4,jcw1,jcw2,jcw3,jcw4;
JRadioButton jrbm1,jrbm2,jrbm3,jrbm4,jrbm5,jrbm6,jrbm7,jrbm8,jrbw1,jrbw2,jrbw3,jrbw4,jrbw5,jrbw6,jrbw7,jrbw8;
    public void init(){
    try{
        SwingUtilities.invokeAndWait(new Runnable(){
        public void run(){
        makeGUI();}
        });
    }
    catch(Exception e){
        System.out.println("cant create because of" + e);
    }
}
private void makeGUI(){
setLayout(new FlowLayout());
jdl1 = new JLabel("*Your Order Has Been Successfully Placed*");
jdl2 = new JLabel("!!!!!Thank You For Choosing Us!!!!!");
frame1 = new JFrame("Men");
frame2 = new JFrame("Women");
frame3 = new JFrame("Cart");
jl1= new JLabel("**CARTFLIP**");
jl2= new JLabel("What Category Would You Like To Shop In?");
jcb = new JComboBox(cat);
jb1 = new JButton("DIVE IN");
jb1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae){
            
            sel = jcb.getSelectedIndex();
if(sel == 0){frame1.setSize(1050,400);
frame1.setLayout(new FlowLayout());

frame1.setVisible(true);}
else if(sel == 1){frame2.setSize(1050,400);
frame2.setLayout(new FlowLayout());
            frame2.setVisible(true);}
}});
jl3= new JLabel("*****************MENS COLLECTION*****************");
frame1.add(jl3);
jtp1 = new JTabbedPane();
jtp1.addTab("Shirts", new mshirt());
jtp1.addTab("Pants",new mpants());
frame1.add(jtp1);
jb3 = new JButton("Done");
jb3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
if(jli1.getText() == "" &&jli2.getText() == "" &&jli3.getText() == "" &&jli4.getText() == "" &&jli5.getText() == "" &&jli6.getText() == "" &&jli7.getText() == "" &&jli8.getText() == ""){
jli1.setText("Your Cart is Empty!!");}
frame1.dispose();
if(ms1 =="Blue Shirt   $15" ){jli1.setText("                    "+ms1+"      "+msq1+"      "+mss1+"      $"+tms1+"                    ");}
else{jli1.setText("");}
if(ms2 =="Yellow T-Shirt   $10" ){jli2.setText("                    "+ms2+"    "+msq2+"    "+mss2+"      $"+tms2+"                    ");}
else{total-=tms2;
jli2.setText("");}
if(mp1 =="Blue Jeans   $40"){jli3.setText("                    "+mp1+"    "+mpq1+"    "+mps1+"      $"+tmp1+"                    ");}
else{jli3.setText("");}
if(mp2 =="Black Pant   $30" ){jli4.setText("                    "+mp2+"    "+mpq2+"    "+mps2+"      $"+tmp2+"                    ");}
else{jli4.setText("");}
}});
frame1.add(jb3);
jlw1= new JLabel("*****************WOMENS COLLECTION*****************");
frame2.add(jlw1);
jtp2 = new JTabbedPane();
jtp2.addTab("Skirts", new wdress());
jtp2.addTab("Sarees",new wsaree());
frame2.add(jtp2);
jb4 = new JButton("DONE");
frame2.add(jb4);
jb4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
if(jli6.getText() == "" &&jli7.getText() == "" &&jli8.getText() == ""){
jli1.setText("Your Cart is Empty!!");}
frame2.dispose();
if(wd1 =="Blue Dress   $22" ){jli5.setText("                   "+wd1+"      "+wdq1+"      "+wds1+"      $"+twd1+"                    ");}
else{jli5.setText("");}
if(wd2 =="Pink Dress   $25"){jli6.setText("                    "+wd2+"      "+wdq2+"      "+wds2+"      $"+twd2+"                    ");}
else{jli6.setText("");}
if(ws1 =="Blue Saree   $35"){jli7.setText("                    "+ws1+"      "+wsq1+"      "+wss1+"      $"+tws1+"                    ");}
else{jli7.setText("");}
if(ws2 =="Black Saree   $40" ){jli8.setText("                   "+ws2+"      "+wsq2+"     "+wss2+"      $"+tws2+"                    ");}
else{jli8.setText("");}
}});
jb2 = new JButton("Show Cart");
jb2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
frame3.setSize(400,400);
frame3.setLayout(new FlowLayout());
if(jli6.getText() == "" &&jli7.getText() == "" &&jli8.getText() == ""){
frame3.setVisible(true);
}});
JLabel jlw = new JLabel("***********Your Cart***********");
frame3.add(jlw);
JLabel jltag = new JLabel("                    Item       Cost       Qty       Size      Price                       ");
frame3.add(jltag);
jli1 = new JLabel("");
jli2 = new JLabel("");
jli3 = new JLabel("");
jli4 = new JLabel("");
jli5 = new JLabel("");
jli6 = new JLabel("");
jli7 = new JLabel("");
jli8 = new JLabel("");

frame3.add(jli1);
frame3.add(jli2);
frame3.add(jli3);
frame3.add(jli4);
frame3.add(jli5);
frame3.add(jli6);
frame3.add(jli7);
frame3.add(jli8);
jb5 = new JButton("Place Order");
frame3.add(jb5);

JDialog jdb = new JDialog(frame3,"Order",true);
jdb.setSize(260,200);
jdb.setLayout(new FlowLayout());
jdb.add(jdl1);
jdb.add(jdl2);
JButton jbd = new JButton("OK");
jbd.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
jdb.dispose();
frame3.dispose();}});
jdb.add(jbd);

jb5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
total = tms1+tms2+tmp1+tmp2+twd1+twd2+tws1+tws2;

}});
add(jl1);
add(jl2);
add(jcb);
add(jb1);
add(jb2);


}
class mshirt extends JPanel{
public mshirt(){

ii1 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\blueshirt.png");
Image image1 = ii1.getImage();
Image newimg1 = image1.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii1 = new ImageIcon(newimg1);
jl4 = new JLabel("Blue Shirt   $15",ii1,JLabel.TRAILING);
jcbm1 = new JComboBox(size);
jcbm1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
mss1 = (String)jcbm1.getSelectedItem();
}});
jrbm1 = new JRadioButton("1");
 jrbm1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm1.isSelected()){
             msq1 = jrbm1.getText();
                      }

}});
jrbm2 = new JRadioButton("2");
jrbm2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm2.isSelected()){
             msq1 = jrbm2.getText();
                      }
}});
jc1 = new JCheckBox("Add to Cart");
 jc1.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jc1.isSelected()){
ms1 = "Blue Shirt   $15";
if(msq1 == "2"){
tms1 +=(15*2);}
else{tms1+=15;}
   }
else{ms1 = "";
if(msq1 == "2"){
tms1 -=(15*2);}
else{tms1-=15;}
   }}}
       );

ii2 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\thoffice.png");
Image image2 = ii2.getImage();
Image newimg2 = image2.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii2 = new ImageIcon(newimg2);
jl5 = new JLabel("Yellow T-Shirt   $10",ii2,JLabel.TRAILING);
jcbm2 = new JComboBox(size);
jcbm2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
mss2 = (String)jcbm2.getSelectedItem();
}});
jrbm3 = new JRadioButton("1");
jrbm3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm3.isSelected()){
             msq2 = jrbm3.getText();
                      }
}});
jrbm4 = new JRadioButton("2");
jrbm4.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm4.isSelected()){
             msq2 = jrbm4.getText();
                      }
}});
jc2 = new JCheckBox("Add to Cart");
 jc2.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jc2.isSelected()){
ms2 = "Yellow T-Shirt   $10";
if(msq2 == "2"){
tms2+=(10*2);}
else{tms2+=10;}
   } else{ms2 = "";
if(msq2 == "2"){
tms2-=(10*2);}
else{tms2-=10;}
   }}
       });

add(jl4);
add(jrbm1);
add(jrbm2);
ButtonGroup bg1 = new ButtonGroup();
bg1.add(jrbm1);
bg1.add(jrbm2);
add(jcbm1);
add(jc1);
add(jl5);
add(jrbm3);
add(jrbm4);
ButtonGroup bg2 = new ButtonGroup();
bg2.add(jrbm3);
bg2.add(jrbm4);
add(jcbm2);
add(jc2);
}}
class mpants extends JPanel{
public mpants(){
ii3 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\bluejeans.png");
Image image3 = ii3.getImage();
Image newimg3 = image3.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii3 = new ImageIcon(newimg3);
jl6 = new JLabel("Blue Jeans   $40",ii3,JLabel.TRAILING);
jcbm3 = new JComboBox(size);
jcbm3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
mps1 = (String)jcbm3.getSelectedItem();
}});
jrbm5 = new JRadioButton("1");
jrbm5.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm5.isSelected()){
             mpq1 = jrbm5.getText();
                      }
}});
jrbm6 = new JRadioButton("2");
jrbm6.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm6.isSelected()){
             mpq1 = jrbm6.getText();
                      }
}});
jc3 = new JCheckBox("Add to Cart");
 jc3.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jc3.isSelected()){
mp1 = "Blue Jeans   $40";
if(mpq1 == "2"){tmp1 +=(40*2);}
else{tmp1 +=40;}
   }
else{mp1 = "";
if(mpq1 == "2"){tmp1 -=(40*2);}
else{tmp1 -=40;}
   }}
       });

ii4 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\blackpant.png");
Image image4 = ii4.getImage();
Image newimg4 = image4.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii4 = new ImageIcon(newimg4);
jl7 = new JLabel("Black Pant   $30",ii4,JLabel.TRAILING);
jcbm4 = new JComboBox(size);
jcbm4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
mps2 = (String)jcbm4.getSelectedItem();
}});
jrbm7 = new JRadioButton("1");
jrbm7.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm7.isSelected()){
             mpq2 = jrbm7.getText();
                      }
}});
jrbm8 = new JRadioButton("2");
jrbm8.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbm8.isSelected()){
             mpq2 = jrbm8.getText();
                      }
}});
jc4 = new JCheckBox("Add to Cart");
 jc4.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jc4.isSelected()){
mp2 = "Black Pant   $30";
if(mpq2 == "2"){tmp2 +=(30*2);}
else{tmp2 +=30;}
   }
else{mp2 = "";
if(mpq2 == "2"){tmp2 -=(30*2);}
else{tmp2 -=30;}
   }}
       });

add(jl6);
add(jrbm5);
add(jrbm6);
ButtonGroup bg3 = new ButtonGroup();
bg3.add(jrbm5);
bg3.add(jrbm6);
add(jcbm3);
add(jc3);
add(jl7);
add(jrbm7);
add(jrbm8);
ButtonGroup bg4 = new ButtonGroup();
bg4.add(jrbm7);
bg4.add(jrbm8);
add(jcbm4);
add(jc4);
}}
class wdress extends JPanel{
public wdress(){

ii5 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\bluedress.png");
Image image5 = ii5.getImage();
Image newimg5 = image5.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii5 = new ImageIcon(newimg5);
jlw2 = new JLabel("Blue Dress   $22",ii5,JLabel.TRAILING);
jcbw1 = new JComboBox(size);
jcbw1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
wds1 = (String)jcbw1.getSelectedItem();
}});
jrbw1 = new JRadioButton("1");
jrbw1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw1.isSelected()){
             wdq1 = jrbw1.getText();
                      }
}});
jrbw2 = new JRadioButton("2");
jrbw2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw2.isSelected()){
             wdq1 = jrbw2.getText();
                      }
}});
jcw1 = new JCheckBox("Add to Cart");
jcw1.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jcw1.isSelected()){
wd1 = "Blue Dress   $22";
if(wdq1 == "2"){twd1 +=(22*2);}
else{twd1 +=22;}
   }
else{wd1 = "";
if(wdq1 == "2"){twd1 -=(22*2);}
else{twd1 -=22;}
   }}
       });


ii6 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\pinkdress.png");
Image image6 = ii6.getImage();
Image newimg6 = image6.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii6 = new ImageIcon(newimg6);
jlw3 = new JLabel("Pink Dress   $25",ii6,JLabel.TRAILING);
jcbw2 = new JComboBox(size);
jcbw2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
wds2 = (String)jcbw2.getSelectedItem();
}});
jrbw3 = new JRadioButton("1");
jrbw3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw3.isSelected()){
             wdq2 = jrbw3.getText();
                      }
}});
jrbw4 = new JRadioButton("2");
jrbw4.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw4.isSelected()){
             wdq2 = jrbw4.getText();
                      }
}});
jcw2 = new JCheckBox("Add to Cart");
jcw2.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ie){
if(jcw2.isSelected()){
wd2 = "Pink Dress   $25";
if(wdq2 == "2"){twd2 +=(25*2);}
else{twd2 +=25;} }
else{wd2 = "";
if(wdq2 == "2"){twd2 -=(25*2);}
else{twd2 -=25;} }
}});

add(jlw2);
add(jrbw1);
add(jrbw2);
ButtonGroup bgw1 = new ButtonGroup();
bgw1.add(jrbw1);
bgw1.add(jrbw2);
add(jcbw1);
add(jcw1);
add(jlw3);
add(jrbw3);
add(jrbw4);
ButtonGroup bgw2 = new ButtonGroup();
bgw2.add(jrbw3);
bgw2.add(jrbw4);
add(jcbw2);
add(jcw2);
}
}
class wsaree extends JPanel{
public wsaree(){

ii7 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\bluesaree.png");
Image image7 = ii7.getImage();
Image newimg7 = image7.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii7 = new ImageIcon(newimg7);
jlw4 = new JLabel("Blue Saree   $35",ii7,JLabel.TRAILING);
jcbw3 = new JComboBox(size);
jcbw3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
wss1 = (String)jcbw3.getSelectedItem();
}});
jrbw5 = new JRadioButton("1");
jrbw5.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw5.isSelected()){
             wsq1 = jrbw5.getText();
                      }
}});
jrbw6 = new JRadioButton("2");
jrbw6.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw6.isSelected()){
             wsq1 = jrbw6.getText();
                      }
}});
jcw3 = new JCheckBox("Add to Cart");
jcw3.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jcw3.isSelected()){
ws1 = "Blue Saree   $35";
if(wsq1 == "2"){tws1 +=(35*2);}
else{tws1 +=35;}
   }
else{
ws1 = "";
if(wsq1 == "2"){tws1 -=(35*2);}
else{tws1 -=35;}
   }}
       });

ii8 = new ImageIcon("D:\\My Documents\\Desktop\\javaimage\\blacksaree.png");
Image image8 = ii8.getImage();
Image newimg8 = image8.getScaledInstance(175, 175,  java.awt.Image.SCALE_SMOOTH);
ImageIcon ii8 = new ImageIcon(newimg8);
jlw5 = new JLabel("Black Saree   $40",ii8,JLabel.TRAILING);
jcbw4 = new JComboBox(size);
jcbw4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
wss2 = (String)jcbw4.getSelectedItem();
}});
jrbw7 = new JRadioButton("1");
jrbw7.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw7.isSelected()){
             wsq2 = jrbw7.getText();
                      }
}});
jrbw8 = new JRadioButton("2");
jrbw8.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
         if(jrbw8.isSelected()){
             wsq2 = jrbw8.getText();
                      }
}});
jcw4 = new JCheckBox("Add to Cart");
jcw4.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
       if(jcw4.isSelected()){
ws2 = "Black Saree   $40";
if(wsq2 == "2"){tws2 +=(40*2);}
else{tws2 +=40;}
   
   }
else{ws2 = "";
if(wsq2 == "2"){tws2 -=(40*2);}
else{tws2 -=40;}
   
   }}
       });

add(jlw4);
add(jrbw5);
add(jrbw6);
ButtonGroup bgw3 = new ButtonGroup();
bgw3.add(jrbw5);
bgw3.add(jrbw6);
add(jcbw3);
add(jcw3);
add(jlw5);
add(jrbw7);
add(jrbw8);
ButtonGroup bgw4 = new ButtonGroup();
bgw4.add(jrbw7);
bgw4.add(jrbw8);
add(jcbw4);
add(jcw4);}
}

}
