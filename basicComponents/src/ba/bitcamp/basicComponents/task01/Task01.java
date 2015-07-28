package ba.bitcamp.basicComponents.task01;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task01 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Neki tekst");
	private JSlider slider = new JSlider();
	

	public Task01(){
		
		add(panel);
		panel.add(label);
		panel.add(slider);
		label.setFont(new Font("Serif", Font.ITALIC, 20));
		slider.addChangeListener(new Change());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
		
	}
	
	private class Change implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			label.setFont(new Font("Serif", Font.BOLD, slider.getValue()));		
			
		}
		
	}
	public static void main(String[] args) {
		new Task01();

	}

}
