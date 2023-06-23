package CourseDay5;

public class NoDataFoundException extends Exception {
	private String invalidData;

	public NoDataFoundException(String errorMessage,String invalidData) {
		super(errorMessage);
		this.invalidData = invalidData;
	}

	@Override
	public String getMessage() {
		String errMsg=super.getMessage();
		String finalMessage=errMsg+"-->"+invalidData;
		return finalMessage;
	}

}
