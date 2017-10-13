package zxt;

public class zhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//斐波纳契数列
		int i1 = 0;
		int i2 = 1;
		
		int temp;
		
		for (int p = 1;p<=20;p++){
			System.out.println(i1+i2);
			temp = i1;
			i1 = i2;
			i2 = temp+i2;
		}
*/
	/*	//水仙花
		for(int n=100;n<1000;n++){
			int i=n/100;//百分位
			int j=n/10%10;//十分位
			int k=n%10;//个位
			if(n==i*i*i+j*j*j+k*k*k){
				System.out.println(" "+n);
			}
	*/		
			//输出10000-100000之间的素数
		
	/*	for (int n = 10000; n < 100000; n++) {
			boolean b = true;
			for(int f = 2 ; f < n ;f++){
				if(n%f == 0){
					b  = false;
					break;
				}
			}
			if (b == true){
				System.out.println(n);
			}
         }
*/
		//打印正三角
	/*	 for(int i = 1; i <= 6; i++)
	        {
	            for(int j=1;j<=6-i;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int n=1;n<=(i-1)*2+1;n++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
*/
		//数据排列
	/*	int [] array={4,3,5,1,2};//声明一个整数组，并初始化
		String str="这几个数的排列为：";//声明string变量，并且初始化
		int temp;
		for(int j=array.length-1;j>0;j--){
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println(str);
		for (int serial = 0; serial < array.length; serial++) {
			System.out.println(array[serial]); //打印数组
		}
*/
		//乘法口诀表
	/*	int i,j,k;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				k=i*j;
				System.out.print(j+"*"+i+"="+k+" ");
			}
			System.out.println();
		}
		*/
		
	}
}


