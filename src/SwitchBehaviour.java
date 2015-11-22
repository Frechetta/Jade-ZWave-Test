import jade.core.behaviours.OneShotBehaviour;


@SuppressWarnings("serial")
public class SwitchBehaviour extends OneShotBehaviour
{
	private ZWController controller;
	
	
	public SwitchBehaviour(ZWController controller)
	{
		this.controller = controller;
	}
	
	
	@Override
	public void action()
	{
		System.out.println("Switching on/off");
		
		controller.allOn();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		controller.allOff();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myAgent.doDelete();
	}
}
