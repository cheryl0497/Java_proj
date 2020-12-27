package Person;

public class AddressClass {
	 private int id;
	 private String fname;
	 private String lname;
	
	
	public AddressClass(int id,String fname,String lname)
	{
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}
	
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public String getFname()
	{
		return fname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof AddressClass) {
            AddressClass pp = (AddressClass) obj;
            return (pp.fname.equals(this.fname) && pp.lname == this.lname);
        } else {
            return false;
        }
    }
	@Override
    public String toString() {
        return "[ id =" + id + ", Firstname=" + fname + ", LastName=" + lname + "]";
    }
}
