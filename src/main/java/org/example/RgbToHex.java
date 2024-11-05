package org.example;

import org.hamcrest.core.Is;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;


//The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
//
//Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
//
//Examples (input --> output):
//255, 255, 255 --> "FFFFFF"
//255, 255, 300 --> "FFFFFF"
//0, 0, 0       --> "000000"
//148, 0, 211   --> "9400D3"

public class RgbToHex {
    public String rgb(int r, int g, int b) {
        String result = convert(r) + convert(g) + convert(b);
        return result;
    }

    public static String convert(int value) {
        if (value < 0) value = 0;
        if (value > 255) value = 255;
        String conResult = Integer.toHexString(value);
        if (Character.isDigit(conResult.charAt(0)) && conResult.length() < 2) conResult = 0 + conResult;
        conResult = conResult.toUpperCase(Locale.ROOT);
        if (conResult.length() == 1 && Character.isLetter(conResult.charAt(0))) conResult = 0 + conResult;


        return conResult;
    }
}