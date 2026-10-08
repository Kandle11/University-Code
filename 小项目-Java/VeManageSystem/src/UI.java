import Function.*;
import Manager.AllVehicleInformation;

import Trans.Vehicle;

import java.util.Scanner;

public class UI {
    /*
    系统中的车辆主要有大客车、小轿车和卡车。每种车辆有车辆编号、
    车牌号、车辆制造公司、车辆购买时间、车辆型号（大客车、小轿车和卡车）、
    总公里数、耗油量/公里、基本维护费用、养路费、累计总费用等信息。

    大客车还有载客量（最大载客数）信息，

    小轿车还有箱数（两厢或三厢）信息，

    卡车还有载重量等信息。

    每台车辆当月总费用=油价*耗油量/公里+基本维护费用。

    基本维护费用：客车：2000元/月，小轿车：1000元/月，卡车：1500元/月
*/
    public static void main(String[] args) {

        AllVehicleInformation manager = new AllVehicleInformation();
//        // ====== 测试数据初始化（可删除） ======
//        manager.addVehicle(new Bus("B001", "粤A12345", "宇通客车", "2023-01-15", 15000, 0.28, 2000, "45人"));
//        manager.addVehicle(new Bus("B002", "粤B67890", "金龙客车", "2024-03-20", 8000, 0.30, 2000, "50人"));
//        manager.addVehicle(new Car("C001", "粤C11111", "比亚迪", "2023-06-01", 25000, 0.08, 1000, "三厢"));
//        manager.addVehicle(new Car("C002", "粤D22222", "特斯拉", "2024-09-10", 12000, 0.06, 1000, "两厢"));
//        manager.addVehicle(new Car("C003", "粤E33333", "比亚迪", "2025-01-01", 5000, 0.07, 1000, "三厢"));
//        manager.addVehicle(new Truck("T001", "粤F44444", "东风汽车", "2022-11-11", 80000, 0.45, 1500, 8.5));
//        manager.addVehicle(new Truck("T002", "粤G55555", "解放汽车", "2023-07-07", 45000, 0.40, 1500, 12.0));
//        System.out.println("已加载 7 条测试数据！");
//        // ================================

        System.out.println();
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                                          ║");
        System.out.println("║  🚗 欢 迎 进 入 车 辆 管 理 系 统 🚗     ║");
        System.out.println("║                                          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("┌─────────────── 主菜单 ───────────────┐");
            System.out.println("│                                      │");
            System.out.println("│    1. 📥 添加车辆                    │");
            System.out.println("│    2. 🔍 查询车辆                    │");
            System.out.println("│    3. 📋 显示车辆信息库              │");
            System.out.println("│    4. ✏️ 编辑车辆信息                │");
            System.out.println("│    5. 🗑️ 删除车辆                    │");
            System.out.println("│    6. 📊 统计信息                    │");
            System.out.println("│    7. 📁 车辆信息存盘                │");
            System.out.println("│    8. 📂 读出车辆信息                │");
            System.out.println("│    9. 📁 保存当前信息并退出系统       │");
            System.out.println("│    10.⛽ 更新当前油价                 │");
            System.out.println("│    11.🚪 退出车辆管理系统             │");
            System.out.println("│                                      │");
            System.out.println("└──────────────────────────────────────┘");
            System.out.print("➡️  请输入你想要进行的操作 (1-11): ");

            String input = sc.next();
            int operation;
            try {
                operation = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("⚠️  输入无效，请输入数字 1-11！");
                continue;
            }

            System.out.println();
            System.out.println("──────────────────────────────────────────");

            if (operation == 1) {

                AddVehicles_1.Add(manager);

            } else if (operation == 2) {

                SearchVehicles_2.Search(manager);

            } else if (operation == 3) {

                ShowAllTheInform_3.ShowAll(manager);

            } else if (operation == 4) {

                Edit_4.EditVe(manager);

            } else if (operation == 5) {

                DeleteNum_5.DeleteN(manager);

            } else if (operation == 6) {

                StatisticalInformation_6.Static(manager);

            } else if (operation == 7) {

                Storage_7.Storage(manager);        // 存盘
                System.out.println("存盘成功！");

            } else if (operation == 8) {

                LoadFile_8.LoadFile(manager);      // 读盘
                System.out.println("读盘成功！");

            } else if (operation == 9) {

                Storage_7.Storage(manager);        // 退出前先存盘
                System.out.println("数据已保存，退出系统");
                break;

            } else if (operation == 10) {

            System.out.print("⛽ 请输入当前的油价(元/升)：");
            double price = sc.nextDouble();
            Vehicle.setOilPrice(price);
            System.out.println("✅ 油价已更新为：" + price + " 元/升");

        } else if (operation == 11) {

            System.out.println();
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("      👋感谢使用车辆管理系统,再见!            ");
            System.out.println("╚══════════════════════════════════════════╝");
            return;

        } else {
            System.out.println("⚠️  不存在此选项，请重新选择！");
        }
    }

}
}