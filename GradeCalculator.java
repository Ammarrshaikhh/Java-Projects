public class GradeCalculator{

    public static void main(String[] args) {
    
    int intAssignMark = 40;
    double dblActualMark = 32.5;
    int intBonus = 2;
    
    double dblPercent = (dblActualMark + intBonus) / 
    intAssignMark * 100;
    
    System.out.println("Assignment mark: " + dblActualMark + 
    "/" + intAssignMark + " (+" + intBonus + " bonus)");
    System.out.println("(" + dblPercent + "%)");
    }
        }
    