import java.util.ArrayList;
import java.util.Random;

public enum LifeState
{
	AWAKENING, AWAKE, SLEEPY, ASLEEP;
	
	private LifeState nextState;

	static
	{
		AWAKENING.nextState = AWAKE;
		AWAKE.nextState     = SLEEPY;
		SLEEPY.nextState    = ASLEEP;
		ASLEEP.nextState    = AWAKENING;
	}
	
	public static ArrayList<LifeState> getTerminalStates()
	{
		ArrayList<LifeState> terminalStates = new ArrayList<LifeState>();
		terminalStates.add(AWAKE);
		terminalStates.add(ASLEEP);
		return terminalStates; 
	}
	
	public static ArrayList<LifeState> getIntermediateStates()
	{
		ArrayList<LifeState> terminalStates = new ArrayList<LifeState>();
		terminalStates.add(AWAKENING);
		terminalStates.add(SLEEPY);
		return terminalStates;		
	}
	
	public static LifeState getRandomTerminalStates()
	{
		Random random = new Random();
		ArrayList<LifeState> states = LifeState.getTerminalStates();
		
		return states.get(random.nextInt(states.size()));
	}
	
	public LifeState getNextState()
	{
		return nextState;
	}
}