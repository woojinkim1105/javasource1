package register;

public class Member {
	//속성 - 아이디, 이름, 주소, 이메일, 나이(정수)
	//외부에서 접근 불가능하게 선언하기
	private String id;
	private String name;
	private String address;
	private String email;
	int age;

	//생성자(모든 속성을 초기화할 수 있는 상태)
	public Member(String id, String name, String address, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
	}


	//get/set 메소드
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


	
	
	//toString 구현
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age
				+ "]";
	}
	
	
	
}
