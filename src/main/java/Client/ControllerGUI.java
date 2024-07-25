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

import AirConService.AirConServiceGrpc;
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

		JButton button = new JButton("Send Heating service request");
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

		JButton button = new JButton("Send Power service request");
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
		String e2 = entry2.getText();
		String e3 = entry3.getText();

		if (label.equals("Send Air Conditioning service request")) 
		{
		   if(e1.equals("Turn on air con"))
		   {
			  ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			  AirConServiceGrpc.AirConServiceBlockingStub blockingStub = AirConServiceGrpc.newBlockingStub(channel);

			  //preparing message to send
			  AirConService.AirCon_turnOnRequest request = AirConService.AirCon_turnOnRequest.newBuilder().setText(e1).build();

			  //retrieving reply from service
			  AirConService.AirCon_turnOnReply reply = blockingStub.airConTurnOn(request);

			  reply1.setText( String.valueOf(reply));
			}	
		    else if(e1.equals("Turn up air con")) 
		    {

			   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			   AirConServiceGrpc.AirConServiceBlockingStub blockingStub = AirConServiceGrpc.newBlockingStub(channel);

			   //preparing message to send
			   AirConService.AirCon_turnUpRequest request = AirConService.AirCon_turnUpRequest.newBuilder().setText(e1).build();

			   //retrieving reply from service
			   AirConService.AirCon_turnUpReply reply = blockingStub.airConTurnUp(request);

			   reply1.setText( String.valueOf(reply));
			}	
		    else if(e1.equals("Turn down air con")) 
		    {

			   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			   AirConServiceGrpc.AirConServiceBlockingStub blockingStub = AirConServiceGrpc.newBlockingStub(channel);

			   //preparing message to send
			   AirConService.AirCon_turnDownRequest request = AirConService.AirCon_turnDownRequest.newBuilder().setText(e1).build();

			   //retrieving reply from service
			   AirConService.AirCon_turnDownReply reply = blockingStub.airConTurnDown(request);

			   reply1.setText( String.valueOf(reply));
			}	
		    else
		    {
		      reply1.setText("ERROR: Invalid Request");
		    }
		}
		else if (label.equals("Send Heating service request")) 
		{
		   if(e2.equals("Turn on heating"))
		   {
		      ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			  HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub = HeatingServiceGrpc.newBlockingStub(channel);

			  //preparing message to send
			  HeatingService.Heating_turnOnRequest request = HeatingService.Heating_turnOnRequest.newBuilder().setText(e2).build();

			  //retrieving reply from service
			  HeatingService.Heating_turnOnReply reply = blockingStub.heatingTurnOn(request);

			  reply2.setText( String.valueOf(reply));
			}	
			else if(e2.equals("Turn up heating")) 
			{
			   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			   HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub = HeatingServiceGrpc.newBlockingStub(channel);

			   //preparing message to send
			   HeatingService.Heating_turnUpRequest request = HeatingService.Heating_turnUpRequest.newBuilder().setText(e2).build();

			   //retrieving reply from service
			   HeatingService.Heating_turnUpReply reply = blockingStub.heatingTurnUp(request);

			   reply2.setText( String.valueOf(reply));
			 }	
			 else if(e2.equals("Turn down heating")) 
			 {
				 ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
				 HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub = HeatingServiceGrpc.newBlockingStub(channel);

				 //preparing message to send
				 HeatingService.Heating_turnDownRequest request = HeatingService.Heating_turnDownRequest.newBuilder().setText(e2).build();

				 //retrieving reply from service
				 HeatingService.Heating_turnDownReply reply = blockingStub.heatingTurnDown(request);

				 reply2.setText( String.valueOf(reply));
			  }	
			  else
			  {
			     reply2.setText("ERROR: Invalid Request");
			  }
		}
		else if (label.equals("Send Power service request")) 
		{
			
		
		}
	}
}
