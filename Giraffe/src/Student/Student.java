package Student;

public class Student implements Comparable<Student>
{
	private String name;
	private int rno;
	private int age;
	
	public Student(String name,int rno,int age)
	{
		this.name=name;
		this.rno=rno;
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setRno(int rno)
	{
		this.rno=rno;
	}
	public int getRno()
	{
		return rno;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	@Override
    public int compareTo(Student comparestu) {
        int compareage=((Student)comparestu).getAge();
        /* For Ascending order*/
        return this.age-compareage;
	}
	
	@Override
    public String toString() {
        return "[ rollno=" + rno + ", name=" + name + ", age=" + age + "]";
    }
}
