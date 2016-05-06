package br.com.moccastudio.model.classe;

/**
 * Esta classe contem todos os atributos de um produto
 *
 * @author MACIEL
 */
public class Produto {

    //criando os atributos da classe
    private long idProduto;
    private String nomeDoProduto;
    private String codigoDeBarra;
    private String descricaoDoProduto;

    /**
     * @return the idProduto
     */
    public long getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeDoProduto
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     * @param nomeDoProduto the nomeDoProduto to set
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     * @return the codigoDeBarra
     */
    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    /**
     * @param codigoDeBarra the codigoDeBarra to set
     */
    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    /**
     * @return the descricaoDoProduto
     */
    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    /**
     * @param descricaoDoProduto the descricaoDoProduto to set
     */
    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    //Este metodo exibe os produtos que foram cadastrados
    public void Exibe() {
        System.out.println("Produto Cadastrado com sucesso!");
    }//fim do metodo exibe

    //Criando o contrutor principal
    public Produto(String nome, String codigo, String descricao) {
        idProduto = idProduto + 1;
        nomeDoProduto = nome;
        codigoDeBarra = codigo;
        descricaoDoProduto = descricao;

    }
}
