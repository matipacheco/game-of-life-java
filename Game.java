class Game
{
	public static void main(String[] args)
	{
		int size = 10, awakeNeighbors;
		
		Cluster cluster = new Cluster(size);
		cluster.initializeCluster();
		
		// while haya alguna celula viva?
		
		for (Cell[] row : cluster.getMatrix()) {
			for (Cell cell : row) {
			
				awakeNeighbors = cluster.countAwakeNeighbors(cell);
				
				// 1 - Any live cell with fewer than two live neighbors dies, as if by under population.
				// 2 - Any live cell with two or three live neighbors lives on to the next generation.
				// 3 - Any live cell with more than three live neighbors dies, as if by overpopulation.
				// 4 - Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
				if (cell.isAwake() && (awakeNeighbors == 2 || awakeNeighbors == 3)) {
					continue;
				}
				else if (cell.isAwake() && (awakeNeighbors < 2 || awakeNeighbors > 3)) {
					cell.setState(cell.getState().getNextState());
				}
				else if (cell.isAsleep() && (awakeNeighbors == 3)) {
					cell.setState(cell.getState().getNextState());
				}
				
			}
		}
		
		for (Cell[] row : cluster.getMatrix()) {
			for (Cell cell : row) {
				
				if (LifeState.getIntermediateStates().contains(cell.getState())) {
					cell.setState(cell.getState().getNextState());
				}
				
			}
		}
	}
}