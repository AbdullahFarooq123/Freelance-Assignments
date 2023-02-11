
/******************************************************************************
  Assignment #2 -- interface for type "Rectangle"
******************************************************************************/

#ifndef RECTANGLE_
#define RECTANGLE_

using namespace std;

#include <iostream>

class Rectangle
{
  public:
    // Create and initialize the rectangle
    //
    Rectangle( double length = 0.0, double width = 0.0 );

    // Return the length of the rectangle
    //
    inline double length() const;

    // Return the width of the rectangle
    //
    inline double width() const;

    // Return the perimeter of the rectangle
    //
    double perimeter() const;

    // Return the area of the rectangle
    //
    double area() const;

    // Are both dimensions of the rectangle greater than zero?
    //
    bool is_valid() const;

  private:

    // Dimensions of the rectangle
    //
    double Length_;
    double Width_;
    // Put one rectangle into the output stream
    //
    friend ostream& operator<<( ostream&, const Rectangle& );

    // Extract one rectangle from the input stream
    //
    friend istream& operator>>( istream&, Rectangle& );
};


// Compare two rectangles for equality
//
bool operator==( const Rectangle&, const Rectangle& );

// Compare two rectangles for inequality
//
bool operator!=( const Rectangle&, const Rectangle& );

#endif

