class Game
{
	public static void main(String[] args) {
		int size = 10;
		
		Cluster cluster = new Cluster(size);
		cluster.initializeCluster();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println(cluster.getCell(i, j).getState().getNextState());
			}
		}
	}
}