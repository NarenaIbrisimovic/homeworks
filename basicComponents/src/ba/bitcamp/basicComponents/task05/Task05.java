package ba.bitcamp.basicComponents.task05;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Task05 extends JFrame {

	private JPanel panel = new JPanel();
	private JSlider slider1 = new JSlider(0, 255);
	private JSlider slider2 = new JSlider(0, 255);
	private JSlider slider3 = new JSlider(0, 255);

	private JLabel redSlider = new JLabel("red");
	private JLabel greenSlider = new JLabel("green");
	private JLabel blueSlider = new JLabel("blue");
	
	/**
	 * Changes background color to sliders. 
	 */

	public Task05() {
		add(panel);
		panel.add(slider1);
		panel.add(redSlider);
		panel.add(slider2);
		panel.add(greenSlider);
		panel.add(slider3);
		panel.add(blueSlider);

		slider1.setValue(0);
		slider2.setValue(0);
		slider3.setValue(0);

		panel.setLayout(new GridLayout(3, 0));
		setTitle("RGB window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

		slider1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				panel.setBackground(new Color(255 - slider1.getValue(),
						255 - slider2.getValue(), 255 - slider3.getValue()));

			}

		});

		slider2.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {

				panel.setBackground(new Color(255 - slider1.getValue(),
						255 - slider2.getValue(), 255 - slider3.getValue()));
			}

		});

		slider3.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {

				panel.setBackground(new Color(255 - slider1.getValue(),
						255 - slider2.getValue(), 255 - slider3.getValue()));
			}

		});

	}

	public static void main(String[] args) {
		new Task05();

	}

}
