public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또 번호는 1 ~ 45 사이의 숫자 6개 + 보너스 번호 1개로 구성
		//중복값이 허용되지 않음
		
		//int 타입, 크기는 7인 배열 생성
		int Lotto[] = new int[7];
		System.out.println("로또 번호 생성기");
		
		//Math.random() 메소드를 이용해서 임의의 값 추출
		//Math.random()의 리턴값이 double이므로 (int)로 캐스팅
		//Math.random()은 0 ~ 1미만 사이의 값이므로 로또 마지막 번호인 45를 추출하기 위해 * 45, + 1을 함
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random() * 45) + 1;
			
			//중복값 제거 루프문
			//시작 : Lotto[0] == Lotto[1]의 값을 비교 후, 반복
			//만약 비교하는 각 배열의 값이 중복된다면, i-- 하고 break를 통해 앞선 for문으로 되돌아감
			for(int j = 0; j < i; j++) {
				if(Lotto[j] == Lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		//로또 번호(배열 인덱스 0 ~ 5까지 6개)를 추출하기 위해 Lotto.length - 1
		//배열 마지막 자리인 Lotto[6]은 보너스 번호로 사용
		for(int i = 0; i < Lotto.length - 1; i++) {
			System.out.print("[" + Lotto[i] + "]");
		}
		
		System.out.println();
		System.out.println("보너스 번호는 " + "[" + Lotto[6] + "]" + "입니다.");
	}//main end
}//class end