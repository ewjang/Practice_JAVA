package sec01_exam_StringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		
		//buffer(L1,L2캐쉬, 램까지 확장)를 허용하기 때문에 새로운 인스턴스가 새성되지 않는다.
		StringBuilder sb=new StringBuilder();
		//System.out.println(sb.hashCode());
		sb.append("JAVA");
		sb.append(" Program Study");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		sb.insert(3, 2); //숫자2를 넣어도 컴파일시 문자열로 바뀐다.
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");  //사이 값이 Book으로 바뀐다.
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		int length=sb.length();
		
		System.out.println("총 문자수:"+length);
		System.out.println(sb.hashCode());
		String result=sb.toString();
		System.out.println(result);
		

	}

}
