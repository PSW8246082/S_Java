package com.kh.day09.objectpkg;



class Rect {
	int width, height;
	
	public Rect() {
		
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	//두개의 값을 비교해야할 때 1  (위에 equals를 재정의(오버라이딩) 한것)
	public boolean eqauls(Object obj) {
		
		Rect r = (Rect)obj;   //다운개스팅
		if(width*height == r.width*height) {
			return true;
		} else {
			return false;
		}

	}
	
}





public class Exam_RectEquals {
	
	
	public static void main(String[] args) {
		
		 
		Rect rect1 = new Rect(2, 3);
		Rect rect2 = new Rect(2, 3);
		
		if(rect1 == rect2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
		//두개의 값을 비교하기 때문에 값 비교 못함
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
		//두개의 값을 비교해야할 때 2 
		if(rect1.eqauls(rect2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
		
		
	}

}
