import java.util.*;

class Integer {
	int value;                     

	Integer(int k) {
		value = k;                   

	}

	//���������޸���
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
	}                          //������isOdd�����жϸ����Ƿ�Ϊ����

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

		System.out.println("���������֣�");
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		Integer p1 = new Integer(n);        
		System.out.println("�����Ƿ���ż��" + p1.Even());
		System.out.println("�����Ƿ�������" + p1.Odd());
		System.out.println("�����Ƿ���������" + p1.Prime(p1));

	}

}
