import java.util.*;
class Prism{
	int area ;            
    int high;            
    int volume;          
    Prism(int a,int k){
        area = a;
        high = k;        
    }                        
    int gitvolume() {
        volume = area * high;
        return volume;
    }                       
    //修改器
    void setarea(int area) {
        this.area = area;
    }
    void sethigh(int high) {
        this.high = high;
    }   
}
class Rect {
    int length;
    int width;
    int perimeter;
    int area;           //长宽面积周长成员变量
     Rect(int n, int k) {
        length = n;
        width = k;
    }                        //构造方法 将值赋给成员变量
     int gitarea() {
        area = length * width;
        return area;
    }                        //计算返回面积
     int perimeter1() {
        perimeter = 2 * (length + width);
        return perimeter;
    }                        //计算返回周长
}

public class HomeWork5Day1_1{
    public static void main(String[] args) {            //主方法
        // TODO Auto-generated method stub
        System.out.println("请输入矩形的长和宽：");
        Scanner i = new Scanner(System.in);
        int number1 = i.nextInt();
        int number2 = i.nextInt();    
        Rect a = new Rect(number1, number2);            //创建对象传入值 num1,num2
        System.out.println("矩形的面积为：" + a.gitarea()); 
        System.out.println("矩形的周长为：" + a.perimeter1());
        System.out.println("请输入四棱柱高：");
        int number3 = i.nextInt();    
        Prism b = new Prism(a.area, number3);        //创建对象 将矩形面积和高传入volume1方法中
        System.out.println("四棱柱体积为：" + b.gitvolume());    //调用volume1方法 输出体积
        System.out.println("请输入更换的矩形的长和宽：");
        int number4 = i.nextInt();
        int number5 = i.nextInt();    
        Rect c = new Rect(number4, number5);                //创建对象将新的值传入Rect类中
        System.out.println("修改后的矩形的面积为：" + c.gitarea());        //调用area1计算新的面积
        System.out.println("请输入更换的四棱柱高：");
        int number6 = i.nextInt();    
        Prism d = new Prism(c.area, number6);                        //创建对象传入新的值
        System.out.println("修改后四棱柱体积为：" + d.gitvolume());        //调用volume计算体积
    }
}