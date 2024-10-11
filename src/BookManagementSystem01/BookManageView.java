package BookManagementSystem01;
import java.util.Scanner;
import java.util.InputMismatchException;

//콘솔에 출력되는 UI를 담당할 View 클래스
public class BookManageView {
    //BookManageView 클래스에서 사용할 입력값을 받은 스캐너 객체 생성
    Scanner input02 = new Scanner(System.in);

    //BookManageService 내 메소드를 불러오기 위한 객체 생성
    BookManageService service = new BookManageService();

    //메뉴 출력 메소드
    public void showMenu() {
        System.out.println("============================도서 관리 시스템============================");
        System.out.println("Menu : 1. 도서 등록 2. 도서 조회 3. 도서 정보 수정 4. 도서 정보 삭제 5. 도서 정보 출력");
        System.out.print("메뉴 선택 : ");
        try {
            int answer00 = input02.nextInt();
            switch (answer00) {
                case 1:
                    System.out.println("1번 도서 등록 선택");
                    addBookPrompt();
                    break;
                case 2:
                    System.out.println("2번 도서 조회 선택");
                    break;
                case 3:
                    System.out.println("3번 도서 정보 수정 선택");
                    break;
                case 4:
                    System.out.println("4번 도서 정보 삭제 선택");
                    break;
                case 5:
                    System.out.println("5번 도서 정보 출력 선택");
                    break;
                default:
                    System.out.println("유효하지 않은 옵션");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
        }
    }

    //책 추가 여부 확인 메소드
    public void addBookPrompt() {
        System.out.println("새로운 책을 시스템에 등록하시겠습니까?(y/n)");
        try {
            //사용자 입력
            String answer01 = input02.next();
            //사용자 입력이 y나 Y일 때
            if (answer01.equalsIgnoreCase("y")) {
                //서비스 메소드의 도서 추가 메소드 호출
                service.addBook();
            } else if (answer01.equalsIgnoreCase("n")) {
                System.out.println("서비스 종료");
            } else {
                System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
            }

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
        }


    }
}