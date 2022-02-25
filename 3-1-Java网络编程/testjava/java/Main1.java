import java.awt.*;
class Main extends Frame{
	Checkbox cbAC=new Checkbox("Air Conditioning");
	Checkbox cbSR=new Checkbox("Sun roof");
	Checkbox cbSW=new Checkbox("Steering Wheel");
	Checkbox cbTR=new Checkbox("Tires");
	Label status=new Label();
	Main(){
		super("Checkbox Example");
		Panel gridPanel=new Panel();
		gridPanel.setLayout(new GridLayout(0,1));
		gridPanel.add(cbAC);
		gridPanel.add(cbSR);
		gridPanel.add(cbSW);
		gridPanel.add(cbTR);
		add("Center",gridPanel);
		computeTotal();
		add("South",status);
		pack();
		show();
	}
	
	public boolean action(Event evt,Object what){
		computeTotal();
		return true;
	}
	
	void computeTotal(){
		int total=25000;
		if(cbAC.getState()) total+=510;
		if(cbSR.getState()) total+=2222;
		if(cbSW.getState()) total+=150;
		if(cbTR.getState()) total+=320;
		status.setText("Total Sticket Price:$"+total);
	}
	static public void main(String[] args){
		new Main();
	}
}