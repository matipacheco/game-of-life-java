import java.awt.Graphics;
import java.awt.Graphics2D;

class Cluster
{
	private int size;
	private Cell[][] matrix;


	public Cluster() {}

	public Cluster(int size)
	{
		this.size   = size;
		this.matrix = new Cell[size][size];
	}


	public int getSize()
	{
		return this.size;
	}

	public Cell getCell(int xPos, int yPos)
	{
		return this.matrix[xPos][yPos];
	}


	public Graphics2D initialize(Graphics g)
	{
		Graphics2D graphic = (Graphics2D)g;

		for (int row = 0; row < this.getSize(); row++) {
			for (int column = 0; column < this.getSize(); column++) {
				Cell cell = new Cell(row,column);
				graphic.fill(cell.getRectangle());
			}
		}

		return graphic;
	}
}