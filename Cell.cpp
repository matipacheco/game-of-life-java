#include <iostream>
#include <SFML/Graphics.hpp>

class Cell
{
	public:
		bool state;
		int x_pos, y_pos;
		sf::RectangleShape* pointer;

		Cell() {}
		
		Cell(bool state, int x_pos, int y_pos, sf::RectangleShape* pointer)
		{
			this -> state   = state;
			this -> x_pos   = x_pos;
			this -> y_pos   = y_pos;
			this -> pointer = pointer;
		}

		void setState(bool alive) {
			state = alive;
		}

		sf::RectangleShape* getRectanglePointer() {
			return pointer;
		}
};

//int main(int argc, char const *argv[])
//{
//	sf::RectangleShape rectangle;
//	rectangle.setOutlineThickness(10.0);
//	
//	Cell celulitica(true, 2, 3, &rectangle);
//
//	std::cout << celulitica.pointer -> getOutlineThickness() << std::endl;	
//	return 0;
//}