package Client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import AirConditioningService.AirConServiceGrpc;
import HeatingService.HeatingServiceGrpc;
import PowerService.PowerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class ControllerGUI implements ActionListener{


	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;


	private JPanel getAirConServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Request: ");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Send Air Conditioning service request");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JLabel label2 = new JLabel("Service Response: ");
		panel.add(label2);

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getHeatingServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Request: ");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Heating Service");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JLabel label2 = new JLabel("Service Response: ");
		panel.add(label2);
		
		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;
	}

	private JPanel getPowerServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Request: ");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Power Service");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JLabel label2 = new JLabel("Service Response: ");
		panel.add(label2);

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}

	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Smart Hotel Room Controller");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getAirConServiceJPanel() );
		panel.add( getHeatingServiceJPanel() );
		panel.add( getPowerServiceJPanel() );

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  
		String e1 = entry1.getText();

		if (label.equals("Send Air Conditioning service request")) 
		{
		   if(e1.equals("Turn on air con")) {
				
		      System.out.println("Air Conditioning Service to be invoked ...");

			  ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			  AirConServiceGrpc.AirConServiceBlockingStub blockingStub = AirConServiceGrpc.newBlockingStub(channel);

			  //preparing message to send
			  AirConditioningService.AirCon_turnOnRequest request = AirConditioningService.AirCon_turnOnRequest.newBuilder().setText(e1).build();

			  //retrieving reply from service
			  AirConditioningService.AirCon_turnOnReply reply = blockingStub.airConTurnOn(request);

			  reply1.setText( String.valueOf(reply));
			}	
		    else
		    {
		      reply1.setText("ERROR: Invalid Request");
		    }
		}
		else if (label.equals("Invoke Heating Service")) {
			System.out.println("Heating Service to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub = HeatingServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			HeatingService.Heating_turnOnRequest request = HeatingService.Heating_turnOnRequest.newBuilder().setText(entry2.getText()).build();

			//retrieving reply from service
			HeatingService.Heating_turnOnReply reply = blockingStub.heatingTurnOn(request);

			reply2.setText( String.valueOf( reply.getLength()) );
			
		}else if (label.equals("Invoke Power Service")) {
			System.out.println("Power Service to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			PowerServiceGrpc.PowerServiceBlockingStub blockingStub = PowerServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			PowerService.Power_turnOnRequest request = PowerService.Power_turnOnRequest.newBuilder().setText(entry3.getText()).build();

			//retrieving reply from service
			PowerService.Power_turnOnReply reply = blockingStub.powerTurnOn(request);

			reply3.setText( String.valueOf( reply.getLength()) );
		
		}else{
			
		}

	}

}
