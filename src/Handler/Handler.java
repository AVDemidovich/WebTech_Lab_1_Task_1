package Handler;

/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */
public class Handler {
    public static double calculateValueOfExpression(double x,double y) {

        return ( (1 + Math.pow(Math.sin(x + y),2)) / 2 + Math.abs( x -  (2*x) / (1+x*x*y*y)));
    }

    public  static boolean checkData(double testNumberX,double testNumberY) {
        if (testNumberX<=0 || testNumberY<=0 )
            return false;
        else
            return  true;
    }
}
