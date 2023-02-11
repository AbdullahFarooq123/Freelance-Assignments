
/****************************************************************************
 Assignment #2 -- implementation of driver module
****************************************************************************/

using namespace std;

#include <iostream>
#include <iomanip>
#include "Rectangle.h"

/*-----------------------------------------------------------------------------
  Name:  main

  Purpose:  Test some of the operations in type Rectangle
-----------------------------------------------------------------------------*/

int main()
{
  const Rectangle A( 10.0, 2.5 );
  Rectangle B, C( -5.0, -10.0 );

  cout << endl << "Size of one object of type 'Rectangle': "
    << sizeof( Rectangle ) << endl << endl;

  cout << "Rectangle A: " << A << endl;
  cout << "Rectangle B: " << B << endl;
  cout << "Rectangle C: " << C << endl << endl;

  if (!A.is_valid())
  {
    cout << "A is not a valid rectangle\n\n";
  }
  if (!B.is_valid())
  {
    cout << "B is not a valid rectangle\n\n";
  }
  if (!C.is_valid())
  {
    cout << "C is not a valid rectangle\n\n";
  }

  B = Rectangle( A.width(), A.length() );

  cout << "Input a rectangle in the form '[ x.x, x.x ]': \n";
  cin >> C;

  if (cin.eof())
  {
    cout << "*** end-of-file entered ***\n";
  }
  else if (cin.fail())
  {
    cout << "*** improper format used for a rectangle ***\n";
  }

  cout << endl;
  cout << "Rectangle A: " << A << endl;
  cout << "Rectangle B: " << B << endl;
  cout << "Rectangle C: " << C << endl << endl;

  cout << "Rectangles A and B equal? " << (A==B) << endl;
  cout << "Rectangles A and C equal? " << (A==C) << endl;
  cout << "Rectangles B and C equal? " << (B==C) << endl << endl;

  cout << "Perimeter of rectangle A: " << A.perimeter() << endl;
  cout << "Perimeter of rectangle B: " << B.perimeter() << endl;
  cout << "Perimeter of rectangle C: " << C.perimeter() << endl << endl;

  cout << "Area of rectangle A: " << A.area() << endl;
  cout << "Area of rectangle B: " << B.area() << endl;
  cout << "Area of rectangle C: " << C.area() << endl << endl;
}

