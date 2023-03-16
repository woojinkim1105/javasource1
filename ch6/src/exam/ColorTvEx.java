package exam;
//ColorTv는 Tv 상속 받아서 작성
public class ColorTvEx extends Tv {

	
	public ColorTvEx(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		
		
		
		//실행결과
		//32인치, 1024컬러

	}

}
