DROP TABLE IF EXISTS tarefas;
CREATE TABLE tarefas (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  titulo VARCHAR(250) NOT NULL,
  descricao VARCHAR(400) NOT NULL,
  data_final DATETIME DEFAULT NULL
);

INSERT INTO tarefas (titulo, descricao, data_final) VALUES
('Aprender springboot', 'Criar projeto com springboot e banco de dados h2 para aprender sobre a tecnologia.', '2021-08-15 14:50:00'),
('Criar API REST', 'Criar API REST com Java utilizando modelos', '2021-08-15 15:00:00')