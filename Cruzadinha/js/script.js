// A javascript-enhanced crossword puzzle [c] Jesse Weisbeck, MIT/GPL 
(function($) {
	$(function() {
		var puzzleData = [
			 	{
					clue: "A __________, também conhecida como memória auxiliar, tem como função armazenar grandes quantidades de informações",
					answer: "memoriademassa",
					position: 0,
					orientation: "across",
					startx: 2,
					starty: 1
				},
			 	{
					clue: "Processador que normalmente utiliza quatro nucleos são chamados de _________.",
					answer: "quadcore",
					position: 0,
					orientation: "across",
					startx: 7,
					starty: 8
				},
				{
					clue: "Conjunto de fios que conectam a CPU à memória principal usada para identificar endereços na memória principal",
					answer: "addressbus",
					position: 0,
					orientation: "across",
					startx: 6,
					starty: 15
				},
				{
					clue: "Permite que certos dispositivos de hardware em um computador acessem a memória do sistema para leitura e escrita independentemente da CPU.",
					answer: "dma",
					position: 0,
					orientation: "across",
					startx: 6,
					starty: 6
				},
				{
					clue: "Processador que normalmente utiliza dois nucleos são chamados de _________.",
					answer: "dualcore",
					position: 0,
					orientation: "down",	
					startx: 10,
					starty: 8
				},
				{
					clue: "Tecnologia que permite o acesso aos arquivos armazenados no computador, porém não armazena conteúdos permanentemente",
					answer: "ram",
					position: 0,
					orientation: "down",
					startx: 1,
					starty: 4
				},
				{
					clue: "Também conhecido como memória RAM os ____________ de uma CPU armazenam bits.",
					answer: "registradores",
					position: 0,
					orientation: "across",
					startx: 1,
					starty: 4
				},
				{
					clue: "Chip de memória de computador que mantém informações armazenadas sem a necessidade de uma fonte de energia.",
					answer: "flash",
					position: 0,
					orientation: "across",
					startx: 9,
					starty: 11
				},
				{
					clue: "Memórias cujo conteúdo é gravado permanentemente...",
					answer: "rom",
					position: 0,
					orientation: "down",
					startx: 12,
					starty: 7
				},
				{
					clue: "Unidade central de processamento que  também  é conhecida como processador que realiza as instruções de um programa de computador.",
					answer: "cpu",
					position: 0,
					orientation: "down",
					startx: 14,
					starty: 13
				},
				{
					clue: "Memória programável apagável somente de leitura é um tipo de chip de memória de computador que mantém seus dados quando a energia é desligada.",
					answer: "eprom",
					position: 0,
					orientation: "down",
					startx: 10,
					starty: 1
				},
				{
					clue: "Circuito digital que realiza operações lógicas e aritméticas, parte extremamente essencial da CPU.",
					answer: "ula",
					position: 0,
					orientation: "down",
					startx: 6,
					starty: 13
				},
				{
					clue: "Sistema de comunicação que transfere dados entre componentes dentro de um computador ou entre computadores",
					answer: "databus",
					position: 0,
					orientation: "down",
					startx: 8,
					starty: 3
				},
				{
					clue: "Processador da Intel lançado em setembro de 2009. Seu primeiro modelo trabalha com uma frequência de 2660 MHz a 3.467 MHz e 4 núcleos!",
					answer: "i5",
					position: 0,
					orientation: "down",
					startx: 7,
					starty: 1
				},
				{
					clue: "Processador da Intel lançado em Novembro de 2008. Seu primeiro modelo trabakha com uma frequência de 2660 MHz a 4000 MHz e 4 núcleos!",
					answer: "i7",
					position: 0,
					orientation: "down",
					startx: 4,
					starty: 4
				},
				{
					clue: "linha de controle na eletrônica digital usada para selecionar um dos circuitos integrados dentre vários conectados ao mesmo barramento de computador, geralmente utilizando a lógica de três estados.",
					answer: "cs",
					position: 0,
					orientation: "down",
					startx: 13,
					starty: 3
				}
			] 
		$('#puzzle-wrapper').crossword(puzzleData);	
	})
})(jQuery)
