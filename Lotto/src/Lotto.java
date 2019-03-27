public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ζ� ��ȣ�� 1 ~ 45 ������ ���� 6�� + ���ʽ� ��ȣ 1���� ����
		//�ߺ����� ������ ����
		
		//int Ÿ��, ũ��� 7�� �迭 ����
		int Lotto[] = new int[7];
		System.out.println("�ζ� ��ȣ ������");
		
		//Math.random() �޼ҵ带 �̿��ؼ� ������ �� ����
		//Math.random()�� ���ϰ��� double�̹Ƿ� (int)�� ĳ����
		//Math.random()�� 0 ~ 1�̸� ������ ���̹Ƿ� �ζ� ������ ��ȣ�� 45�� �����ϱ� ���� * 45, + 1�� ��
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random() * 45) + 1;
			
			//�ߺ��� ���� ������
			//���� : Lotto[0] == Lotto[1]�� ���� �� ��, �ݺ�
			//���� ���ϴ� �� �迭�� ���� �ߺ��ȴٸ�, i-- �ϰ� break�� ���� �ռ� for������ �ǵ��ư�
			for(int j = 0; j < i; j++) {
				if(Lotto[j] == Lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		//�ζ� ��ȣ(�迭 �ε��� 0 ~ 5���� 6��)�� �����ϱ� ���� Lotto.length - 1
		//�迭 ������ �ڸ��� Lotto[6]�� ���ʽ� ��ȣ�� ���
		for(int i = 0; i < Lotto.length - 1; i++) {
			System.out.print("[" + Lotto[i] + "]");
		}
		
		System.out.println();
		System.out.println("���ʽ� ��ȣ�� " + "[" + Lotto[6] + "]" + "�Դϴ�.");
	}//main end
}//class end