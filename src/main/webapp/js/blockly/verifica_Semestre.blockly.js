window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.VerificaSemestre = window.blockly.js.blockly.VerificaSemestre
		|| {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.VerificaSemestre.editar_registro = function() {
  debugger;
	var novoCampo, escopo;
	this.cronapi.screen.startEditingMode("Aluno");
	debugger;
	this.cronapi.screen.createScopeVariable('Valor_Inicial',
			this.cronapi.screen.getValueOfField("Aluno.active.semestre"));
}

/**
 * verifica_Semestre
 */
window.blockly.js.blockly.VerificaSemestre.Compara_Valores = function() {

	var novoCampo, escopo;
	escopo = this.cronapi.screen.getScopeVariable('Valor_Inicial');
	novoCampo = this.cronapi.screen.getValueOfField("Aluno.active.semestre");
	if (escopo == novoCampo) {
		this.cronapi.screen.disableComponent("SalvarBTN");
	} else {
		this.cronapi.screen.enableComponent("SalvarBTN");
	}
}

/**
 * verifica_Semestre
 */
window.blockly.js.blockly.VerificaSemestre.desabilita_Botao = function() {

	var novoCampo, escopo;
	escopo = this.cronapi.screen.getScopeVariable('Valor_Inicial');
	novoCampo = this.cronapi.screen.getValueOfField("Aluno.active.nome");
	this.cronapi.screen.notify('success', [escopo, '------', novoCampo]
			.join(''));
}

/**
 * verifica_Semestre
 */
window.blockly.js.blockly.VerificaSemestre.Obter_Valor_Inicial = function() {

	var novoCampo, escopo;
			debugger;
	this.cronapi.screen.createScopeVariable('Valor_Inicial',
			this.cronapi.screen.getValueOfField("Aluno.active.semestre"));
}
