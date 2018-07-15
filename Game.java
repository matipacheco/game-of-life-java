class Game
{
	public static void main(String[] args) {
		int size = 20;
		Cluster cluster = new Cluster(size);
		System.out.println(cluster.getCell(2, 2));
	}
}