package vectors;

public class ParseDirection {
    public static void main(String[] args) {
        String poleFrom = "";
        String poleTo = "";
        double degreesChange = 0.0;
        double poleDegrees;
        boolean subtract = false;
        boolean noModifier = false;
        
        if (poleFrom.equalsIgnoreCase("N")) {
            poleDegrees = 0;
        } else if (poleFrom.equalsIgnoreCase("E")) {
            poleDegrees = 90;
        } else if (poleFrom.equalsIgnoreCase("S")) {
            poleDegrees = 180;
        } else if (poleFrom.equalsIgnoreCase("W")) {
            poleDegrees = 270;
        }
        
        if (degreesChange == 0) {
            noModifier = true;
        } else {
            noModifier = false;
        }
        
        if (poleTo.equalsIgnoreCase("N")) {
            
        }
    }
}