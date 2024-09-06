package edu.kh.oop.method.model.vo;

public class Member { //속성+기능
	
	//필드
	private String MemberId; //아이디
	private String MemberPw; //비밀번호
	private String MemberName; //이름
	private int MemberAge; //나이
	
	
	//생성자
	//생성자 규칙 : 반환형이 없고 클래스명과 이름이 같아야한다
	
	//기본 생성자
	//단축키 ctrl + space -> enter (제일 첫번째)
	public Member() {}

	//매개변수 생성자 (필드 모두 초기화)
	//단축키 alt + shift + s -> o(아래서3번째)
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		//오버로딩 적용(매개변수의 개수 다름,하나라도 다르면 적용됨)
		
		//매개변수로 전달받은값을 필드에 대입 과정
		MemberId = memberId;
		MemberPw = memberPw;
		MemberName = memberName;
		MemberAge = memberAge;
	}
	
	
	//메서드
	//단축키 alt + shift + s -> r

	@Override
	public String toString() {
		return "Member [MemberAge=" + MemberAge + ", MemberId=" + MemberId + ", MemberName=" + MemberName
				+ ", MemberPw=" + MemberPw + "]";
	}

	public String getMemberId() {
		return MemberId;
	}

	public void setMemberId(String memberId) {
		MemberId = memberId;
	}

	public String getMemberPw() {
		return MemberPw;
	}

	public void setMemberPw(String memberPw) {
		MemberPw = memberPw;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	public int getMemberAge() {
		return MemberAge;
	}

	public void setMemberAge(int memberAge) {
		MemberAge = memberAge;
	}
	

}
