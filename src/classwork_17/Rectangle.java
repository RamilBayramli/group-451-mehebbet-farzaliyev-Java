package classwork_17;
public class Rectangle {
	class rectangle {
	    int width;
	    int height;
	    rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }
	    rectangle(int width) {
	        this.width = width;
	        this.height = 1; 
	    }
	    int area() {
	        return width * height;
	    }
}
}