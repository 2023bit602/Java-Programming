public class Practical4 {
// getShort() function
    int getShort(int num) {
        int range = 65536;
        int shortValue = num % range;
        if (shortValue > 32767) {
            shortValue -= range;
        } else if (shortValue < -32768) {
            shortValue += range;
        }
        return shortValue;
    }
// getByte() function
    int getByte(int num) {
        int range = 256;
        int byteValue = num % range;
        if (byteValue > 127) {
            byteValue -= range;
        } else if (byteValue < -128) {
           byteValue += range;
       }
       return byteValue;
    }
// getNumber() function
    int getNumber(int num, String type) {
        int value = 0;
        //convert the input to lower-case
        String typeAfter = type.toLowerCase();
   
        if (typeAfter.equals("byte")) {
            value = getByte(num);
        } else if (typeAfter.equals("short")) {
            value = getShort(num);
        }
        return value;
    }
// toXXSystem() function
    String toXXSystem(String num, String XX) {
            // determine the base of the input number using Integer.decode
            int value=0;
            value = Integer.decode(num);
            
            // Convert the value to the required system
            String system = XX.toLowerCase();
            switch (system) {
                case "b": // Binary System
                    return "0b" + Integer.toBinaryString(value);
                case "o": // Octal System
                    return "0" + Integer.toOctalString(value);
                case "h": // Hexadecimal System
                    return "0x" + Integer.toHexString(value).toUpperCase();
                case "d": // Decimal System
                    return String.valueOf(value);
                default:
                    throw new IllegalArgumentException("Invalid system.");
            }
        }
}
