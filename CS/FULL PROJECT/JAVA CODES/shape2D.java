import java.text.DecimalFormat;

public class shape2D {
    private final Converter converter;
    private final DecimalFormat format;

    public shape2D ( ) {
        converter = new Converter ( );
        format = new DecimalFormat ( "0.00" );
    }

    public void calculateCircle ( double radius , String units , String convertTo ) {
        radius = converter.convert ( radius , units , convertTo );
        final double pi = 3.14;
        System.out.println ( "AREA : " + format.format ( pi * Math.pow ( radius , 2 ) ) + convertTo + " square" );
        System.out.println ( "CIRCUMFERENCE : " + format.format ( 2 * pi * radius ) + convertTo );
    }

    public void calculateSquare ( double side , String units , String convertTo ) {
        side = converter.convert ( side , units , convertTo );
        System.out.println ( "AREA : " + format.format ( side * side ) + convertTo + " square" );
        System.out.println ( "PERIMETER : " + format.format ( 4 * side ) + convertTo );
    }

    public void calculateTriangle ( double base , double height , String units , String convertTo ) {
        base = converter.convert ( base , units , convertTo );
        height = converter.convert ( height , units , convertTo );
        System.out.println ( "AREA : " + format.format ( base * height / 2 ) + convertTo + " square" );
        System.out.println ( "PERIMETER : " + format.format ( base + height ) + convertTo );
    }

    public void calculateRectangle ( double length , double width , String units , String convertTo ) {
        length = converter.convert ( length , units , convertTo );
        width = converter.convert ( width , units , convertTo );
        System.out.println ( "AREA : " + (length * width) + convertTo + " square" );
        System.out.println ( "PERIMETER : " + (2 * (length + width)) + convertTo );
    }


}
