import java.text.DecimalFormat;

public class shape3D {
    private final Converter converter;
    private final DecimalFormat format;

    public shape3D ( ) {
        converter = new Converter ( );
        format = new DecimalFormat ( "0.00" );
    }

    public void calculateTriangularPyramid ( double baseArea , double perimeter , double slantHeight , String units , String convertTo ) {
        baseArea = converter.convert ( baseArea , units , convertTo );
        perimeter = converter.convert ( perimeter , units , convertTo );
        slantHeight = converter.convert ( slantHeight , units , convertTo );
        System.out.println ( "SURFACE AREA : " + format.format ( baseArea + (perimeter * slantHeight) / 2 ) + convertTo + " square" );
        System.out.println ( "VOLUME : " + format.format ( baseArea * slantHeight / 3 ) + convertTo + " cube" );
    }

    public void calculateCube ( double area , String units , String convertTo ) {
        area = converter.convert ( area , units , convertTo );
        System.out.println ( "SURFACE AREA : " + format.format ( 6 * Math.pow ( area , 2 ) ) + convertTo + " square" );
        System.out.println ( "VOLUME : " + format.format ( Math.pow ( area , 3 ) ) + convertTo + " cube" );
    }

    public void squarePyramid ( double area , double height , String units , String convertTo ) {
        area = converter.convert ( area , units , convertTo );
        height = converter.convert ( height , units , convertTo );
        System.out.println ( "SURFACE AREA : " + format.format ( Math.pow ( area , 2 ) + 2 * area * Math.sqrt ( (Math.pow ( area , 2 ) / 4) + Math.pow ( height , 2 ) ) ) + convertTo + " square" );
        System.out.println ( "VOLUME : " + format.format ( Math.pow ( area , 2 ) * height / 3 ) + convertTo + " cube" );
    }

    public void cone ( double radius , double height , String units , String convertTo ) {
        radius = converter.convert ( radius , units , convertTo );
        height = converter.convert ( height , units , convertTo );
        final double pi = 3.14;
        System.out.println ( "SURFACE AREA : " + format.format ( pi * radius * (radius + Math.sqrt ( Math.pow ( height , 2 ) + Math.pow ( radius , 2 ) )) ) + convertTo + " square" );
        System.out.println ( "VOLUME : " + format.format ( pi * Math.pow ( radius , 2 ) * height / 3 ) + convertTo + " cube" );
    }

    public void cylinder ( double radius , double height , String units , String convertTo ) {
        radius = converter.convert ( radius , units , convertTo );
        height = converter.convert ( height , units , convertTo );
        final double pi = 3.14;
        System.out.println ( "SURFACE AREA : " + format.format ( 2 * pi * radius * height + 2 * pi * Math.pow ( radius , 2 ) ) + convertTo + " square" );
        System.out.println ( "VOLUME : " + format.format ( pi * Math.pow ( radius , 2 ) * height ) + convertTo + " cube" );
    }


}
