#include <iostream>
#include <SFML/Graphics.hpp>

class Cell {
	public:
		bool state;
		int x_pos, y_pos;
		sf::RectangleShape* pointer;
		
		Cell(bool alive, int x, int y, sf::RectangleShape* address) {
			state   = alive;
			x_pos   = x;
			y_pos   = y;
			pointer = address;
		}

		void setState(bool alive) {
			state = alive;
		}

		sf::RectangleShape* getRectanglePointer() {
			return pointer;
		}
};

int main(int argc, char const *argv[])
{
	sf::RectangleShape rectangle;
	rectangle.setOutlineThickness(10.0);
	
	Cell celulitica(true, 2, 3, &rectangle);

	std::cout << celulitica.pointer->getOutlineThickness() << std::endl;	
	return 0;
}