package zxt;

public class object {

	 String change(int i)
	  {
	   String aa="";
	   String str=String.valueOf(i);//������ת��Ϊ�ַ���
	   int n=str.length();//ȡ����
	   int m = n,k;
	   boolean bln = true;
	   boolean bln2=true;
	   for(int j=0;j<n;j++)
	   {
	     char a1 = str.charAt(j);//ȡÿ������
	     if((n!=1)&a1=='0')//��(n!=1)��ԭ�������ֻ��һ������0�����ӡ���㣬������������0����������ж�
	     {
	       for(k=j;k<str.length();k++)//���forѭ�����������ж�0�ĺ����Ƿ��в���0�����֣�������涼��0�򲻴�ӡ���㡱�����������ӡ�����㡱
	       {
	        if(str.charAt(k)!='0')
	        {
	          bln2=false;
	        }
	        }
	       if (j == (str.length() - 1)) //����жϵ��������ж�����ȡ�������0�Ƿ������һλ����������һλ�򲻴�ӡ����10��ֻ��ӡ��ʮ
	       {
	            bln2 = true;
	        }
	        else if (str.charAt(j+1) == '0') //����жϵ���������������0ֻ��ӡ��һ�����㡱��10001��ֻ��ӡ��һ����һ
	        {
	            bln2 = true;
	        }
	        if(!bln2)//�����������е��ж�����Ľ���õ�����һ�����
	          bln = true;
	        else
	          bln = false;
	       }

	     if(bln)
	     {
	       switch (a1) {
	         case '1':
	           aa += "һ";
	           break;
	         case '2':
	           aa += "��";
	           break;
	         case '3':
	           aa += "��";
	           break;
	         case '4':
	           aa += "��";
	           break;
	         case '5':
	           aa += "��";
	           break;
	         case '6':
	           aa += "��";
	           break;
	         case '7':
	           aa += "��";
	           break;
	         case '8':
	           aa += "��";
	           break;
	         case '9':
	           aa += "��";
	           break;
	         case '0':
	           aa += "��";
	           break;
	       }
	     }
	       if(a1=='0'){}
	       else
	       switch (m)
	       {
	         case 6:
	           aa += "ʮ��";
	           break;

	         case 5:
	           aa += "��";
	           break;

	         case 4:
	           aa += "ǧ";
	           break;
	         case 3:
	           aa += "��";
	           break;
	         case 2:
	           aa += "ʮ";
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
