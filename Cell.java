import java.awt.Color;
import java.awt.Rectangle;

class Cell
{
	private boolean state;
	private Color color;
	private Rectangle rectangle;

// Rectangle(int width, int height)
// Constructs a new Rectangle whose upper-left corner is at (0, 0) in the coordinate space, and whose width and height are 
// specified by the arguments of the same name.

// Rectangle(int x, int y, int width, int height)
// Constructs a new Rectangle whose upper-left corner is specified as (x,y) and whose width and height are specified by the
//	arguments of the same name.

	public Cell() {}

	public Cell(int xPos, int yPos)
	{
		this.state     = false;
		this.color     = Color.BLACK;
		this.rectangle = new Rectangle(xPos, yPos);
	}

	public Cell(boolean state, int xPos, int yPos)
	{
		this.state     = state;
		this.color     = Color.BLACK;
		this.rectangle = new Rectangle(xPos, yPos);
	}


	public boolean getState()
	{
		return this.state;
	}

	public Rectangle getRectangle()
	{
		return this.rectangle;
	}

	public void setPosition(int xPos, int yPos)
	{
		this.rectangle.setLocation(xPos, yPos);
	}


	public boolean isAwake()
	{
		return this.getState();
	}

	public void wake()
	{
		this.state = true;
		this.color = Color.WHITE;
	}

	public void sleep()
	{
		this.state = false;
		this.color = Color.BLACK;
	}
}