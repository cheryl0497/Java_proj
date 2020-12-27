package Hr;


public class Employee implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private transient String password; //transient field will not be included in serialization
	private int experience;
	private double salary;

	public final String getCode(){
		return code;
	}

	public final void setCode(String value){
		code = value;
	}
	
	public final String getPassword(){
		return password;
	}

	public final void setPassword(String value){
		password = value;
	}

	public final int getExperience(){
		return experience;
	}

	public final void setExperience(int value){
		experience = value;
	}

	public final double getSalary(){
		return salary;
	}

	public final void setSalary(double value){
		salary = value;
	}

	@Override
	public String toString(){
		return String.format("%s\t%d\t%.2f", code, experience, salary);
	}
	
}



















