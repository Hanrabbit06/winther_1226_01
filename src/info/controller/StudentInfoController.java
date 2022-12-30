package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.StudentView;
import info.vo.SchoolInfo;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentInfoController {
	private static final int CONTINUE = 1; //계속하기
	private static final int EXIT = 0; //고만하기
	ArrayList<StudentVO> svoList;
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> stuIds = new ArrayList<Integer>();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		ArrayList<String> majors = new ArrayList<String>();
		ArrayList<String> mobiles = new ArrayList<String>();
		ArrayList<String> addresses = new ArrayList<String>();
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		int flag = CONTINUE;
		System.out.println("=======================\t학생 정보 입력 화면\t=======================");
		while (true) {
			if(flag == CONTINUE) {
				System.out.print("== 이름 : ");
				names.add(s1.nextLine());
				System.out.print("== 학년 : ");
				grades.add(s2.nextInt());
				System.out.print("== 학번 : ");
				stuIds.add(s2.nextInt());	
				System.out.print("== 학과 : ");
				majors.add(s1.nextLine());
				System.out.print("== 전번 : ");
				mobiles.add(s1.nextLine());
				System.out.print("== 주소 : ");
				addresses.add(s1.nextLine());
			}
			else if(flag == EXIT) {
				break;
			}
			
			System.out.print("계속 입력하시겠습니까?(계속: 1, 종료: 0) : ");
			flag = s2.nextInt();
			System.out.println("---------------------------------------------------------------");
		}
		
		StudentInfoController controller = new StudentInfoController();
		StudentDAO dao = new StudentDAO();
		
		for(int i =0; i < names.size(); i++) {
			StudentVO svo = new StudentVO(names.get(i), majors.get(i), mobiles.get(i), addresses.get(i), stuIds.get(i), grades.get(i));
			dao.insert(svo); //폴바이 레퍼런스
		}
		controller.svoList = dao.select();
		
		StudentView stuView = new StudentView();
		stuView.view(controller.svoList);
		
		s1.close();
		s2.close();
	}
}
