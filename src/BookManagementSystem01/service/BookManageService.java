package BookManagementSystem01.service;
import BookManagementSystem01.dto.BookDTO;

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

    //초기 도서 10권 초기화를 위한 생성자 정의
    public BookManageService(){
        //기본 도서 10권 초기화
        initiateBook();
    }

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
            System.out.printf("[%d] %s \n",i+1, BookList.get(i).toString());
        }
    }
    //Read -도서 조회 메소드-
    public void searchBook(int passedNum){
        // 검색 결과와 일치하는 책 객체를 담을 ArrayList 선언
        ArrayList<BookDTO> searchResult = new ArrayList<BookDTO>();

        //도서 조회
        try {
            switch (passedNum) {
                case 1:
                    System.out.println("찾으려는 ISBN 13자리를 입력해주십시오.");
                    long searchISBN =0;
                    //사용자로부터 검색어 입력받기(ISBN 13자)
                    searchISBN = input01.nextLong();
                    for (BookDTO searched : BookList) {
                        if (searched.getISBN() == searchISBN ) {
                            searchResult.add(searched);
                        }
                    }
                    break;
                case 2:
                    System.out.println("찾으려는 도서명을 입력해주십시오.");
                    String searchedTitle = "";
                    //사용자로부터 검색어 입력받기(ISBN 13자)
                    searchedTitle = input01.nextLine();
                    for (BookDTO searched : BookList) {
                        if (searched.getBookName().contains(searchedTitle) ) {
                            searchResult.add(searched);
                        }
                    }
                    break;
                case 3:
                    System.out.println("찾으려는 저자명을 입력해주십시오.");
                    String searchedAuthor = "";
                    //사용자로부터 검색어 입력받기(ISBN 13자)
                    searchedAuthor = input01.nextLine();
                    for (BookDTO searched : BookList) {
                        if (searched.getAuthor().contains(searchedAuthor) ) {
                            searchResult.add(searched);
                        }
                    }
                    break;
                case 4:
                    System.out.println("찾으려는 출판사명을 입력해주십시오.");
                    String searchedPublisher = "";
                    //사용자로부터 검색어 입력받기(ISBN 13자)
                    searchedPublisher = input01.nextLine();
                    for (BookDTO searched : BookList) {
                        if (searched.getPublisher().contains(searchedPublisher) ) {
                            searchResult.add(searched);
                        }
                    }
                    break;
                default:
                    System.out.println("유효하지 않은 옵션");
                    break;
            }
            //최종 검색 결과 출력
            for (int i = 0; i < searchResult.size() ; i++){
                System.out.printf("[%d] %s \n",i+1, searchResult.get(i).toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. y나 n으로만 답해주십시오.");
        }
    }

    //Update

    //Delete
    public void deleteBook(){
        System.out.println("삭제하려는 도서의 ISBN 13자리 숫자를 입력해주십시오.");
        try {
            long deleteISBN = input01.nextLong();
            for (int j = 0 ; j < BookList.size() ; j++){
                if (BookList.get(j).getISBN() == deleteISBN) {
                    BookList.remove(BookList.get(j));
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
            input01.next();
        }
    }

    //Print -시스템 보유 도서 목록 출력-
    public void printBookList(){
        for (int k = 0; k < BookList.size() ; k++){
            System.out.printf("[%d] %s \n",k+1, BookList.get(k).toString());
        }
    }

    //초기화
    public void initiateBook(){
        BookList.add(new BookDTO(9788936434120L, "소년이 온다", "한강","창비", 15000, LocalDate.of(2014,5,19), 216));
        BookList.add(new BookDTO(9788936434595L, "채식주의자", "한강","창비", 15000, LocalDate.of(2022,3,28), 276));
        BookList.add(new BookDTO(9791171711673L, "하루 한 장 나의 어휘력을 위한 필사 노트", "유선경","위즈덤하우스", 23800, LocalDate.of(2024,3,28), 372));
        BookList.add(new BookDTO(9791193506844L, "생각의 연금술", "제임스 알렌","포레스트북스", 19800, LocalDate.of(2014,9,25), 308));
        BookList.add(new BookDTO(9791157847679L, "박태웅의 AI 강의 2025", "박태웅","한빛비즈", 18800, LocalDate.of(2024,9,30), 420));
        BookList.add(new BookDTO(9788936448752L, "고양이 해결사 깜냥 7", "홍민정","창비", 14000, LocalDate.of(2024,9,27), 92));
        BookList.add(new BookDTO(9791194353003L, "가장 완벽한 세금 절세의 기술", "염지훈, 최승혁","이든하우스", 20000, LocalDate.of(2024,9,24), 348));
        BookList.add(new BookDTO(9788998441012L, "모순", "양귀자","쓰다", 13000, LocalDate.of(2013,4,1), 308));
        BookList.add(new BookDTO(9791198517425L, "불변의 법칙", "모건 하우절","서삼독", 25000, LocalDate.of(2024,2,28), 420));
        BookList.add(new BookDTO(9791169211277L, "파이썬 크래시 코스", "에릭 마테스","한빛미디어", 39000, LocalDate.of(2023,8,3), 700));
        BookList.add(new BookDTO(9788937460470L, "호밀밭의 파수꾼", "제롬 데이비드 샐린저","민음사", 12000, LocalDate.of(2023,1,17), 320));
    }
}