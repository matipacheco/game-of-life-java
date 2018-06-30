import java.awt.Graphics;

class Game
{
	public static void main(String[] args) {
		int size = 10;
		Cluster cluster = new Cluster(size);
		System.out.println(cluster.getCell(2, 2));
		Graphics g;
		cluster.initialize(g);
	}
}