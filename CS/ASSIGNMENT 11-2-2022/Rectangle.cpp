
/******************************************************************************
  Assignment #2 -- implementation of type "Rectangle"
******************************************************************************/

using namespace std;

#include <iostream>

#include "Rectangle.h"

/*-----------------------------------------------------------------------------
   Name: value constructor for class "Rectangle"

   Purpose:  Initialize the contents of a rectangle
   Receive:  The length and width of a rectangle
-----------------------------------------------------------------------------*/

Rectangle::Rectangle( double Len, double Wid )
{
  if (Len <= 0.0)
  {
    Length_ = 0.0;
  }
  else
  {
    Length_ = Len;
  }

  if (Wid <= 0.0)
  {
    Width_ = 0.0;
  }
  else
  {
    Width_ = Wid;
  }
}

/*-----------------------------------------------------------------------------
   Name:  length

   Purpose:  Return the length of a rectangle
   Return:   The length
-----------------------------------------------------------------------------*/

double Rectangle::length() const
{
  return Length_;
}

/*-----------------------------------------------------------------------------
   Name:  width

   Purpose:  Return the width of a rectangle
   Return:   The width
-----------------------------------------------------------------------------*/

double Rectangle::width() const
{
  return Width_;
}

/*-----------------------------------------------------------------------------
   Name:  perimeter

   Purpose:  Return the length of the perimeter of a rectangle
   Return:   The length of the perimeter
-----------------------------------------------------------------------------*/

double Rectangle::perimeter() const
{
  return 2.0 * Length_ + 2.0 * Width_;
}

/*-----------------------------------------------------------------------------
   Name:  area

   Purpose:  Return the area of a rectangle
   Return:   The area
-----------------------------------------------------------------------------*/

double Rectangle::area() const
{
  // INCOMPLETE
    //Completed
  return Length_ * Width_;
}

/*-----------------------------------------------------------------------------
   Name:  is_valid

   Purpose:  Test whether or not the rectangle is valid
   Return:   The Boolean value for the result of the test
-----------------------------------------------------------------------------*/

bool Rectangle::is_valid() const
{
  return Length_ > 0.0 && Width_ > 0.0;
}


/*-----------------------------------------------------------------------------
   Name:  operator<<

   Purpose:  Put a rectangle into an output stream
   Receive:  The output stream
             The rectangle which is to be written
   Return:   The output stream (for chaining)
-----------------------------------------------------------------------------*/

ostream& operator<<( ostream& Out, const Rectangle& Item )
{
    Out << "[" << Item.Length_ << ", " << Item.Width_ << "]";

  return Out;
}

/*-----------------------------------------------------------------------------
   Name:  operator>>

   Purpose:  Extract a rectangle from an input stream, where the rectangle
               is in the form '[ x.x, x.x ]'
   Receive:  The input stream
             The rectangle which is to be read
   Return:   The input stream (for chaining)
-----------------------------------------------------------------------------*/

istream& operator>>( istream& In, Rectangle& Item )
{
    char Ch;
    double Len, Wid;

    In >> Ch;
    if (Ch != '[' || !In.good())
    {
        In.setstate(ios::failbit);
    }
    else
    {
        In >> Len >> Ch;
        if (Ch != ',' || !In.good())
        {
            In.setstate(ios::failbit);
        }
        else
        {
            In >> Wid >> Ch;
            if (Ch != ']' || !In.good())
            {
                In.setstate(ios::failbit);
            }
            else
            {
                if (Len <= 0.0)
                    Item.Length_ = 0.0;
                else
                    Item.Length_ = Len;

                if (Wid <= 0.0)
                    Item.Width_ = 0.0;
                else
                    Item.Width_ = Wid;
            }
        }
    }

  return In;
}

/*-----------------------------------------------------------------------------
   Name:  operator==

   Purpose:  Compare two rectangles for equality
   Receive:  The two rectangles to be compared
   Return:   The Boolean result of the comparison
-----------------------------------------------------------------------------*/

bool operator==( const Rectangle& One, const Rectangle& Two )
{
  return (One.length() == Two.length() && One.width() == Two.width())
      || (One.length() == Two.width() && One.width() == Two.length());
}

/*-----------------------------------------------------------------------------
   Name:  operator!=

   Purpose:  Compare two rectangles for inequality
   Receive:  The two rectangles to be compared
   Return:   The Boolean result of the comparison
-----------------------------------------------------------------------------*/

bool operator!=( const Rectangle& One, const Rectangle& Two )
{
  // INCOMPLETE

    return (One.length() != Two.length() && One.width() != Two.width())
        || (One.length() != Two.width() && One.width() != Two.length());
}

