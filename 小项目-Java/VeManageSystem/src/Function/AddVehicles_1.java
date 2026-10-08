
package Function;

import Manager.AllVehicleInformation;
import Manager.InputUtil;

import Trans.Bus;
import Trans.Car;
import Trans.Truck;

//1.增添车辆
public class AddVehicles_1 {
    private AddVehicles_1() {
    }

    public static void Add(AllVehicleInformation manager) {
        while (true) {
            System.out.println("---请选择车型：1.大客车 2.小轿车 3.卡车---（退出请输入四）");
            int choice = InputUtil.nextInt("请输入数字：");        //优化,Int  &&   如果输入不对应的信息应该提示并告知

            if(choice == 4){
                return;
            }

            String id = InputUtil.nextString("请输入车辆编号：");
            String plate = InputUtil.nextString("请输入车牌号：");
            String manufacturer = InputUtil.nextString("请输入车辆的制造厂商：");
            String purchaseDate = InputUtil.nextString("请输入车辆购买的时间(年-月-日)：");
            double totalKm = InputUtil.nextDouble("请输入车辆的总公里数(km)：");
            double fuelPerKm = InputUtil.nextDouble("请输入每公里需要消耗的燃油(L)：");
            double roadFee = InputUtil.nextDouble("请输入养路费：");
//            System.out.println("请输入油价：");
//            int oilPrice = sc.nextInt();

            if (choice == 1) {
                String passengerCapacity = InputUtil.nextString("请输入这辆大客车载客量(人)：");
                Bus b = new Bus(id, plate, manufacturer, purchaseDate, totalKm, fuelPerKm,
                         roadFee, passengerCapacity);
                manager.addVehicle(b);
            } else if (choice == 2) {
                String Carriage = InputUtil.nextString("请输入这辆小轿车的厢数：");
                Car c = new Car(id, plate, manufacturer, purchaseDate, totalKm, fuelPerKm,
                         roadFee, Carriage);
                manager.addVehicle(c);
            } else if (choice == 3) {
                double Capacity = InputUtil.nextDouble("请输入这辆卡车的载重量(kg)：");
                Truck t = new Truck(id, plate, manufacturer, purchaseDate, totalKm, fuelPerKm,
                         roadFee, Capacity);
                manager.addVehicle(t);
            }else {
                System.out.println("不存在这个选项！请重新选择!");
            }

        }
    }
}
