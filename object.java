package zxt;

public class object {

	 String change(int i)
	  {
	   String aa="";
	   String str=String.valueOf(i);//把数字转化为字符串
	   int n=str.length();//取长度
	   int m = n,k;
	   boolean bln = true;
	   boolean bln2=true;
	   for(int j=0;j<n;j++)
	   {
	     char a1 = str.charAt(j);//取每个数字
	     if((n!=1)&a1=='0')//加(n!=1)的原因是如果只是一个数字0，则打印出零，其他的数字是0的情况再做判断
	     {
	       for(k=j;k<str.length();k++)//这个for循环的作用是判断0的后面是否还有不是0的数字，如果后面都是0则不打印“零”出来，否则打印出“零”
	       {
	        if(str.charAt(k)!='0')
	        {
	          bln2=false;
	        }
	        }
	       if (j == (str.length() - 1)) //这个判断的作用是判断现在取到的这个0是否是最后一位，如果是最后一位则不打印，如10，只打印出十
	       {
	            bln2 = true;
	        }
	        else if (str.charAt(j+1) == '0') //这个判断的作用是有连续的0只打印出一个“零”如10001，只打印出一万零一
	        {
	            bln2 = true;
	        }
	        if(!bln2)//根据上面所有的判断情况的结果得到最后的一个结果
	          bln = true;
	        else
	          bln = false;
	       }

	     if(bln)
	     {
	       switch (a1) {
	         case '1':
	           aa += "一";
	           break;
	         case '2':
	           aa += "二";
	           break;
	         case '3':
	           aa += "三";
	           break;
	         case '4':
	           aa += "四";
	           break;
	         case '5':
	           aa += "五";
	           break;
	         case '6':
	           aa += "六";
	           break;
	         case '7':
	           aa += "七";
	           break;
	         case '8':
	           aa += "八";
	           break;
	         case '9':
	           aa += "九";
	           break;
	         case '0':
	           aa += "零";
	           break;
	       }
	     }
	       if(a1=='0'){}
	       else
	       switch (m)
	       {
	         case 6:
	           aa += "十万";
	           break;

	         case 5:
	           aa += "万";
	           break;

	         case 4:
	           aa += "千";
	           break;
	         case 3:
	           aa += "百";
	           break;
	         case 2:
	           aa += "十";
	           break;
	         case 1:
	           aa = aa;
	           break;
	       }
	    m--;
	 }
	   return aa;
	 }


	 
	 

}
