package milestone1.abstractionAndPackages.exceptions.studentMarks;

public class MarksOutOfRangeException extends InvalidMarksException{
	public MarksOutOfRangeException() {
		super("Marks out of Range Exception");
	}
}
