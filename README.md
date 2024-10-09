# Encurtador de Url (N2)
 Projeto N2 - Encurtador de Url


## Execução:
 Dentro do InteliJ execute o arquivo: DemoApplication.java <br>
 Utilize o Navegador para as requisições GET e o Postman para as requisições POST

 ## Métodos:
- **/encurtar** <br>
Descrição: Encurta uma Url dada pelo cliente, retorna a Url encurtada e a original <br>
Exemplo: No navegador digite: http://localhost:8080/encurtar?url=https://www.exemplo.com no campo de endereço <br>
Resposta: <br>
![image](https://github.com/user-attachments/assets/75d11122-23ff-4d5e-a7ac-041e31e4bdfc)
<br>

- **/sobre** <br>
Descrição: Retorna informações básicas <br>
Uso: http://localhost:8080/sobre <br>
Resposta: <br>
![image](https://github.com/user-attachments/assets/cdc679e1-e52e-4eef-b6cf-00eab8b9731e)
<br>

- **Utilizando Postman** <br>
Descrição: Encurta uma Url dada utilizando postman, retorna a Url encurtada<br>
Exemplo: Utilize a opção POST e o método /encurtar adicionando um corpo json com o parâmetro "url" como na imagem abaixo <br>
![image](https://github.com/user-attachments/assets/c791101b-2540-4784-918c-45d497c1c9ee)

Resposta Esperada: <br>
![image](https://github.com/user-attachments/assets/f486eb1a-ec90-4774-bd73-ba05c57f26fe)
<br>

