
public class Amazon_StringQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Ma!!!ke ea@#$ch da@@@y co*%^unt";
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<=sb.length()-3;i++){
		      if(sb.substring(i,i+3).equals("!!!")){
		    	  sb.replace(i, i+3,"^%*");
		          i=i+2;
		      }
		      if(sb.substring(i,i+3).equals("@#$")){
		          sb.replace(i, i+3,"@@@");
		          i=i+2;
		      }
		      if(sb.substring(i,i+3).equals("@@@")){
		          sb.replace(i, i+3,"$#@");
		          i=i+2;
		      }
		      if(sb.substring(i,i+3).equals("*%^")){
		    	  sb.replace(i, i+3,"!!!");
		          i=i+2;
		      }
		  }
		System.out.println("output - "+sb.toString());
		
		str = "Yogeshfdfdr naik";
		str = str.replace("fdfd", "555511");
		System.out.println(str);
	}

}

