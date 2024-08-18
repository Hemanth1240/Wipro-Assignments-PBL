package milestone1.abstractionAndPackages.exceptions.studentMarks;

public class NegativeMarksException extends InvalidMarksException{
	public NegativeMarksException() {
		super("Negative Marks are not allowed");
	}
}
