import com.example.administrator.myapplication.model.Circle;
import com.example.administrator.myapplication.model.Rectangle;
import com.example.administrator.myapplication.model.Shape;
import com.example.administrator.myapplication.model.Square;
import com.example.administrator.myapplication.model.Triangle;


public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape square = new Square(4);
        square.display();
        Shape rectangle = new Rectangle(8,4);
        rectangle.display();
        Shape circle = new Circle(4);
        circle.display();
        Shape triangle = new Triangle(8,4);
        triangle.display();
	}

}
