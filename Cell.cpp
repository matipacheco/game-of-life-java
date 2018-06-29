#include <iostream>
#include <SFML/Graphics.hpp>

class Cell
{
	public:
		bool state;
		float x_pos, y_pos;
		sf::RectangleShape* rectangle;

		Cell() {}

		Cell(float x_pos, float y_pos)
		{
			sf::RectangleShape *rectangle = new sf::RectangleShape();
			rectangle -> setPosition(x_pos, y_pos);
			rectangle -> setOutlineColor(sf::Color::Black);

			this -> state     = false;
			this -> x_pos     = x_pos;
			this -> y_pos     = y_pos;
			this -> rectangle = rectangle;
		}
		
		Cell(bool state, float x_pos, float y_pos, sf::RectangleShape* rectangle)
		{
			this -> state     = state;
			this -> x_pos     = x_pos;
			this -> y_pos     = y_pos;
			this -> rectangle = rectangle;
		}

		void setState(bool state)
		{
			this -> state = state;
		}

		void awake()
		{
			this -> setState(true);
			this -> rectangle -> setOutlineThickness(10000);
			this -> rectangle -> setOutlineColor(sf::Color::White);
		}

		void sleep()
		{
			this -> setState(false);
			this -> rectangle -> setOutlineThickness(0);
			this -> rectangle -> setOutlineColor(sf::Color::Black);
		}
};