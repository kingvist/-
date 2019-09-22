import java.util.*;

class Integer {
	int value;                     

	Integer(int k) {
		value = k;                   

	}

	//访问器和修改器
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	boolean Even() {          
		return value % 2 == 0;
	}

	boolean Odd() {
		return value % 2 == 1;
	}                          //布尔型isOdd方法判断该数是否为素数

static boolean Prime(Integer i) {        
		boolean z = true;                        
		for (int j = 2; j < i.value; j++) {            
			if (i.value % j == 0) {
				z = false;
			}
		}
		return z;
	}
}

class HomeWork7Day1_1 {

	public static void main(String[] args) {

		System.out.println("请输入数字：");
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		Integer p1 = new Integer(n);        
		System.out.println("该数是否是偶数" + p1.Even());
		System.out.println("该数是否是奇数" + p1.Odd());
		System.out.println("该数是否是素数：" + p1.Prime(p1));

	}

}
