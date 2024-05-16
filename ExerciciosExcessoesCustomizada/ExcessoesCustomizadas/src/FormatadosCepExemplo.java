import Excecoes2.CepInvalidoException;

public class FormatadosCepExemplo {
    public static void main(String[] args) {   
        try {
            String cepFormatado = formatarCep("11111064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();
        return "23.765-064";
    }
    
}
