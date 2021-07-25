
public class OlaGit {

	public static void main(String[] args) {
		mensagem msg = new mensagem();
		System.out.println(msg.getMensagem());
	}

}


	
class mensagem{
	
	String mensagem = "Teste de primeiro versionamento de projeto";
	
	public String getMensagem() {
		return mensagem;
	}
	
	
}