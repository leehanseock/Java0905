package BookManagementSystem01.view;
import BookManagementSystem01.service.BookManageService;

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
        //while문 돌리기 위한 boolean 변수 선언
        boolean loop = true;

        while (loop) {
            System.out.println("=======================================도서 관리 시스템=======================================");
            System.out.println("Menu : 1. 도서 등록 2. 도서 조회 3. 도서 정보 수정 4. 도서 정보 삭제 5. 도서 정보 출력 (0. 시스템 종료)");
            System.out.print("메뉴 선택 : ");
            try {
                int answer00 = input02.nextInt();
                switch (answer00) {
                    case 0:
                        System.out.println("0번 시스템 종료 선택");
                        System.out.println("시스템이 종료되었습니다.");
                        loop = false;
                        break;
                    case 1:
                        System.out.println("1번 도서 등록 선택");
                        addBookPrompt();
                        break;
                    case 2:
                        System.out.println("2번 도서 조회 선택");
                        searchBookPrompt();
                        break;
                    case 3:
                        System.out.println("3번 도서 정보 수정 선택");
                        updateBookPrompt();
                        break;
                    case 4:
                        System.out.println("4번 도서 정보 삭제 선택");
                        deleteBookPrompt();
                        break;
                    case 5:
                        System.out.println("5번 도서 정보 출력 선택");
                        printBookListPrompt();
                        break;
                    default:
                        System.out.println("유효하지 않은 옵션");
                        break;
                }
            } catch (InputMismatchException e) {
                input02.next();
                System.out.println("잘못된 입력입니다. 메뉴 번호만 입력해 주십시오.");
            }
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

        //도서 조회를 위한 필드 선택 메소드
        public void searchBookPrompt() {
            System.out.println("도서정보를 조회하시겠습니까?(y/n)");
            try {
                //사용자 입력(y/n)
                String answer01 = input02.next();
                //사용자 입력이 y나 Y일 때
                if (answer01.equalsIgnoreCase("y")) {
                    try {
                        System.out.println("========================도서 정보 카테고리========================");
                        System.out.println("Menu : 1. ISBN(13자리) 2. 도서명 3. 저자명 4. 출판사");
                        System.out.println("어떤 정보를 검색하시겠습니까?");
                        //사용자 입력(카테고리 선택)
                        int answer02 = input02.nextInt();
                        switch (answer02) {
                            case 1:
                                // 도서 조회 메소드 호출
                                service.searchBook(1);
                                break;
                            case 2:
                                service.searchBook(2);
                                break;
                            case 3:
                                service.searchBook(3);
                                break;
                            case 4:
                                service.searchBook(4);
                                break;
                            default:
                                System.out.println("유효하지 않은 옵션");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 메뉴 번호로만 답해주십시오.");
                    }
                } else if (answer01.equalsIgnoreCase("n")) {
                    System.out.println("서비스 종료");
                } else {//'y'나 'n' 이외의 문자로 답했을 때
                    System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
            }
        }

    //도서 삭제 여부를 묻는 메소드
    public void deleteBookPrompt(){
        System.out.println("시스템에서 삭제할 도서가 있으십니까?(y/n)");
        System.out.println("(ISBN 번호를 모르실 경우 0번을 누르십시오. 도서정보 조회로 넘어갑니다.)");
        try {
            //사용자 입력
            String answer03 = input02.next();
            //사용자 입력이 y나 Y일 때
            if (answer03.equalsIgnoreCase("y")) {
                //서비스 메소드의 도서 삭제 메소드 호출
                service.deleteBook();
            } else if (answer03.equalsIgnoreCase("n")) {
                System.out.println("서비스 종료");
            } else if (Integer.parseInt(answer03)==0){
                // 도서 조회를 위한 필드 검색메소드 호출
                searchBookPrompt();
            }
            else {
                System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
        }
    }

    //도서 정보 수정 여부를 묻는 메소드
    public void updateBookPrompt(){
        //도서 목록 출력
        service.printBookList();
        System.out.println("시스템에서 수정할 도서가 있으시면 해당 도서의 ISBN 번호를 입력해주십시오.");
        long toUpdate = 0;
        //사용자로부터 ISBN 13자 입력받기
        toUpdate = input02.nextLong();
        input02.nextLine();
        service.updateBook(toUpdate);
    }

    //도서 목록 출력 메소드 호출
    public void printBookListPrompt(){
        service.printBookList();
    }
}