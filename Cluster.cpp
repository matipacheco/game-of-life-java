#include "Cell.cpp"

class Cluster
{
	public:
		int size;
		Cell** matrix;

		Cluster(int size)
		{
			Cell matrix[size][size];

			this -> size   = size;
			this -> matrix = matrix;
		}
};

int main(int argc, char const *argv[])
{
	Cluster cluster(6);
	return 0;
}