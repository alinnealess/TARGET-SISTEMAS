import json

caminho_arquivo_json = r"C:\Users\Alinne\Desktop\TARGET SISTEMAS\questao03python\faturamento.json"

with open(caminho_arquivo_json, 'r') as arquivo:
    dados = json.load(arquivo)
#print(dados)

# Inicializa variáveis para o menor e maior faturamento
menor_faturamento = float('inf')
maior_faturamento = float('-inf')
total_faturamento = 0
dias_com_faturamento_acima_media = 0
total_dias_com_faturamento = 0

# Itera sobre os dados para calcular os valores solicitados
for item in dados:
    valor = item['valor']
    if valor != 0:
        total_faturamento += valor
        total_dias_com_faturamento += 1
        if valor < menor_faturamento:
            menor_faturamento = valor
        if valor > maior_faturamento:
            maior_faturamento = valor

# Calcula a média mensal
media_mensal = total_faturamento / total_dias_com_faturamento

# Itera sobre os dados novamente para contar os dias com faturamento acima da média
for item in dados:
    valor = item['valor']
    if valor > media_mensal:
        dias_com_faturamento_acima_media += 1

# Exibe os resultados
print("Menor valor de faturamento:", menor_faturamento)
print("Maior valor de faturamento:", maior_faturamento)
print("Número de dias com faturamento acima da média mensal:", dias_com_faturamento_acima_media)