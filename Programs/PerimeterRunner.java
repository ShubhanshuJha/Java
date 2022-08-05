import java.awt.*;
import java.util.*;
public class PerimeterRunner{
	public double getPerimeter(Shape s){
		Scanner sc=new Scanner(System.in);
		double totalPerim=0;
		Point prevPt=s.getLastPoint();
		for (Point currPt:s.getPoints()) {
			double currDist=prevPt.distance(currPt);
			totalPerim=totalPerim+currDist;
			prevPt=currPt;
		}
		return totalPerim;
	}
}