import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class BMI extends Applet implements ActionListener{
	Button b1 =new Button("BMI CALC");
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	TextField t3 = new TextField(10);
	Label l1 = new Label(" Enter your weight in kg: ");
	Label l2 = new Label(" Enter your height in cm: ");
	Label l3 = new Label(" BMI is: ");

	public void init(){
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent  ae){
		if(ae.getSource()==b1){
			float n1 = Float.parseFloat(t1.getText());
			float n2 = Float.parseFloat(t2.getText());
		float bmi = (100*100*n1)/(n2*n2);
		if(bmi < 18.5) {
				t3.setText("Person is underweight");
			}else if (bmi < 25) {
				t3.setText("Person is normal");
			}else if (bmi < 30) {
				t3.setText("Person is overweight");
			}else {
				t3.setText("Person is obese");
			}
		}
	}
}