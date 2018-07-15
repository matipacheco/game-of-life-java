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
}