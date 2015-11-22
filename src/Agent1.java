import jade.core.Agent;


@SuppressWarnings("serial")
public class Agent1 extends Agent
{
	private ZWController controller;
	
	
	protected void setup()
	{
		controller = new ZWController("/home/ugrad10/efrechet/Work/open-zwave/config", "/dev/ttyUSB0");
		
		System.out.println("Agent " + getAID().getName() + " is ready");
		
		addBehaviour(new SwitchBehaviour(controller));
	}
	
	
	protected void takeDown()
	{
		System.out.println("Agent " + getAID().getName() + " is terminating");
	}
}
