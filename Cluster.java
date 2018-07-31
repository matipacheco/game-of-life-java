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
	
	public Cell[][] getMatrix()
	{
		return matrix;
	}

	public Cell getCell(int i, int j)
	{
		return this.matrix[i][j];
	}
	
	public void initializeCluster()
	{
		int size        = this.getSize();
		Cell[][] matrix = this.getMatrix();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = new Cell(i, j);
			}
		}
	}
	
	public int countAwakeNeighbors(Cell cell)
	{
		int neighbors = 0;
		
		int xPos = cell.getxPos();
		int yPos = cell.getyPos();
		
		int startxPos = (xPos - 1 < 0) ? xPos : xPos - 1;
		int startyPos = (yPos - 1 < 0) ? yPos : yPos - 1;
		int endxPos   = (xPos + 1 > this.getSize() - 1) ? xPos : xPos + 1;
		int endyPos   = (yPos + 1 > this.getSize() - 1) ? yPos : yPos + 1;
		
		for (int i = startxPos; i <= endxPos; i++) {
			for (int j = startyPos; j <= endyPos; j++) {
				
				if (i == xPos && j == yPos) { continue; } // ignore the cell itself
				
				Cell neighbor = this.getCell(i, j);
				
				if (neighbor.isAwake()) {
					neighbors++;
				}
				
			}
		}
		
		return neighbors;
	}
}