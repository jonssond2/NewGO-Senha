public class Senha {
    private String conteudo;



    public boolean IsValid(String senhaCandidata) {
        //   String especiais[] = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "{", "}", "?"};
        char[] caracteresSenha = senhaCandidata.toCharArray();
        int numMaiusculas = 0;
        int numMinusculas = 0;
        int numNumeros = 0;
        int numEspeciais = 0;
        if (senhaCandidata.length() < 10 || senhaCandidata.length() > 30) {
            return false;
        }
        for (int i = 0; i < senhaCandidata.length(); i++){
            int ascii = (int) caracteresSenha[i];
            if (ascii >= 34 && ascii <= 64) {
                numEspeciais++;
            }
            else if (ascii >= 65 && ascii <= 90) {
                numMaiusculas++;
            }
            else if (ascii >= 97 && ascii <= 122) {
                numMinusculas++;
            }
            else if (ascii >= 48 && ascii <= 57) {
                numNumeros++;
            } else {
                return false;
            }
        }
        return !(numMinusculas == 0 || numMaiusculas == 0 || numNumeros == 0 || numEspeciais == 0);
    }

    public Senha(String conteudo) {
        if(IsValid(conteudo)){
            this.conteudo = conteudo;
            System.out.println("Senha criada com sucesso.");
        }
        else {
            System.out.println("Senha inválida. Por favor cumpra os requisitos mínimos.");
        }
    }

    public Int passwordStrength(String senha){
        int points;
        int extraPoints = 0;
        if (senha.length() == 10) {
            points = 75;
        } else if (senha.length() == 30) {
            points = 100;
        }
        for (int i = 0; i < senha.length(); i++) {
            extraPoints++;
        }
    }

    public void setConteudo(java.lang.String conteudo) {
        this.conteudo = conteudo;
    }
}
