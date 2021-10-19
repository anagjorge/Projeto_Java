package Projeto3;
import java.util.Scanner;
import java.util.ArrayList;
public class cadastroUsuario {
	public static void main(String[] args) throws InterruptedException {
		informacoesUsuario info = new informacoesUsuario();
		Scanner leia = new Scanner (System.in);
		ArrayList<String> lista = new ArrayList<String>();
		int resposta;
			    lista.add("\nAciclovir");
		        lista.add("\n�cido valpr�ico");
		        lista.add("\nAlbendazol");
		        lista.add("\nAmitriptilina");
		        lista.add("\nAmoxicilina");
		        lista.add("\nAnlodipino");
		        lista.add("\nBenzilpenicilina benzatina");
		        lista.add("\nBenzilpenicilina proca�na + benzilpenicilina pot�ssica");
		        lista.add("\nBiperideno");
		        lista.add("\nCaptopril");
		        lista.add("\nCarbamazepina");
		        lista.add("\nCarbonato de L�tio");
		        lista.add("\nCefalexina");
		        lista.add("\nClomipramina");
		        lista.add("\nClonazepam");
		        lista.add("\nClorpromazina");
		        lista.add("\nDexametasona");
		        lista.add("\nDiazepam");
		        lista.add("\nDigoxina");
		        lista.add("\nDipirona");
		        lista.add("\nEnalapril");
		        lista.add("\nFenito�na");
		        lista.add("\nFenobarbital");
		        lista.add("\nFurosemida");
		        lista.add("\nFluoxetina");
		        lista.add("\nGlibenclamida");
		        lista.add("\nHaloperidol");
		        lista.add("\nHidroclorotiaziada");
		        lista.add("\nHidr�xido de Alum�nio");
		        lista.add("\nIbuprofeno");
		        lista.add("\nLoratadina");
		        lista.add("\nMetformina");
		        lista.add("\nMetildopa");
		        lista.add("\nMetronidazol");
		        lista.add("\nMiconazol");
		        lista.add("\nNitrofutanto�na");
		        lista.add("\nOmeprazol");
		        lista.add("\nParacetamol");
		        lista.add("\nPrometazina");
		        lista.add("\nPropranolol");
		        lista.add("\nRivotril");
		        lista.add("\nSais para reidrata��o oral");
		        lista.add("\nSalbutamol");
		        lista.add("\nSertralina");
		        lista.add("\nSulfanetoxazol + Trimetroprima");
		        lista.add("\nSertralina");
		        
		System.out.println("     |-----------------------------------------------------------------------"
		+"-------|\n     |                                   ClickUBS                                   |\n"
		+"     |------------------------------------------------------------------------------|\n\n");
		System.out.println("Digite aqui seu nome completo:"
		+" (Apenas letras mai�sculas e min�sculas, sem s�mbolos ou n�meros)");	
		info.setNomeUsuario(leia.nextLine()) ;
		
		System.out.println("Digite a sua idade: ");
		info.setIdadeUsuario(leia.nextInt());
		while(info.getIdadeUsuario()<=0||info.getIdadeUsuario()>120) {
			System.out.println("Por favor, digite uma idade v�lida");
			System.out.println("Digite a sua idade:");
			info.setIdadeUsuario(leia.nextInt());	        
		}
		System.out.println("Digite o seu CPF(Cadastro de Pessoas F�sicas): (Somente n�meros)");
		info.setCpfUsuario(leia.next());
		while(info.getCpfUsuario().length() != 11) {
			System.out.println("Por favor, digite o CPF corretamente");
			System.out.println("Digite o seu CPF(Cadastro de Pessoas F�sicas): (Somente n�meros)");
			info.setCpfUsuario(leia.next());	        
		}
			
		System.out.println("\nNome: "+info.getNomeUsuario());
		System.out.println("Idade: "+info.getIdadeUsuario()+" anos");
		System.out.println("CPF: "+info.getCpfUsuario());
		
		System.out.println("\nOs rem�dios dispon�veis s�o: ");
		        
		System.out.println(lista);
			do {
				System.out.println("\nSeu rem�dio encontra-se na lista?"
						+ "\n(Caso sim digite 1, caso n�o digite 2) ");
				resposta = leia.nextInt();
				if(resposta == 1) {
					System.out.println("Dirija-se ao posto com os seguintes documentos:"
							+"\n RG, CPF e a receita do seu m�dico");
				}
				else if(resposta == 2) {
					System.out.println("Digite o nome do rem�dio desejado: ");
					info.setRemedio(leia.next());
					System.out.println("Digite agora seu email para contato: ");
					info.setEmailUsuario(leia.next());
					System.out.println("Ok, agora entraremos em contato com o email '"+info.getEmailUsuario()
					+"' e lhe enviaremos um aviso caso a medica��o '"+info.getRemedio()+"' entre em estoque!");
					System.out.println("(Retornaremos a resposta em at� 30 dias �teis)");
				}
				else if(resposta != 1 && resposta != 2) {
					System.out.println("Op��o inv�lida, digite novamente");
				}
			} while (resposta != 1 && resposta != 2);
			Thread.sleep(3000);
			System.out.println("\nObrigado por usar nosso App!!");
		leia.close();
	}
}