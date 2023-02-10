public class Converter {
    public double convert ( double value , String units , String convertTo ) {
        switch ( units ) {
            case "cm":
                switch ( convertTo ) {
                    case "dm":
                        value /= 10.0f;
                        break;
                    case "m":
                        value /= 100.0f;
                        break;
                    case "km":
                        value /= 100000.0f;
                        break;
                    case "in":
                        value /= 2.54;
                        break;
                    case "ft":
                        value /= 30.48;
                        break;
                    case "yard":
                        value /= 91.44;
                        break;
                    case "mi":
                        value /= 160934;
                        break;
                }
                break;
            case "dm":
                switch ( convertTo ) {
                    case "cm":
                        value *= 10;
                        break;
                    case "m":
                        value /= 10;
                        break;
                    case "km":
                        value /= 10000;
                        break;
                    case "in":
                        value *= 3.937;
                        break;
                    case "ft":
                        value /= 3.048;
                        break;
                    case "yard":
                        value /= 9.144;
                        break;
                    case "mi":
                        value /= 16093;
                        break;
                }
                break;
            case "m":
                switch ( convertTo ) {
                    case "cm":
                        value *= 100;
                        break;
                    case "dm":
                        value *= 10;
                        break;
                    case "km":
                        value /= 1000;
                        break;
                    case "in":
                        value *= 39.37;
                        break;
                    case "ft":
                        value *= 3.281;
                        break;
                    case "yard":
                        value *= 1.094;
                        break;
                    case "mi":
                        value /= 1609;
                        break;
                }
                break;
            case "km":
                switch ( convertTo ) {
                    case "cm":
                        value *= 100000;
                        break;
                    case "dm":
                        value *= 10000;
                        break;
                    case "m":
                        value *= 1000;
                        break;
                    case "in":
                        value *= 39370;
                        break;
                    case "ft":
                        value *= 3281;
                        break;
                    case "yard":
                        value *= 1094;
                        break;
                    case "mi":
                        value /= 1.609;
                        break;
                }
                break;
            case "in":
                switch ( convertTo ) {
                    case "cm":
                        value *= 2.54;
                        break;
                    case "dm":
                        value /= 3.937;
                        break;
                    case "m":
                        value /= 39.37;
                        break;
                    case "km":
                        value /= 39370;
                        break;
                    case "ft":
                        value /= 12;
                        break;
                    case "yard":
                        value /= 36;
                        break;
                    case "mi":
                        value /= 63360;
                        break;
                }
                break;
            case "ft":
                switch ( convertTo ) {
                    case "cm":
                        value *= 30.48;
                        break;
                    case "dm":
                        value *= 3.048;
                        break;
                    case "m":
                        value /= 3.281;
                        break;
                    case "km":
                        value /= 3281;
                        break;
                    case "in":
                        value *= 12;
                        break;
                    case "yard":
                        value /= 3;
                        break;
                    case "mi":
                        value /= 5280;
                        break;
                }
                break;
            case "yard":
                switch ( convertTo ) {
                    case "cm":
                        value *= 91.44;
                        break;
                    case "dm":
                        value *= 9.144;
                        break;
                    case "m":
                        value /= 1.094;
                        break;
                    case "km":
                        value /= 1094;
                        break;
                    case "in":
                        value *= 36;
                        break;
                    case "ft":
                        value *= 3;
                        break;
                    case "mi":
                        value /= 1760;
                        break;
                }
                break;
            case "mi":
                switch ( convertTo ) {
                    case "cm":
                        value *= 160934;
                        break;
                    case "dm":
                        value *= 106093;
                        break;
                    case "m":
                        value *= 1609;
                        break;
                    case "km":
                        value *= 1.609;
                        break;
                    case "in":
                        value *= 63360;
                        break;
                    case "ft":
                        value *= 5280;
                        break;
                    case "yard":
                        value *= 1760;
                        break;
                }
                break;
        }
        return value;
    }
}
