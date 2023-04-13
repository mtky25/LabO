class Fruta:
    def __init__ (self, nome,cor , forma, peso):
        self.nome = nome
        self.cor = cor
        self.forma = forma
        self.peso = peso

    def descreve(self):
        print(f"A {self.nome} tem cor {self.cor}, forma {self.forma} e peso {self.peso}g")




class Bola:
    def __init__(self, nome, cor):
        self.nome = nome
        self.cor = cor

        def descreve(self):
            print("Está bola tem nome {self.nome} e cor {self.cor}")






def main():
    banana = Fruta('banana','amarela','alongada',300)
    maça1 = Fruta('maça_1','vermelha','arredondada',200)
    maça2 = Fruta('maça_2',"verde",'arredondada',200)


    print(banana.nome,maça1.nome,maça2.nome)
    banana.descreve()
    maça1.descreve()
    maça2.descreve()
    
    bola = Bola('Jabulani','Branca e Azul')

main()
    