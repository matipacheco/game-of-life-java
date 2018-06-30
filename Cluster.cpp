#include <iostream>
#include "Cell.cpp"

class Cluster
{
	public:
		int size;
		int** matrix;

		Cluster(int size)
		{
			int** matrix = new int* [size];

			for(int i = 0; i < size; ++i)
				matrix[i] = new int [size];
			
			this -> size   = size;
			this -> matrix = matrix;
		}

		int getSize()
		{
			return this -> size;
		}

		int getCell(int row, int column)
		{
			return this -> matrix[row][column];
		}
};

// int main(int argc, char const *argv[])
// {
// 	Cluster cluster(6);
// 	for (int rows = 0; rows < cluster.getSize(); ++rows)
// 	{
// 		for (int cols = 0; cols < cluster.getSize(); ++cols)
// 		{
// 			std::cout << cluster << std::endl;
// 		}
// 	}
// 	return 0;
// }