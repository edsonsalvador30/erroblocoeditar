window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Eds = window.blockly.js.blockly.Eds || {};

/**
 * eds
 */
window.blockly.js.blockly.Eds.Executar = function() {
}

/**
 * eds
 */
window.blockly.js.blockly.Eds.teste = function() {
	this.cronapi.screen.changeValueOfField("Disciplinas.active.disciplinas",
			this.cronapi.dateTime.incYear(null, 0));
	this.cronapi.chart.createChart("", 'line', null, null, null);
}

/**
 * eds
 */
window.blockly.js.blockly.Eds.teste2 = function() {
	this.cronapi.screen.changeValueOfField("Disciplinas.active.disciplinas",
			null);
	this.cronapi.chart.createChart("", 'line', null, null, null);
}
