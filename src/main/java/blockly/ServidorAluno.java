package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ServidorAluno {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ServidorAluno
	public static Var Testando_Erro() throws Exception {
		return new Callable<Var>() {

			private Var teste1 = Var.VAR_NULL;
			private Var teste2 = Var.VAR_NULL;

			public Var call() throws Exception {
				teste1 = Var.VAR_NULL;
				teste2 = Var.VAR_NULL;
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var fa_C3_A7a_algo() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.VAR_NULL;
			}
		}.call();
	}

}
