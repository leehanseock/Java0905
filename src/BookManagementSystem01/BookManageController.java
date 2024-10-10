package BookManagementSystem01;

//Service 클래스 내 기능을 호출해서 프로그램을 실행할 Controller 클래스
public class BookManageController {

    public static void main(String[] args) {
        BookManageView viewer = new BookManageView();
        viewer.showMenu();
        viewer.addBookPrompt();
    }

}
