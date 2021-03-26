CREATE VIEW `doadores_view` AS
SELECT `id`, `nome`, `cpf`, `rg` ,
timestampdiff(YEAR, str_to_date(`data_nasc`, '%d/%m/%Y'),now()) as `idade` , 
	   `sexo`, `mae`, `pai`, `email`, `cep`, `endereco`, `numero`, 
	   `bairro`, `cidade`, `estado`, `telefone_fixo`, `celular`, `peso`,
round( `peso` / pow(`altura`,2 ),2) AS `IMC`, `tipo_sanguineo`
FROM `doador`;
