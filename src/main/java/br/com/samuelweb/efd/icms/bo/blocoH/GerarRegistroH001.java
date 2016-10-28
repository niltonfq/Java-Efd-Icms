package br.com.samuelweb.efd.icms.bo.blocoH;
import br.com.samuelweb.efd.icms.registros.blocoH.RegistroH001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroH001 {
	
	public static StringBuilder gerar(RegistroH001 registroH001, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroH001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroH001.getInd_mov()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
