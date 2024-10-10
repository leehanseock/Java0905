package BookManagementSystem01;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

//CRUD 기능을 담당할 Service 클래스
public class BookManageService {
    //책 객체를 저장을 위한 ArrayList 객체 생성
    ArrayList<BookDTO> BookList = new ArrayList<BookDTO>();

    //BookManageService 클래스에서 사용할 입력값을 받은 스캐너 객체 생성
    Scanner input01 = new Scanner(System.in);

    //Create
    public void addBook() {
        System.out.println("추가할 도서의 정보를 입력해주십시오.");
        System.out.print("ISBN(13자리):");
        long ISBN = 0;
        try {
            ISBN = input01.nextLong();
            input01.nextLine(); // 버퍼 비우기
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        System.out.print("도서명:");
        String bookName = "";
        try {
            //공백있는 제목을 받기위해 nextLine 사용
            bookName = input01.nextLine();
            input01.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        System.out.print("저자명:");
        String author = "";
        try {
            author = input01.nextLine();
            input01.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        System.out.print("출판사:");
        String publisher = "";
        try {
            publisher = input01.nextLine();
            input01.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        System.out.print("가격:");
        int price = 0;
        try {
            price = input01.nextInt();
            input01.nextLine();
            if (price < 0) {
                System.out.println("잘못된 입력입니다.");
                input01.next();
            }
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        System.out.print("출판일 (예: 2024-10-10):");
        LocalDate publicationDate = null;
        try {
            String dateInput = input01.next();
            // 문자열을 LocalDate로 변환
            publicationDate = LocalDate.parse(dateInput);
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        } catch (DateTimeParseException e) {
            System.out.println("날짜 형식이 잘못되었습니다. YYYY-MM-DD 형식으로 입력해주세요.");
        }

        System.out.print("쪽수:");
        int pages = 0;
        try {
            pages = input01.nextInt();
            input01.nextLine();
            if(price <0 ){
                System.out.println("잘못된 입력입니다.");
            }
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }

        BookDTO book = new BookDTO(ISBN, bookName, author, publisher, price, publicationDate, pages);
        BookList.add(book);

        //테스트
        for (int i = 0; i < BookList.size() ; i++){
            System.out.printf("[%d] %s ",i+1, BookList.get(i).toString());
        }
    }
    //Read

    //Update

    //Delete
}
