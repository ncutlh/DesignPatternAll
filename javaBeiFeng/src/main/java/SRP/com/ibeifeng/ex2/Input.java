package SRP.com.ibeifeng.ex2;

import java.util.Scanner;

public class Input {
	private String username;
	private String upassword;

	//获得客户端输入
	public void shuru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		username = scanner.nextLine();
		System.out.println("请输入密码");
		upassword = scanner.nextLine();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
}
