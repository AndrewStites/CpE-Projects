public class LandTract {
	public int length;
	public int width;

public int area() {
	return length*width;
}

public boolean equals(LandTract landobj) {
	if((length == landobj.length && width == landobj.width) || (length == landobj.width && width == landobj.length))
		return true;
		return false;
}

public String toString() {
	return "LandTract object with length "+length+" width "+width;
}
}