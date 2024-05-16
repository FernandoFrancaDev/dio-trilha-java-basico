import Excecoes2.CpfInvalidoException;

public class CpfExemplo {

    public static void main(String[] args) {
        try{
        String cpfFormatado = formatarCpf("00000000000");
        System.out.println(cpfFormatado);
        }catch(CpfInvalidoException c){
            System.out.println("CPF precisa ter 11 digitos");

        }       

    }
    static String formatarCpf(String cpf) throws CpfInvalidoException {
        if(cpf.length() !=11)
        throw new CpfInvalidoException();
        return "139.190.478-85";

    }
    
}
