import matplotlib.pyplot as plt

# Quantidade de caracteres
caracteres = [26, 104, 520, 1040, 5200, 10400]

# Tempos de compressão (s)
compressao = {
    "Bloco único": [0.0000042, 0.0000105, 0.000039, 0.000085, 0.000215, 0.000319],
    "Sem repetição": [0.0000108, 0.0000280, 0.000115, 0.000248, 0.000460, 0.000807],
    "Alta repetição": [0.0000047, 0.0000090, 0.000040, 0.000072, 0.000175, 0.000267],
    "Repetição parcial": [0.0000052, 0.0000130, 0.000041, 0.000102, 0.000197, 0.000321]
}

# Tempos de descompressão (s)
descompressao = {
    "Bloco único": [0.0000048, 0.000011, 0.000028, 0.000052, 0.000092, 0.000158],
    "Sem repetição": [0.0000115, 0.000035, 0.000133, 0.000280, 0.000670, 0.000940],
    "Alta repetição": [0.0000047, 0.000010, 0.000023, 0.000045, 0.000079, 0.000131],
    "Repetição parcial": [0.0000053, 0.000013, 0.000029, 0.000058, 0.000151, 0.000280]
}

# --- Gráfico de Compressão ---
plt.figure(figsize=(10, 5))
for tipo, tempos in compressao.items():
    plt.plot(caracteres, tempos, marker='o', label=tipo)
plt.xlabel("Quantidade de caracteres")
plt.ylabel("Tempo de compressão (s)")
plt.title("Tempo de Compressão por Tipo de Entrada")
plt.xticks(caracteres)  # força mostrar exatamente os valores
plt.grid(True)
plt.legend()
plt.show()

# --- Gráfico de Descompressão ---
plt.figure(figsize=(10, 5))
for tipo, tempos in descompressao.items():
    plt.plot(caracteres, tempos, marker='o', label=tipo)
plt.xlabel("Quantidade de caracteres")
plt.ylabel("Tempo de descompressão (s)")
plt.title("Tempo de Descompressão por Tipo de Entrada")
plt.xticks(caracteres)  # força mostrar exatamente os valores
plt.grid(True)
plt.legend()
plt.show()
