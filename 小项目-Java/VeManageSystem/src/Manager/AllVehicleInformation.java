package Manager;

import Trans.Bus;
import Trans.Car;
import Trans.Truck;
import Trans.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AllVehicleInformation {
    //存放车辆的合集
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //添加车辆的方法
    public void addVehicle(Vehicle v) {
        //先判断是否已满
        int maxsize = 100;
        if (vehicles.size() >= maxsize) {
            System.out.println("当前的车辆信息管理系统信息库已满，不能再进行添加");
            return;
        }

        //判断编号是否重复
        for (Vehicle exist : vehicles) {
            if (exist.getVehicleId().equals(v.getVehicleId())) {
                System.out.println("当前的车辆信息管理系统信息库中已存在这辆车的信息，请你重新添加");
                System.out.println();
                return;
            }
        }

        vehicles.add(v);
        System.out.println("添加成功！当前车辆总数为：" + vehicles.size());
    }

    //计算总费用的方法
    public double calculateTotalCost(Vehicle v) {
        return Vehicle.getOilPrice() * v.getFuelConsumption() * v.getTotalKm() + v.getBasicMaintenance() + v.getRoadTax();
    }

    //展示车辆的所有信息
    public void showAll() {
        if (vehicles.isEmpty()) {
            System.out.println("当前的车辆信息管理系统信息库是空的");
            System.out.println();
        } else {
            System.out.println("下面是已经记录了的车辆:");
            for (Vehicle v : vehicles) {
                double total = calculateTotalCost(v);
                switch (v.getModel()) {
                    case "大客车" -> {
                        Bus bus = (Bus) v;
                        System.out.println(" [" + v.getInfo() + " | 载客量:" + bus.getPassengerCapacity() + " | 总费用:" + total + "] ");
                    }
                    case "小轿车" -> {
                        Car car = (Car) v;
                        System.out.println(" [" + v.getInfo() + " | 厢数:" + car.getCarriage() + " | 总费用:" + total + "] ");
                    }
                    case "卡车" -> {
                        Truck truck = (Truck) v;
                        System.out.println(" [" + v.getInfo() + " | 载重量:" + truck.getLoadCapacity() + " | 总费用:" + total + "] ");
                    }
                }
            }
            System.out.println();
        }
    }

    //查询车辆的方法
    public void Search() {
        while (true) {
            System.out.println("---请选择你要查询的方式：1.制造公司  2.车辆编号  3.车辆类别---(如要退出请按4)");
            int choice = InputUtil.nextInt("请输入你的选项：");

            if (choice == 1) {
//                sc.nextLine();                          //吃掉上一个nextInt（）留下的换行符

                String search1 = InputUtil.nextString("请输入你要查询的制造公司：");

                boolean found = false;
                for (Vehicle v : vehicles) {
                    if (search1.equals(v.getManufacturer())) {
                        if (!found) {
                            System.out.println("以下是 " + search1 + " 的车辆信息：");
                            found = true;
                        }
                        double total = calculateTotalCost(v);
                        switch (v) {
                            case Bus b ->
                                    System.out.println(" [" + v.getInfo() + " | 载客量:" + b.getPassengerCapacity() + " | 总费用:" + total + "] ");
                            case Car c ->
                                    System.out.println(" [" + v.getInfo() + " | 厢数:" + c.getCarriage() + " | 总费用:" + total + "] ");
                            case Truck t ->
                                    System.out.println(" [" + v.getInfo() + " | 载重量:" + t.getLoadCapacity() + " | 总费用:" + total + "] ");
                            default -> throw new IllegalStateException("Unexpected value: " + v);
                        }
                    }
                }
                if (!found) {
                    System.out.println("该制造公司的车辆不存在！");
                }
            } else if (choice == 2) {
                String search2 = InputUtil.nextString("请输入你要查询的车辆编号：");

                boolean found = false;
                for (Vehicle v : vehicles) {
                    if (search2.equals(v.getVehicleId())) {
                        if (!found) {
                            System.out.println("以下是 " + search2 + " 的车辆信息：");
                            found = true;
                        }
                        double total = calculateTotalCost(v);
                        switch (v) {
                            case Bus b ->
                                    System.out.println(" [" + v.getInfo() + " | 载客量:" + b.getPassengerCapacity() + " | 总费用:" + total + "] ");
                            case Car c ->
                                    System.out.println(" [" + v.getInfo() + " | 厢数:" + c.getCarriage() + " | 总费用:" + total + "] ");
                            case Truck t ->
                                    System.out.println(" [" + v.getInfo() + " | 载重量:" + t.getLoadCapacity() + " | 总费用:" + total + "] ");
                            default -> throw new IllegalStateException("Unexpected value: " + v);
                        }
                    }
                }
                if (!found) {
                    System.out.println("不存在该编号的车辆！");
                }
            } else if (choice == 3) {
                String search3 = InputUtil.nextString("请输入你要查询的车辆类别：");

                boolean found = false;
                for (Vehicle v : vehicles) {
                    if (search3.equals(v.getModel())) {
                        if (!found) {
                            System.out.println("以下是 " + search3 + " 的车辆信息：");
                            found = true;
                        }
                        //用一个变量去接收总费用
                        double total = calculateTotalCost(v);
                        switch (v) {
                            case Bus b ->
                                    System.out.println(" [" + v.getInfo() + "|载客量:" + b.getPassengerCapacity() + "|总费用:" + total + "] ");
                            case Car c ->
                                    System.out.println(" [" + v.getInfo() + "|厢数:" + c.getCarriage() + "|总费用:" + total + "] ");
                            case Truck t ->
                                    System.out.println(" [" + v.getInfo() + "|载重量:" + t.getLoadCapacity() + "|总费用:" + total + "] ");
                            default -> throw new IllegalStateException("Unexpected value: " + v);
                        }
                    }
                }
                if (!found) {
                    System.out.println("该类别没有车辆！");
                }
            } else if (choice == 4) {
                System.out.println("正在退出~");
                return;
            } else {
                System.out.println("不存在此选项，请重新输入！");
            }


        }
    }


    //编辑功能：先按属性查询--->再进行编辑
    public void Edit() {
        System.out.println("---请查询你要编辑的车辆：（退出请输入4）");
        System.out.println("1.按制造公司");
        System.out.println("2.按车辆编号");
        System.out.println("3.按车辆类别");
        int choice = InputUtil.nextInt("请输入你的选项：");

        if (choice == 1) {
//            sc.nextLine();
            String company = InputUtil.nextString("请输入要查找的制造公司：");
            ArrayList<Vehicle> results = new ArrayList<>();
            for (Vehicle v : vehicles) {
                if (v.getManufacturer().equals(company)) {
                    results.add(v);
                }
            }
            if (results.isEmpty()) {
                System.out.println("未查询到相关制造公司的车辆");
                //if while true return
            } else if (results.size() == 1) {
                System.out.println("为你找到这一辆相关搜索的车：");
                System.out.println("[" + results.getFirst().getInfo() + "]");
                editVehicle(results.getFirst());
            } else {
                System.out.println("找到" + results.size() + "辆相关的车：");
                for (int i = 0; i < results.size(); i++) {
                    System.out.println((i + 1) + "." + results.get(i).getInfo());
                }
                String SelectId = InputUtil.nextString("请输入要查询的车辆编号:");
                for (Vehicle v : results) {
                    if (v.getVehicleId().equals(SelectId)) {
                        editVehicle(v);
                        return;
                    }
                }
                System.out.println("为查找到相关车辆");
            }

        } else if (choice == 2) {

//            sc.nextLine();
            String id = InputUtil.nextString("请输入要查找的车辆编号：");
            Vehicle target = null;
            for (Vehicle v : vehicles) {
                if (v.getVehicleId().equals(id)) {
                    target = v;
                    break;
                }
            }
            if (target == null) {
                System.out.println("未找到该编号的车辆");
                return;
            }
            editVehicle(target);

        } else if (choice == 3) {
//            sc.nextLine();
//            System.out.println("请输入你要查找的车辆类别：（卡车，小轿车，大客车）");
            String type = InputUtil.nextString("请输入你要查找的车辆类别（卡车，小轿车，大客车）：");
            ArrayList<Vehicle> results = new ArrayList<>();
            for (Vehicle v : vehicles) {
                if (v.getModel().equals(type)) {
                    results.add(v);
                }
            }
            if (results.isEmpty()) {
                System.out.println("未查找到该类别的车辆");
            } else if (results.size() == 1) {
                System.out.println("为你找到这一辆相关搜索的车：");
                System.out.println("[" + results.getFirst().getInfo() + "]");
                editVehicle(results.getFirst());
            } else {
                System.out.println("以下是你查询到的车辆：");
                for (int i = 0; i < results.size(); i++) {
                    System.out.println((i + 1) + "." + results.get(i).getInfo());
                }

                String SelectID = InputUtil.nextString("请输入要编辑的车辆编号：");
                for (Vehicle v : results) {
                    if (v.getVehicleId().equals(SelectID)) {
                        editVehicle(v);
                    }
                }
                System.out.println("未查询到该编号的车辆");
            }
        }
    }


    public void editVehicle(Vehicle v) {
        while (true) {
            System.out.println("---请输入你要更改的数据：(退出请输入11)---");
            System.out.println("1.车辆编号  2.车牌号  3.制造公司");
            System.out.println("4.购买时间  5.总公里数");
            System.out.println("6.每公里的油耗量  7.养路费");
            System.out.println("8.载客量（大客车） 9.车厢数（小轿车） 10.载重量（卡车）");
            int choice = InputUtil.nextInt("请输入你的选项：");
            if (choice == 1) {
                System.out.println("当前车辆的编号是：" + v.getVehicleId());
                while (true) {
                    String ID = InputUtil.nextString("请输入你要更改的车辆编号：");
                    boolean found = false;
                    for (Vehicle exist : vehicles) {
                        if (exist.getVehicleId().equals(ID)) {
                            System.out.println("该车辆的编号已经存在！");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        v.setVehicleId(ID);
                        System.out.println("成功修改该车辆编号为：" + ID + "!");
                        System.out.println();
                        break;
                    }
                }
            } else if (choice == 2) {
                System.out.println("当前车辆的车牌号为：" + v.getPlateNumber());
                while (true) {
                    String plate = InputUtil.nextString("请输入你要更改的车牌号：");
                    boolean found = false;
                    for (Vehicle exist : vehicles) {
                        if (exist.getPlateNumber().equals(plate)) {
                            System.out.println("已经存在此车牌号的车辆");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        v.setPlateNumber(plate);
                        System.out.println("成功修改该车辆的车牌号为：" + plate + "!");
                        System.out.println();
                        break;
                    }

                }
            } else if (choice == 3) {

                System.out.println("当前车辆的制造公司是：" + v.getManufacturer());
                String manufacturer = InputUtil.nextString("请输入你要更改的制造公司：");
                v.setManufacturer(manufacturer);
                System.out.println("成功修改该车辆的制造公司为：" + manufacturer + "!");
                System.out.println();

            } else if (choice == 4) {

                System.out.println("当前车辆的购买时间是：" + v.getPurchaseDate());

                String time = InputUtil.nextString("请输入你要更改的购买时间：");
                v.setPurchaseDate(time);
                System.out.println("成功修改该车辆的购买时间为：" + time + "!");
                System.out.println();

            } else if (choice == 5) {
                System.out.println("当前车辆的总公里数是：" + v.getTotalKm());
                double km = InputUtil.nextDouble("请输入你要更改的总公里数：");
                v.setTotalKm(km);
                System.out.println("成功修改该车辆的总公里数为：" + km + "!");
                System.out.println();
            } else if (choice == 6) {

                System.out.println("当前车辆的每公里耗油量是：" + v.getFuelConsumption());
                double con = InputUtil.nextDouble("请输入你要更改的每公里耗油量：");
                v.setFuelConsumption(con);
                System.out.println("成功修改该车辆的每公里耗油量为：" + con + "!");
                System.out.println();

            } else if (choice == 7) {

                System.out.println("当前车辆的养路费是：" + v.getBasicMaintenance());
                double fee = InputUtil.nextDouble("请输入你要更改的养路费：");
                v.setRoadTax(fee);
                System.out.println("成功修改该车辆的养路费为：" + fee + "!");
                System.out.println();

            } else if (choice == 8) {

                if (v instanceof Bus b) {
                    System.out.println("当前大客车的载客量是：" + b.getPassengerCapacity());
                    String PassengerCapacity = InputUtil.nextString("请输入你要更改的载客量：");
                    b.setPassengerCapacity(PassengerCapacity);
                    System.out.println("成功修改该车辆的载客量为：" + PassengerCapacity + "!");
                    System.out.println();
                } else {
                    System.out.println("该车辆无法修改载客量！");
                }

            } else if (choice == 9) {

                if (v instanceof Car c) {
                    System.out.println("当前小轿车的车厢数是：" + c.getCarriage());
                    String Carriage = InputUtil.nextString("请输入你要更改的车厢数：");
                    c.setCarriage(Carriage);
                    System.out.println("成功修改该车辆的车厢数为：" + Carriage + "!");
                    System.out.println();
                } else {
                    System.out.println("该车辆无法修改车厢数！");
                }

            } else if (choice == 10) {
                if (v instanceof Truck t) {
                    System.out.println("当前卡车的载重量为：" + t.getLoadCapacity());
                    double load = InputUtil.nextDouble("请输入你要更改的载重量：");
                    t.setLoadCapacity(load);
                    System.out.println("成功修改该车辆的载重量为：" + load + "!");
                } else {
                    System.out.println("该车辆无法修改载重量！");
                }
            } else if (choice == 11) {
                return;
            } else {
                System.out.println("不存在这个选项！请重新选择！");
            }

        }
    }

    //删除车辆信息数据
    public void DeleteNum() {
        //初步判断信息库是否有存储有车辆
        if (vehicles.isEmpty()) {
            System.out.println("车辆信息库为空！");
            return;
        } else {
            showAll();
        }
        String id = InputUtil.nextString("请输入你要删除的车辆编号:");
        boolean found = false;
        //获取vehicles集合的迭7、
        Iterator<Vehicle> it = vehicles.iterator();
        //用has.next()循环判断迭代器是否还有下一个元素
        while (it.hasNext()) {
            Vehicle v = it.next();
            if (v.getVehicleId().equals(id)) {
                it.remove();
                found = true;
                System.out.println("已经删除编号为" + v.getVehicleId() + "的车辆.");
            }
        }
        if (!found) {
            System.out.println("该编号不存在");
        }

    }

    public void statistics() {
        if (vehicles.isEmpty()) {
            System.out.println("车辆信息库为空！");
            return;
        }
        showAll();

        int b = 0, c = 0, t = 0;

        for (Vehicle v : vehicles) {
            if (v instanceof Bus) {
                b++;
            } else if (v instanceof Car) {
                c++;
            } else if (v instanceof Truck) {
                t++;
            }
        }
        System.out.println("当前车辆信息库中共有 " + vehicles.size() + " 辆车");
        System.out.println("其中：大客车 " + b + " 辆，小轿车 " + c + " 辆，卡车 " + t + " 辆");
    }

    public void saveToFile() {

        try (PrintWriter out = new PrintWriter(new FileWriter("vehicles_data.txt"))) {
            for (Vehicle v : vehicles) {
                out.println(v.toFileString());
            }
            System.out.println("数据已保存到 vehicles_data.txt");
        } catch (IOException e) {
            System.out.println("保存失败：" + e.getMessage());
        }

    }

    public void loadFromFile() {
        vehicles.clear();

        File file = new File("vehicles_data.txt");

        if (!file.exists()) {
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Vehicle v = Vehicle.fromFileString(line);
                if (v != null) {
                    vehicles.add(v);
                }
            }
        } catch (IOException e) {
            System.out.println("加载失败：" + e.getMessage());
        }
    }
}

