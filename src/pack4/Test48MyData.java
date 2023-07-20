package pack4;

import java.io.Serializable;   // binary(이진) 처리, 네트웍을 통해 데이터를 송수신할 때 많이 사용

public class Test48MyData implements Serializable{
	int number = 100;
	double weight = 78.9;
	String irum = "홍길동";
	String juso = "역삼13동";
}
