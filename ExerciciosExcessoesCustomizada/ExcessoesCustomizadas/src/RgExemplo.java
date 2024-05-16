import Excecoes2.RgInvalidoException;

public class RgExemplo {

    public static void main(String[] args) {
        try{
        String rgFormatado = formatarRg("111111111");
        System.out.println(rgFormatado);
        }catch(RgInvalidoException r){
            System.out.println("O RG não corresponde a regra de negócio deve ter 9 digitos");
        }      
        
    }

    static String formatarRg(String rg) throws RgInvalidoException{
        if(rg.length() != 9)
        throw new RgInvalidoException();
        return "22.771.986-4";
       
    }
    
}
