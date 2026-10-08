package ArrayFun;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
    public static void main(String[] args) {
    /*
    常见方法
    1.boolean add(E e)          将数据添加到末尾
    2.void add(int index,E e)   将数据添加到指定位置
    3.boolean remove(E e)       根据元素删除
    4.E remove(int index)       根据索引删除
    5.E set(int index, E e)     将指定位置的数据，修改为新元素
    6.E get(int index)          获取特定索引的数据
    7.int size（）               获取集合长度
     */
        ArrayList<String> list = new ArrayList<>();

        list.add("AirPlane");
        list.add("xyy");
        list.add("cyl");
        list.add("lrx");
        list.add("xyy");
        list.add("dy");
//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (list.get(i).equals("xyy")) {
//                list.remove(i);
//            }
//        }
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String l = iterator.next();
//            if(l.equals("xyy")){
//                iterator.remove();
//            }
//        }
        list.add(7,"ZBC");
        System.out.println(list);
        System.out.println(list.size());
    }

}
