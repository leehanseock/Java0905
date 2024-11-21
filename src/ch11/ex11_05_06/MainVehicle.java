package ch11.ex11_05_06;

public class MainVehicle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Train KTX = new Train();
        Vehicle vehicle = new Bicycle();

        vehicle.horn();
        vehicle.move("이태원역","한국폴리텍대학 정수캠퍼스");

        bicycle.horn();
        bicycle.move("혜화역", "한성대입구");//Vehicle의 default 메소드가 호출

        KTX.horn();
        KTX.move("서울","부산");
        
        Vehicle vehicle2 = new Train();
        vehicle2.horn();
        vehicle2.move("부산","진주");//Train의 오버라이딩된 메소드 호출

        Vehicle.stop("창경궁뜰");
        Bicycle.stop("경복궁");
    }
}
