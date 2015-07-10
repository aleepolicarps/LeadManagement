package onb.leadmanagement.domain.model;

public class ProjectAlreadyFinishedExcpetion extends RuntimeException {

	private static final long serialVersionUID = -7246329539328799173L;

	public ProjectAlreadyFinishedExcpetion() {
	}

	public ProjectAlreadyFinishedExcpetion(String message) {
		super(message);
	}

	public ProjectAlreadyFinishedExcpetion(Throwable cause) {
		super(cause);
	}

	public ProjectAlreadyFinishedExcpetion(String message, Throwable cause) {
		super(message, cause);
	}

	public ProjectAlreadyFinishedExcpetion(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
