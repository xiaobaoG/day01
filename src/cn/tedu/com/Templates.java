package cn.tedu.com;

/**
 * 常用模板
 * @author xiaobao
 * @date 2018/12/26 - 12:45
 */
public class Templates {
//    模板一：psvm
    public static void main(String[] args) {

//    模板二：sout
        System.out.println("hello!!");
//    模板三：fori
        int [] arr=new int[]{1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
//        iter
        for (int i : arr) {
            System.out.println(i);

        }
//        itar
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println(i1);
        }
//        模板四：list.for

    }




}
