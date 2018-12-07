package rakesh.practice.programs.All_Mine;

public class Learning {

	private String subject;
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private int hours;
	
	public int getHours (String subject) {
		
		if (subject.equalsIgnoreCase("Java")) {
			hours = 30;
		} else {
			if (subject.equalsIgnoreCase("Sql")) {
				hours = 10;
			}
		}
		return hours;
	}
}
