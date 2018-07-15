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

	public void setPosition(int xPos, int yPos)
	{
		this.prosition.setxPos(xPos);
		this.prosition.setyPos(yPos);
	}
}