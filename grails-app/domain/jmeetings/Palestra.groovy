package jmeetings

class Palestra {

	static hasMany = [inscricoes:Inscricao, avaliacoes:Avaliacao]
	static belongsTo = Inscricao
	
    String dataSubmissao
    //dados do palestrante
    String nome
    String email
    String celular
    String curriculo
    
    //dados da palestra
    String titulo
    String topicos
    String nivel
    String recursos

    Boolean aprovada = true

    static constraints = {
    }

	String toString(){
		"${titulo}"
	}

    static List buscarAprovadas(){
        Palestra.findAll("from Palestra p where p.aprovada = :aprovada", ["aprovada":true])
    }
}
