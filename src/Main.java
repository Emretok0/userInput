import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		String userName,password, select, newPassword;

		System.out.print("Kullanıcı Adı: ");
		userName = inp.nextLine();

		System.out.print("Şifre: ");
		password = inp.nextLine();

		if ( !(userName.equals("patika")) || !(password.equals("java123"))){
			System.out.print("Şifrenizi sıfırlamak ister misiniz ? (E/H): ");
			select = inp.nextLine();
			if ( select.equals("E") ){
				System.out.print("Yeni Şifre: ");
				newPassword = inp.nextLine();
				if ( (newPassword.equals(password)) || (newPassword.equals("java123")) ){
					System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz !");
				}else{System.out.println("Şifre oluşturuldu.");}
			}else{System.out.println("Çıkılıyor...");}
		}else{System.out.println("Giriş başarılı !");}
	}
}
