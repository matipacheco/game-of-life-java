class Cell
{
	private LifeState state;
	private Position prosition;
	
	
	public Cell() {}
	
	public Cell(Position prosition)
	{
		this.state     = LifeState.getRandomTerminalStates();
		this.prosition = prosition;
	}
	
	public Cell(int xPos, int yPos)
	{
		this.state     = LifeState.getRandomTerminalStates();
		this.prosition = new Position(xPos, yPos);
	}
	
	
	public LifeState getState()
	{
		return state;
	}

	public void setState(LifeState state)
	{
		this.state = state;
	}

	public Position getPosition()
	{
		return prosition;
	}
	
	public int getxPos()
	{
		return getPosition().getxPos();
	}
	
	public int getyPos()
	{
		return getPosition().getyPos();
	}

	public void setPosition(int xPos, int yPos)
	{
		this.prosition.setxPos(xPos);
		this.prosition.setyPos(yPos);
	}
	
	public boolean isAwakening()
	{
		return (this.getState() == LifeState.AWAKENING);
	}

	public boolean isAwake()
	{
		return (this.getState() == LifeState.AWAKE);
	}
	
	public boolean isSleepy()
	{
		return (this.getState() == LifeState.SLEEPY);
	}
	
	public boolean isAsleep()
	{
		return (this.getState() == LifeState.ASLEEP);
	}
}