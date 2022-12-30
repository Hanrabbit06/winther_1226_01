package info.vo;

//학생 정보를 저장하는 Object(Value Object)
//필드 : 값을 저장하기 위한
//Setter, Getter 메소드 : 필드 값을 성절 또는 반환하는 메소드
//생성자 : 전체 필드 값을 초기화


public class StudentVO {
	private String name, major, address, mobile; //성명, 전공, 전화, 주소
	private int stuId, grade; //학번 , 학년
	
	//생성자 (Source => Generate Constructor using Fields...)
	public StudentVO(String name, String major, String address, String mobile, int stuId, int grade) {
		super();
		this.name = name;
		this.major = major;
		this.address = address;
		this.mobile = mobile;
		this.stuId = stuId;
		this.grade = grade;
	}	
	//(Source => Generate Getters and Setters...)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//(Source => Generate toStrong()...)
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", major=" + major + ", address=" + address + ", mobile=" + mobile
				+ ", stuId=" + stuId + ", grade=" + grade + "]";
	}
	
}
