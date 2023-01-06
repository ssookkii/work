package sample01;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("헬로우 자바");
		
		// 한줄 주석문 -> 컴파일 X
		
		/*
		 	범위 주석문
		 	
		 */
		
		System.out.println("Hello World");
		System.out.print("Hello");
	
		System.out.print("월드");
		
		// 기능 : escape sequence
		// \n 개행 , \b backspace, \" 따옴표 표현 , \t 띄어쓰기
		
		System.out.print("Hello\n");
		
		System.out.print("월드\b");
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello World\t");
		System.out.println("\\Hello World\\");
		
		System.out.printf("--%s-- \n", "Hello");
		//                표현자료형 ,   값
		
		System.out.println(1024);
		System.out.println("hello" + "월드");
		
	}

}
