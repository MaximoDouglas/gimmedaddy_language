package br.ufal.ic.compilator.model;

import java.util.HashMap;
import java.util.Map;

public class TokenService {

	
	private static Map<Categories, String> expressoesECategorias = new HashMap<Categories, String>();
	private static Map<String, Categories> reservedWords = new HashMap<String, Categories>();

	public static void fillExpressions () {
		expressoesECategorias.put(Categories.ID, "[a-zA-Z_][a-zA-Z0-9_]{0,30}");
		expressoesECategorias.put(Categories.PONT_VIRG, "[;]"); 
		expressoesECategorias.put(Categories.VIRGULA, "[,]"); 
		expressoesECategorias.put(Categories.AB_PARENTE, "[(]"); 
		expressoesECategorias.put(Categories.FE_PARENTE, "[)]");
		expressoesECategorias.put(Categories.AB_CHAVE, "[{]"); 
		expressoesECategorias.put(Categories.FE_CHAVE, "[}]"); 
		expressoesECategorias.put(Categories.OPR, "!=|<=|<|>=|>|==");
		expressoesECategorias.put(Categories.ATRIBUICAO, "[=]");
		expressoesECategorias.put(Categories.CTE_CAD_CH, "(\"\")|(\"[^\\n]*\")");
		expressoesECategorias.put(Categories.CTE_CHAR, "('\\\\'')|('[^\\n]{0,1}')"); 
		expressoesECategorias.put(Categories.CTE_FLOAT, "(\\d+\\.(\\d)*)|((\\d)*\\.\\d+)"); 
		expressoesECategorias.put(Categories.CTE_INT, "\\d+"); 
		expressoesECategorias.put(Categories.CTE_BOOL, "true|false"); 
		expressoesECategorias.put(Categories.OPA_NEGA, "[-]"); 
		expressoesECategorias.put(Categories.AB_COLCHET, "\\["); 
		expressoesECategorias.put(Categories.FE_COLCHET, "\\]"); 
		expressoesECategorias.put(Categories.TIPO_INT, "int"); 
		expressoesECategorias.put(Categories.TIPO_FLOAT, "float"); 
		expressoesECategorias.put(Categories.TIPO_BOOL, "boolean"); 
		expressoesECategorias.put(Categories.TIPO_CHAR, "char"); 
		expressoesECategorias.put(Categories.TIPO_VOID, "void"); 
		expressoesECategorias.put(Categories.OP_CONC, "\\+\\+"); 
		expressoesECategorias.put(Categories.OPA_AD, "[+|-]"); 
		expressoesECategorias.put(Categories.OPA_MULT, "[*|/]"); 
		expressoesECategorias.put(Categories.OPL_OU, "\\|"); 
		expressoesECategorias.put(Categories.OPL_E, "[&]"); 
		expressoesECategorias.put(Categories.OPL_NAO, "[!]");
		expressoesECategorias.put(Categories.RETURN, "return");
		expressoesECategorias.put(Categories.IF, "if");
		expressoesECategorias.put(Categories.ELSE, "else"); 
		expressoesECategorias.put(Categories.IN, "in");
		expressoesECategorias.put(Categories.FOR, "for"); 
		expressoesECategorias.put(Categories.WHILE, "while"); 
		expressoesECategorias.put(Categories.READ, "read"); 
		expressoesECategorias.put(Categories.PRINT, "print"); 
		expressoesECategorias.put(Categories.TK_ER_STR, "\"");
		expressoesECategorias.put(Categories.TK_ER_CH, "'");
		expressoesECategorias.put(Categories.TK_ER_NID, "\\S");
		
		reservedWords.put("true", Categories.CTE_BOOL);
		reservedWords.put("false", Categories.CTE_BOOL);
		reservedWords.put("int", Categories.TIPO_INT); 
		reservedWords.put("float", Categories.TIPO_FLOAT ); 
		reservedWords.put("boolean", Categories.TIPO_BOOL ); 
		reservedWords.put("char", Categories.TIPO_CHAR ); 
		reservedWords.put("void", Categories.TIPO_VOID );
		reservedWords.put("return", Categories.RETURN );
		reservedWords.put("else", Categories.ELSE ); 
		reservedWords.put("for", Categories.FOR); 
		reservedWords.put("while", Categories.WHILE ); 
		reservedWords.put("read", Categories.READ ); 
		reservedWords.put("print", Categories.PRINT ); 
		reservedWords.put("if", Categories.IF);
		reservedWords.put("in", Categories.IN);
	}

	public static Map<Categories, String> getExpressions(){
		return expressoesECategorias;
	}
	
	public static Map<String, Categories> getReserved(){
		return reservedWords;
	}
}
