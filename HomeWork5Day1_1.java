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
    //�޸���
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
    int area;           //��������ܳ���Ա����
     Rect(int n, int k) {
        length = n;
        width = k;
    }                        //���췽�� ��ֵ������Ա����
     int gitarea() {
        area = length * width;
        return area;
    }                        //���㷵�����
     int perimeter1() {
        perimeter = 2 * (length + width);
        return perimeter;
    }                        //���㷵���ܳ�
}

public class HomeWork5Day1_1{
    public static void main(String[] args) {            //������
        // TODO Auto-generated method stub
        System.out.println("��������εĳ��Ϳ�");
        Scanner i = new Scanner(System.in);
        int number1 = i.nextInt();
        int number2 = i.nextInt();    
        Rect a = new Rect(number1, number2);            //����������ֵ num1,num2
        System.out.println("���ε����Ϊ��" + a.gitarea()); 
        System.out.println("���ε��ܳ�Ϊ��" + a.perimeter1());
        System.out.println("�������������ߣ�");
        int number3 = i.nextInt();    
        Prism b = new Prism(a.area, number3);        //�������� ����������͸ߴ���volume1������
        System.out.println("���������Ϊ��" + b.gitvolume());    //����volume1���� ������
        System.out.println("����������ľ��εĳ��Ϳ�");
        int number4 = i.nextInt();
        int number5 = i.nextInt();    
        Rect c = new Rect(number4, number5);                //���������µ�ֵ����Rect����
        System.out.println("�޸ĺ�ľ��ε����Ϊ��" + c.gitarea());        //����area1�����µ����
        System.out.println("������������������ߣ�");
        int number6 = i.nextInt();    
        Prism d = new Prism(c.area, number6);                        //�����������µ�ֵ
        System.out.println("�޸ĺ����������Ϊ��" + d.gitvolume());        //����volume�������
    }
}