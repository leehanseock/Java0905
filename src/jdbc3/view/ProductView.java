package jdbc3.view;

import jdbc3.entity.Product;

import java.util.ArrayList;

public class ProductView {
    public void printHeader() {
        System.out.println("***************************");
        System.out.println("******* Product List ******");
        System.out.println("***************************");
    }

    public void printFooter() {
        System.out.println("***************************");
        System.out.println("********* End Print *******");
        System.out.println("***************************");
    }

    public void printProduct(ArrayList<Product> proList) {
        for(Product p : proList) {
            System.out.println("* 제품번호: "+p.getProNum());
            System.out.println("* 제품명: "+p.getProName());
            System.out.println("* 재고량: "+p.getProStock());
            System.out.println("* 단가: "+p.getProPrice());
            System.out.println("* 제조업체: "+p.getProduceName());
            System.out.println();
        }

    }

    public static void printView(ArrayList<Product> arrayList) {
        ProductView view = new ProductView();
        view.printHeader();
        view.printProduct(arrayList);
        view.printFooter();
    }
}
