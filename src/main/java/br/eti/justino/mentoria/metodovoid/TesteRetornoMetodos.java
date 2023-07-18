package br.eti.justino.mentoria.metodovoid;

public class TesteRetornoMetodos {


    public static void main(String[] args) {
     TesteRetornoMetodos testeRetornoMetodos = new TesteRetornoMetodos();

     testeRetornoMetodos.blablabla();
     testeRetornoMetodos.retornaProcessa();
     testeRetornoMetodos.blablabla();

        /**
         *  Conclusão:
         *      Não precisamos usar o retorno do método, pois vai seguir o código mesmo sem utilizar, vai da
         *      regra de negocio e necessidade do desenvolvedor se vai ou não utilizar o retorno do método.
         */
    }


    private void blablabla(){
        processa();
    }

    private String retornaProcessa(){
        return processa();
    }

    private String processa(){
        return "aaaaa";
    }

}
