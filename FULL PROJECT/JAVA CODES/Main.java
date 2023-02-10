import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        do {
            selectShapeAndPerform ( welcome () );
        }while ( getExitChoice () );
        ending ();
    }

    public static void ending(){
        System.out.println ( "**********THANK YOU FOR USING THE SOFTWARE!**********" );
    }

    public static int welcome ( ) {
        System.out.println ( "_________________________________________" );
        System.out.println ( "|COMPANY : ABC                          |" );
        System.out.println ( "|DIVISION : ENGINEERING                 |" );
        System.out.println ( "|GEOMETRIC CONVERSION CALCULATOR        |" );
        System.out.println ( "|BY                                     |" );
        System.out.println ( "|HESSA-202004412                        |" );
        System.out.println ( "|ALREEM-20200413                        |" );
        System.out.println ( "|ALIA-202004414                         |" );
        System.out.println ( "|NAEEMA-20200415                        |" );
        System.out.println ( "-----------------------------------------" );
        System.out.println ( "****************************" );
        System.out.println ( "*                          *" );
        System.out.println ( "* 1. 2D FIGURES CALCULATOR *" );
        System.out.println ( "* 2. 3D FIGURES CALCULATOR *" );
        System.out.println ( "*                          *" );
        System.out.println ( "****************************" );
        System.out.print ( "-CHOOSE AN OPTION : " );
        return ((new Scanner ( System.in ).nextInt ( )));
    }

    private static boolean getExitChoice(){
        System.out.println ( "-Do you want to exit(y/n) : " );
        return new Scanner ( System.in ).next ().charAt ( 0 ) == 'n';
    }

    public static void selectShapeAndPerform ( int option ) {
        if ( option < 1 )
            option = 1;
        else if ( option > 2 )
            option = 2;
        switch ( option ) {
            case 1:
                System.out.println ( "*************************" );
                System.out.println ( "*                       *" );
                System.out.println ( "* 1. CIRCLE             *" );
                System.out.println ( "* 2. SQUARE             *" );
                System.out.println ( "* 3. TRIANGLE           *" );
                System.out.println ( "* 4. RECTANGLE          *" );
                System.out.println ( "*                       *" );
                System.out.println ( "*************************" );
                System.out.print ( "-CHOOSE AN OPTION : " );
                shape2D ( new Scanner ( System.in ).nextInt ( ) );
                break;
            case 2:
                System.out.println ( "*************************" );
                System.out.println ( "*                       *" );
                System.out.println ( "* 1. TRIANGULAR PYRAMID *" );
                System.out.println ( "* 2. CUBE               *" );
                System.out.println ( "* 3. SQUARE PYRAMID     *" );
                System.out.println ( "* 4. CONE               *" );
                System.out.println ( "* 5. CYLINDER           *" );
                System.out.println ( "*************************" );
                System.out.print ( "-CHOOSE AN OPTION : " );
                shape3D ( new Scanner ( System.in ).nextInt ( ) );
        }
    }

    private static void shape2D ( int option ) {
        String units = units     ( "* UNITS :               *" );
        String convertTo = units ( "* CONVERSIONS :         *" );
        shape2D shape2D = new shape2D ( );
        if ( option < 1 )
            option = 1;
        else if ( option > 4 )
            option = 4;
        switch ( option ) {
            case 1:
                System.out.println ( "-Please enter radius of circle : " );
                shape2D.calculateCircle ( new Scanner ( System.in ).nextInt ( ) , units , convertTo );
                break;
            case 2:
                System.out.println ( "-Please enter side : " );
                shape2D.calculateSquare ( new Scanner ( System.in ).nextInt ( ) , units , convertTo );
                break;
            case 3:
                System.out.print ( "-Please enter base : " );
                double base = new Scanner ( System.in ).nextDouble ( );
                System.out.println ( "-Please enter height : " );
                double height = new Scanner ( System.in ).nextDouble ( );
                shape2D.calculateTriangle ( base , height , units , convertTo );
                break;
            case 4:
                System.out.print ( "-Please enter length : " );
                int length = new Scanner ( System.in ).nextInt ( );
                System.out.println ( "-Please enter width : " );
                int width = new Scanner ( System.in ).nextInt ( );
                shape2D.calculateRectangle ( length , width , units , convertTo );
        }
    }

    private static void shape3D(int option){
        String units = units     ( "* UNITS :               *" );
        String convertTo = units ( "* CONVERSIONS :         *" );
        shape3D shape3D = new shape3D ( );
        if ( option < 1 )
            option = 1;
        else if ( option > 4 )
            option = 4;
        switch ( option ){
            case 1:
                System.out.println ( "-Please enter base area : " );
                double baseArea = new Scanner ( System.in ).nextInt ();
                System.out.println ( "-Please enter perimeter : " );
                double perimeter = new Scanner ( System.in ).nextDouble ();
                System.out.println ( "-Please enter slant height : " );
                double slantHeight = new Scanner ( System.in ).nextDouble ();
                shape3D.calculateTriangularPyramid ( baseArea , perimeter , slantHeight , units , convertTo );
                break;
            case 2:
                System.out.println ( "-Please enter side of cube : " );
                double side = new Scanner ( System.in ).nextDouble ();
                shape3D.calculateCube ( side , units , convertTo );
                break;
            case 3:
                System.out.println ( "-Please enter height : " );
                double height = new Scanner ( System.in ).nextDouble ();
                System.out.println ( "-Please enter area : " );
                double area = new Scanner ( System.in ).nextDouble ();
                shape3D.squarePyramid ( area , height , units , convertTo );
                break;
            case 4:
                System.out.println ( "-Please enter radius : " );
                double radius = new Scanner ( System.in ).nextDouble ();
                System.out.println ( "-Please enter height : " );
                double Height = new Scanner ( System.in ).nextDouble ();
                shape3D.cone ( radius,Height,units,convertTo );
                break;
            case 5:
                System.out.println ( "-Please enter radius : " );
                double Radius = new Scanner ( System.in ).nextDouble ();
                System.out.println ( "-Please enter height : " );
                double _Height = new Scanner ( System.in ).nextDouble ();
                shape3D.cylinder ( Radius , _Height , units , convertTo );
                break;
        }
    }

    private static String units ( String message ) {
        System.out.println ( "*************************" );
        System.out.println ( "*                       *" );
        System.out.println ( message );
        System.out.println ( "* 1. cm                 *" );
        System.out.println ( "* 2. dm                 *" );
        System.out.println ( "* 3. m                  *" );
        System.out.println ( "* 4. km                 *" );
        System.out.println ( "* 5. in                 *" );
        System.out.println ( "* 6. ft                 *" );
        System.out.println ( "* 7. yd                 *" );
        System.out.println ( "* 8. mi                 *" );
        System.out.println ( "*                       *" );
        System.out.println ( "*************************" );
        System.out.print ( "-Select an option : " );
        switch ( new Scanner ( System.in ).nextInt ( ) ) {
            case 1:
                return "cm";
            case 2:
                return "dm";
            case 3:
                return "m";
            case 4:
                return "km";
            case 5:
                return "in";
            case 6:
                return "ft";
            case 7:
                return "yd";
            case 8:
                return "mi";
        }
        return "";
    }
}
